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


public class MMMFragment extends Fragment {
    ArrayList itemBBB=new ArrayList<>(Arrays.asList("Shoes-1","Shoes-2","Shoes-3","Shoes-4","shoes-5","Shoes-6"));
    ArrayList<Integer> itemCCC=new ArrayList<>(Arrays.asList(R.drawable.shoe1,R.drawable.shoe2,R.drawable.shoe3,R.drawable.shoe4,R.drawable.shoe5,R.drawable.shoe6));

    public MMMFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=LayoutInflater.from(getContext()).inflate(R.layout.fragment_mmm,container,false);
        RecyclerView recyclerView=(RecyclerView) view.findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        CustomAdapter10 customAdapter10=new CustomAdapter10(getContext(),itemBBB,itemCCC);
        recyclerView.setAdapter(customAdapter10);
        return view;
    }

}
