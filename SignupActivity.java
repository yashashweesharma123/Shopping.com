package test.ojassoft.com.ys;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class SignupActivity extends AppCompatActivity {
    private static final String TAG = "SignupActivity";

    @InjectView(R.id.input_name)
    EditText _nameText;
    @InjectView(R.id.input_email) EditText _emailText;
    @InjectView(R.id.input_password) EditText _passwordText;
    @InjectView(R.id.btn_signup)
    Button _signupButton;
    @InjectView(R.id.link_login)
    TextView _loginLink;
    Toolbar toolbar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        ButterKnife.inject(this);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        //toolbar.setNavigationIcon(R.drawable.ic_dehaze_black_24dp);
        // toolbar.setTitle("SHOPPING.COM");
        toolbar.setTitle("SHOPPING.COM");
        setSupportActionBar(toolbar);

        _signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isConnectedWithInternet(SignupActivity.this)) {
                    signup();
                }else
                    Toast.makeText(SignupActivity.this,"Please check your internet connection",Toast.LENGTH_LONG).show();
            }
        });

        _loginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isConnectedWithInternet(SignupActivity.this)){
                    finish();

                }else
                    Toast.makeText(SignupActivity.this,"Please check your internet connection",Toast.LENGTH_LONG).show();
                // Finish the registration screen and return to the Login activity
                //finish();
            }
        });
    }

    public void signup() {
        Log.d(TAG, "Signup");

        if (!validate()) {
            onSignupFailed();
            return;
        }

        _signupButton.setEnabled(false);

        final ProgressDialog progressDialog = new ProgressDialog(SignupActivity.this,
                R.style.AppTheme);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Creating Account...");
        progressDialog.show();

        String name = _nameText.getText().toString();
        String email = _emailText.getText().toString();
        String password = _passwordText.getText().toString();

        // TODO: Implement your own signup logic here.

        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        // On complete call either onSignupSuccess or onSignupFailed
                        // depending on success
                        onSignupSuccess();
                        // onSignupFailed();
                        progressDialog.dismiss();
                    }
                }, 3000);
    }


    public void onSignupSuccess() {
        _signupButton.setEnabled(true);
        setResult(RESULT_OK, null);
        if(isConnectedWithInternet(SignupActivity.this)) {

            Intent intent = new Intent(SignupActivity.this, OTPActivity.class);
            startActivity(intent);
            finish();
        }else
            Toast.makeText(SignupActivity.this,"Please check your internet connection",Toast.LENGTH_LONG).show();

    }

    public void onSignupFailed() {
        Toast.makeText(getBaseContext(), "Login failed", Toast.LENGTH_LONG).show();

        _signupButton.setEnabled(true);
    }

    public boolean validate() {
        boolean valid = true;

        String name = _nameText.getText().toString();
        String email = _emailText.getText().toString();
        String password = _passwordText.getText().toString();

        if (name.isEmpty() || name.length() < 3) {
            _nameText.setError("at least 3 characters");
            valid = false;
        } else {
            _nameText.setError(null);
        }

        if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            _emailText.setError("enter a valid email address");
            valid = false;
        } else {
            _emailText.setError(null);
        }

        if (password.isEmpty() || password.length() < 4 || password.length() > 10) {
            _passwordText.setError("between 4 and 10 alphanumeric characters");
            valid = false;
        } else {
            _passwordText.setError(null);
        }

        return valid;
    }
    public static boolean isConnectedWithInternet(Context context) {
        boolean _isNetAvailable = false;
        ConnectivityManager cm = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo wifiNetwork = cm
                .getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        if (wifiNetwork != null) {
            _isNetAvailable = wifiNetwork.isConnectedOrConnecting();
        }

        NetworkInfo mobileNetwork = cm
                .getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
        if (mobileNetwork != null) {
            _isNetAvailable = mobileNetwork.isConnectedOrConnecting();
        }

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        if (activeNetwork != null) {
            _isNetAvailable = activeNetwork.isConnectedOrConnecting();
        }
        return _isNetAvailable;
    }
}



