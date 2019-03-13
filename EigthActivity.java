package test.ojassoft.com.ys;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.GridLayoutManager;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by ojas-20 on 12/7/18.
 */

public class EigthActivity extends AppCompatActivity {
    ArrayList eNames = new ArrayList<>(Arrays.asList("Item1","Item2","Item3","Item4","Item5","Item6","Item7","Item8","Item9"));
    ArrayList<Integer> aImages=new ArrayList<Integer>(Arrays.asList(R.drawable.speaker1,R.drawable.speaker2,R.drawable.mobile1,R.drawable.mobile2,R.drawable.ekettle,R.drawable.headphone1,R.drawable.headphone2,R.drawable.headphone3,R.drawable.press));
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    CircleImageView circleImageView;
    TextView textView;
    TextView textView1;
    ProgressDialog pd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eigth);
        circleImageView=(CircleImageView) findViewById(R.id.circle);
        textView=(TextView) findViewById(R.id.textview);
        textView1=(TextView) findViewById(R.id.textview1);
        pd=new ProgressDialog(EigthActivity.this);
        pd.setTitle("Loading Activity");
        pd.setMessage("Please Wait ...");
        pd.setMax(5);
        pd.setIndeterminate(false);
        pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_dehaze_black_24dp);
        toolbar.setTitle("SHOPPING.COM");
        setSupportActionBar(toolbar);

        //try {

          //  Fragment fr = new FourthFragment();
          //  FragmentManager manager = getSupportFragmentManager();
         //   FragmentTransaction transaction = manager.beginTransaction();
          //  transaction.add(R.id.frame, fr);

            //transaction.commit();
      //  } catch (Exception e) {
            //Log.i("", e.getMessage());
     //   }
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(Gravity.LEFT);

            }
        });
        setNavigationDrawer();
    }
    private void setNavigationDrawer(){
        drawerLayout=(DrawerLayout) findViewById(R.id.drawerLayout);
        NavigationView navigationView=(NavigationView) findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected( final MenuItem menuItem) {
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

                        int itemId=menuItem.getItemId();
                        switch (itemId) {
                            case R.id.first:
                                Intent intent = new Intent(getApplicationContext(), FourthActivity.class);
                                startActivity(intent);
                                break;
                            case R.id.second:
                                Intent intent1 = new Intent(getApplicationContext(), FifthActivity.class);
                                startActivity(intent1);
                                break;
                            case R.id.third:
                                Intent intent2 = new Intent(getApplicationContext(), SixthActivity.class);
                                startActivity(intent2);
                                break;
                            case R.id.fourth:
                                Intent intent3 = new Intent(getApplicationContext(), SeventhActivity.class);
                                startActivity(intent3);
                                break;
                            case R.id.fifth:
                                Intent intent4 = new Intent(getApplicationContext(), EigthActivity.class);
                                startActivity(intent4);
                                break;
                            case R.id.sixth:
                                Intent intent5 = new Intent(getApplicationContext(), NinthActivity.class);
                                startActivity(intent5);
                                break;

                            case R.id.seventh:
                                Intent intent6=new Intent(getApplicationContext(),LoginActivity.class);
                                startActivity(intent6);
                                break;
                        }}}.execute(5);return false;}});


    RecyclerView recyclerView=(RecyclerView) findViewById(R.id.recyclerView);
    GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);
    recyclerView.setLayoutManager(gridLayoutManager);
    CustomAdapter13 customAdapter13=new CustomAdapter13(EigthActivity.this, eNames,aImages);
    recyclerView.setAdapter(customAdapter13);}}







