package test.ojassoft.com.ys;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ojas-20 on 12/7/18.
 */

public class MenFragment extends Fragment {
    ArrayList itemN=new ArrayList<>(Arrays.asList("T-Shirt1","T-Shirt2","T-Shirt3","T-Shirt4","T-Shirt5","T-Shirt6","T-Shirt7","T-Shirt8","T-Shirt9","T-Shirt10","T-Shirt11"));
    ArrayList<Integer> itemI =new ArrayList<>(Arrays.asList(R.drawable.red,R.drawable.green,R.drawable.yellow,R.drawable.yellow1,R.drawable.black,R.drawable.blue,R.drawable.brown,R.drawable.mahroon,R.drawable.brown1,R.drawable.black,R.drawable.blue));
    Context context;
    public MenFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=LayoutInflater.from(getContext()).inflate(R.layout.fragment_men,container,false);
        RecyclerView recyclerView=(RecyclerView) view.findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        CustomAdapter1 customAdapter1=new CustomAdapter1(getContext(),itemN,itemI);
        recyclerView.setAdapter(customAdapter1);
        return view;



    }

}

