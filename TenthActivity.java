package test.ojassoft.com.ys;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class TenthActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Toolbar toolbar;
    String size[]={"M","L","XL","XXL"};
    String color[]={"Red","Black","Blue"};
    ImageView imageView;
    TextView textView;
    TextView textView1;
    TextView textView2;
    Button button;
    ProgressDialog pd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth);
        pd=new ProgressDialog(TenthActivity.this);
        pd.setTitle("Loading Activity");
        pd.setMessage("Please Wait ...");
        pd.setMax(5);
        pd.setIndeterminate(false);
        pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        toolbar=(Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("SHOPPING.COM");
        setSupportActionBar(toolbar);
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
                Intent intent=new Intent(TenthActivity.this,EleventhActivity.class);
                startActivity(intent);
            }
        }.execute(5);}});
        imageView = (ImageView) findViewById(R.id.imageview);
        textView = (TextView) findViewById(R.id.textview);
        textView1 = (TextView) findViewById(R.id.textview1);
        textView2 = (TextView) findViewById(R.id.textview2);
        Intent intent = getIntent();
        imageView.setImageResource(intent.getIntExtra("imageview", 0));
        String itemN = intent.getStringExtra("textview");
        textView.setText(itemN);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);
        Spinner spinner1=(Spinner) findViewById(R.id.spinner1);
        spinner1.setOnItemSelectedListener(this);
        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, size);
        ArrayAdapter aaa=new ArrayAdapter(this,android.R.layout.simple_spinner_item,color);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//Setting the ArrayAdapter data on the Spinner
        spinner.setAdapter(aa);
        spinner1.setAdapter(aaa);
    }
        @Override
        public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {

              //  Toast.makeText(getApplicationContext(),size[position],Toast.LENGTH_LONG).show();
        }



        @Override
        public void onNothingSelected(AdapterView<?> arg0) {
// TODO Auto-generated method stub

}}


