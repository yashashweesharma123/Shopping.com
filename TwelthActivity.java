package test.ojassoft.com.ys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.DialogInterface;
import android.widget.Toast;


public class TwelthActivity extends AppCompatActivity {
    Toolbar toolbar;
    TextView textView;
    TextView textView1;
    Button button;
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelth);
        toolbar=(Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("SHOPPING.COM");
        setSupportActionBar(toolbar);
        textView=(TextView) findViewById(R.id.textview);
        textView.setText("Thankyou for giving your valuable time for shopping from Shopping.com");
        textView1=(TextView) findViewById(R.id.textview1);
        textView1.setText("Your Item will be delivered within a week of Confirmation of order");
        button1=(Button) findViewById(R.id.button1);
        //button1.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View view) {
            //    AlertDialog.Builder alertDialog=new AlertDialog(this);
            //}
       // });
        button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TwelthActivity.this,ThirdActivity.class);
                startActivity(intent);
            }
        });
}
    public void exit(View view){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        // Setting Alert Dialog Title
        alertDialogBuilder.setTitle("Confirm Exit..!!!");
        // Icon Of Alert Dialog
        alertDialogBuilder.setIcon(R.drawable.shopping);
        // Setting Alert Dialog Message
        alertDialogBuilder.setMessage("Are you sure,You want to exit");
        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                finish();
                moveTaskToBack(true);
                TwelthActivity.this.finish();
                //Intent intent=new Intent(TwelthActivity.this,SecondActivity.class);
                //startActivity(intent);
            }
        });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(TwelthActivity.this,"You clicked over No",Toast.LENGTH_SHORT).show();
            }
        });
        alertDialogBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"You clicked on Cancel",Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
