package test.ojassoft.com.ys;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;


public class MFragment extends Fragment {
    ArrayList itemNNNN=new ArrayList<>(Arrays.asList("Jeans-1","Jeans-2","Jeans-3","Jeans-4","Jeans-5","Jeans-6","Jeans-7","Jeans-8","Jeans-9","Jeans-10","Jeans-11"));
    ArrayList<Integer> itemIIII =new ArrayList<>(Arrays.asList(R.drawable.jeans1,R.drawable.jeans2,R.drawable.jeans3,R.drawable.jeans4,R.drawable.jeans5,R.drawable.jeans6,R.drawable.jeans7,R.drawable.jeans8,R.drawable.jeans9,R.drawable.jeans10,R.drawable.jeans11));
    Context context;
    public MFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=LayoutInflater.from(getContext()).inflate(R.layout.fragment_m,container,false);
        RecyclerView recyclerView=(RecyclerView) view.findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        CustomAdapter4 customAdapter4=new CustomAdapter4(getContext(),itemNNNN,itemIIII);
        recyclerView.setAdapter(customAdapter4);
        return view;
    }

}