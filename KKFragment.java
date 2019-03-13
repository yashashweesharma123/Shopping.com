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


public class KKFragment extends Fragment {
    ArrayList itemBB=new ArrayList<>(Arrays.asList("Shoes-1","Shoes-2","Shoes-3","Shoes-4","shoes-5","Shoes-6"));
    ArrayList<Integer> itemCC=new ArrayList<>(Arrays.asList(R.drawable.formal13,R.drawable.formal14,R.drawable.formal15,R.drawable.formal16,R.drawable.formal17,R.drawable.formal18));
    public KKFragment() {
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

        View view=LayoutInflater.from(getContext()).inflate(R.layout.fragment_kk,container,false);
        RecyclerView recyclerView=(RecyclerView) view.findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        CustomAdapter9 customAdapter9=new CustomAdapter9(getContext(),itemBB,itemCC);
        recyclerView.setAdapter(customAdapter9);
        return view;
    }

}


