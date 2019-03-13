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


public class MMFragment extends Fragment {
    ArrayList itemAAA=new ArrayList<>(Arrays.asList("Shoes-1","Shoes-2","Shoes-3","Shoes-4","shoes-5","Shoes-6"));
    ArrayList<Integer> itemIII=new ArrayList<>(Arrays.asList(R.drawable.formal1,R.drawable.formal2,R.drawable.formal3,R.drawable.formal4,R.drawable.formal5,R.drawable.formal6));

    public MMFragment() {
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

        View view=LayoutInflater.from(getContext()).inflate(R.layout.fragment_mm,container,false);
        RecyclerView recyclerView=(RecyclerView) view.findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        CustomAdapter7 customAdapter7=new CustomAdapter7(getContext(),itemAAA,itemIII);
        recyclerView.setAdapter(customAdapter7);
        return view;
    }

}
