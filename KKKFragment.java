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


public class KKKFragment extends Fragment {
    ArrayList itemDD=new ArrayList<>(Arrays.asList("Shoes-1","Shoes-2","Shoes-3","Shoes-4","shoes-5","Shoes-6"));
    ArrayList<Integer> itemEE=new ArrayList<>(Arrays.asList(R.drawable.shoe13,R.drawable.shoe14,R.drawable.shoe15,R.drawable.shoe16,R.drawable.shoe17,R.drawable.shoe18));

    public KKKFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=LayoutInflater.from(getContext()).inflate(R.layout.fragment_kkk,container,false);
        RecyclerView recyclerView=(RecyclerView) view.findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        CustomAdapter12 customAdapter12=new CustomAdapter12(getContext(),itemDD,itemEE);
        recyclerView.setAdapter(customAdapter12);
        return view;
    }}
