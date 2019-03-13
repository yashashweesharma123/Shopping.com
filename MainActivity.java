package test.ojassoft.com.ys;

import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.net.ConnectivityManager;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT=4000;
    TextView textView;
    Context context;
    NetworkInfo info;
    Context sContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView) findViewById(R.id.textview);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }}
   // public void isNetworkAvailable() {
       // try {
         //   ConnectivityManager connectivity = (ConnectivityManager) sContext.getSystemService(Context.CONNECTIVITY_SERVICE);
          //  if (connectivity != null) {
             //   NetworkInfo[] info = connectivity.getAllNetworkInfo();
              //  if (info != null)
               //     for (int i = 0; i < info.length; i++)
                //        if (info[i].getState() == NetworkInfo.State.CONNECTED) {
                            //present your UI
                   //     }
            //}
       // } catch (Exception e) {
       //     e.printStackTrace();
      //  }
        //exit the app
     //   finish();
   // }
//}
