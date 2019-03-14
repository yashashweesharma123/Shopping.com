package test.ojassoft.com.ys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ojas-20 on 12/7/18.
 */

public class ThirdActivity extends AppCompatActivity {
    ArrayList itemNames=new ArrayList<>(Arrays.asList("SHIRTS/T-SHIRTS","JEANS/PANTS/TROUSERS","SHOES/FORMAL","SHOES/CASUAL","ELECTRIC APPLIANCES","HOSEHOLD UTENSILS"));
    ArrayList<Integer> itemImages=new ArrayList<>(Arrays.asList(R.drawable.shirts,R.drawable.trousers,R.drawable.formals,R.drawable.shoes,R.drawable.appliances,R.drawable.utensils));
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        CustomAdapter customAdapter=new CustomAdapter(ThirdActivity.this,itemNames,itemImages);
        recyclerView.setAdapter(customAdapter);

    }}

