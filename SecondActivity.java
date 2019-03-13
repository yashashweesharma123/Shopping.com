//package test.ojassoft.com.ys;

//import android.app.ProgressDialog;
//import android.content.Context;
//import android.net.NetworkInfo;
//import android.os.AsyncTask;
//import android.os.Bundle;
//import android.support.design.widget.TextInputLayout;
//import android.support.v7.app.AppCompatActivity;
//import android.view.View;
//import android.widget.Button;
//import android.content.Intent;
//import android.widget.EditText;
import android.widget.ProgressBar;
//import android.widget.TextView;
//import android.support.v7.widget.Toolbar;
import android.os.Handler;
import android.net.ConnectivityManager;


import android.graphics.Typeface;

/**
 * Created by ojas-20 on 11/7/18.
 */

//public class SecondActivity extends AppCompatActivity {
   // Toolbar toolbar;
   // TextView textView;
   // TextInputLayout textInputLayout;
   // TextInputLayout textInputLayout1;
    //  TextInputLayout textInputLayout2;
   // TextInputLayout textInputLayout3;
   // EditText editText;
   // EditText editText1;
   // Context context;
  //  NetworkInfo info;
   // Context sContext;
    //final AsyncTask<Integer,Long,Boolean> asyncTask;

   // ProgressBar progressBar;
    //EditText editText2;
    //EditText editText3;

   // ProgressDialog pd;

    //Button button;
    //@Override
   // protected void onCreate(Bundle savedInstanceState) {
     //   super.onCreate(savedInstanceState);
     //   setContentView(R.layout.activity_second);
      //  toolbar=(Toolbar) findViewById(R.id.toolbar);
      //  toolbar.setTitle("SHOPPING.COM");
      //  setSupportActionBar(toolbar);
      //  textView=(TextView) findViewById(R.id.textview);
      //  textInputLayout=(TextInputLayout) findViewById(R.id.textInputLayout);
      //  textInputLayout1=(TextInputLayout) findViewById(R.id.textInputLayout1);
        // textInputLayout2=(TextInputLayout) findViewById(R.id.textInputLayout2);
     //   textInputLayout3=(TextInputLayout) findViewById(R.id.textInputLayout3);
      //  editText=(EditText) findViewById(R.id.editText);
      //  editText1=(EditText) findViewById(R.id.editText1);
        //editText2=(EditText) findViewById(R.id.editText2);
       // editText3=(EditText) findViewById(R.id.editText3);
       // progressBar=(ProgressBar) findViewById(R.id.progressbar);
      //  button=(Button) findViewById(R.id.button);

      //  pd = new ProgressDialog(SecondActivity.this);
      //  pd.setTitle("Loading Activity");
      //  pd.setMessage("Please Wait ...");
       // pd.setMax(5);
      //  pd.setIndeterminate(false);
       // pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);
      //  //AsyncTask<Integer,Long,Boolean> asyncTask=new AsyncTask(this);

      //  button.setOnClickListener(new View.OnClickListener() {
           // @Override
         //   public void onClick( final View view) {

                //}

           //    new  AsyncTask<Integer, Long, Boolean>() {


                //    @Override
                  //  protected Boolean doInBackground(Integer... params) {

                   ////     publishProgress(0L);
                   //     long start = System.currentTimeMillis();
                   //     long waitTime = params[0] * 1000;
                    //    try {
                     //       while (System.currentTimeMillis() - start < waitTime) {
                     //          Thread.sleep(500);
                     //          publishProgress(System.currentTimeMillis() - start);
                        //  }
                      //  } catch (Exception e) {
                     //     return false;
                    //   }
                    //   return true;

                  //  }

                  // @Override
                  //  protected void onProgressUpdate(Long... values) {
                  //      if (values[0] == 0) {
                        //    pd.show();
                      //  } else {
                     //       pd.setProgress((int) (values[0] / 1000));
                    //    }
              //     }

                  //  @Override
                  //  protected void onPostExecute(Boolean result) {
                  //      pd.dismiss();
                        //progressBar.setVisibility(View.VISIBLE);
                         //final Handler handler = new Handler();
                       //  handler.postDelayed(new Runnable() {
                       //  @Override
                       //  public void run() {
                       // Thread t=new Thread();
                       // try {
                       //   t.sleep(5000);
                       //  } catch (Exception e){}

                       // if (validate(editText, textInputLayout) && validate(editText1, textInputLayout1) && validate(editText3, textInputLayout3)) {


                        //    Intent intent = new Intent(view.getContext(), OTPActivity.class);
                      //      startActivityForResult(intent,0);
                     //   }}}.execute(5);}});}












       // private boolean validate(EditText editText, TextInputLayout textInputLayout) {
      //  if (editText.getText().toString().trim().length() > 0) {
      //      return true;
      //  }
     //   editText.requestFocus(); // set focus on fields
     //   textInputLayout.setError("Please Fill This.!!!"); // set error message
     //   return false;
   // }}
    //public static boolean isConnectedWithInternet(Context context) {
        //boolean _isNetAvailable = false;
       // ConnectivityManager cm = (ConnectivityManager) context
         //       .getSystemService(Context.CONNECTIVITY_SERVICE);

        //NetworkInfo wifiNetwork = cm
       //         .getNetworkInfo(ConnectivityManager.TYPE_WIFI);
       // if (wifiNetwork != null) {
      //      _isNetAvailable = wifiNetwork.isConnectedOrConnecting();
      //  }

      //  NetworkInfo mobileNetwork = cm
      //          .getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
      //  if (mobileNetwork != null) {
        //    _isNetAvailable = mobileNetwork.isConnectedOrConnecting();
      //  }

      //  NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
       // if (activeNetwork != null) {
       //     _isNetAvailable = activeNetwork.isConnectedOrConnecting();
       // }
       // return _isNetAvailable;
    //}}
    //public boolean isOnline(Context context) {

       // ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
       // NetworkInfo netInfo = cm.getActiveNetworkInfo();
        //should check null because in airplane mode it will be null
        //return (netInfo != null && netInfo.isConnected());
   // }}
    //public void isNetworkAvailable() {
       //try {
          //  ConnectivityManager connectivity = (ConnectivityManager) sContext.getSystemService(Context.CONNECTIVITY_SERVICE);
           // if (connectivity != null) {
            //    NetworkInfo[] info = connectivity.getAllNetworkInfo();
             //   if (info != null)
                //    for (int i = 0; i < info.length; i++)
                 //       if (info[i].getState() == NetworkInfo.State.CONNECTED) {
                            //present your UI
                      //  }
           // }
       // } catch (Exception e) {
       //     e.printStackTrace();
      //  }
        //exit the app
      //  finish();
    //}}

