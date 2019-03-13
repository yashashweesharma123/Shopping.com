package test.ojassoft.com.ys;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class EleventhActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String city[]={"Aligarh","Allahabad","Delhi","Mumbai","Agra","Chennai","Goa","Kolkata","Bareily","Lucknow","Kanpur","Mathura","Meerut"};
    String pieces[]={"one","two","three","four","five","six","seven","eight","nine","ten"};

Toolbar toolbar;
TextView textView;
TextView textView1;
TextView textView2;
TextView textView3;
TextView textView4;
TextView textView5;
TextView textView6;
EditText editText;
EditText editText1;
Spinner spinner;
Spinner spinner1;
Button button;
ProgressDialog pd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleventh);
        toolbar=(Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("SHOPPING.COM");
        setSupportActionBar(toolbar);
        textView=(TextView) findViewById(R.id.textview);
        textView1=(TextView) findViewById(R.id.textview1);
        textView2=(TextView) findViewById(R.id.textview2);
        textView3=(TextView) findViewById(R.id.textview3);
        textView4=(TextView) findViewById(R.id.textview4);
        textView5=(TextView) findViewById(R.id.textview5);
        textView6=(TextView) findViewById(R.id.textview6);
        editText=(EditText) findViewById(R.id.edittext);
        editText1=(EditText) findViewById(R.id.edittext1);
        pd = new ProgressDialog(EleventhActivity.this);
        pd.setTitle("Loading Activity");
        pd.setMessage("Please Wait ...");
        pd.setMax(5);
        pd.setIndeterminate(false);
        pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);

        button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( final View view) {
                new  AsyncTask<Integer, Long, Boolean>() {


                    @Override
                    protected Boolean doInBackground(Integer... params) {

                        publishProgress(0L);
                        long start = System.currentTimeMillis();
                        long waitTime = params[0] * 1000;
                        try {
                            while (System.currentTimeMillis() - start < waitTime) {
                                Thread.sleep(500);
                                publishProgress(System.currentTimeMillis() - start);
                            }
                        } catch (Exception e) {
                            return false;
                        }
                        return true;

                    }

                    @Override
                    protected void onProgressUpdate(Long... values) {
                        if (values[0] == 0) {
                            pd.show();
                        } else {
                            pd.setProgress((int) (values[0] / 1000));
                        }
                    }

                    @Override
                    protected void onPostExecute(Boolean result) {
                        pd.dismiss();
                        //progressBar.setVisibility(View.VISIBLE);
                        //final Handler handler = new Handler();
                        //  handler.postDelayed(new Runnable() {
                        //  @Override
                        //  public void run() {
                        // Thread t=new Thread();
                        // try {
                        //   t.sleep(5000);
                        //  } catch (Exception e){}

                        if (validate(editText) && validate(editText1) ) {


                            Intent intent = new Intent(view.getContext(), TwelthActivity.class);
                            startActivityForResult(intent,0);
                        }}}.execute(5);}});
        spinner=(Spinner) findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);
        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, city);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(aa);
        spinner1=(Spinner) findViewById(R.id.spinner1);
        spinner1.setOnItemSelectedListener(this);
        ArrayAdapter a=new ArrayAdapter(this,android.R.layout.simple_spinner_item,pieces);
        spinner1.setAdapter(a);}

    private boolean validate(EditText editText){
            if (editText.getText().toString().trim().length() > 0) {
                return true;
            }
            editText.requestFocus(); // set focus on fields
            editText.setError("Please Fill This.!!!"); // set error message
            return false;
        }

        //spinner=(Spinner) findViewById(R.id.spinner);
        //spinner.setOnItemSelectedListener(this);
       // ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, city);
       // aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //spinner.setAdapter(aa);
      //  spinner1=(Spinner) findViewById(R.id.spinner1);
      //  spinner1.setOnItemSelectedListener(this);
       // ArrayAdapter a=new ArrayAdapter(this,android.R.layout.simple_spinner_item,pieces);
       // spinner1.setAdapter(a);

    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {

        //  Toast.makeText(getApplicationContext(),size[position],Toast.LENGTH_LONG).show();
    }



    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
// TODO Auto-generated method stub

    }}
