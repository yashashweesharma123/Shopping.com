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


public class KFragment extends Fragment {
    ArrayList itemAA=new ArrayList<>(Arrays.asList("Jeans-1","Jeans-2","Jeans-3","Jeans-4","Jeans-5","Jeans-6","Jeans-7","Jeans-8","Jeans-9","Jeans-10"));
    ArrayList<Integer> itemII =new ArrayList<>(Arrays.asList(R.drawable.kw1,R.drawable.kw2,R.drawable.kw3,R.drawable.kw4,R.drawable.kw5,R.drawable.kw6,R.drawable.kw7,R.drawable.kw8,R.drawable.kw9,R.drawable.kw10));
    public KFragment() {
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

        View view=LayoutInflater.from(getContext()).inflate(R.layout.fragment_k,container,false);
        RecyclerView recyclerView=(RecyclerView) view.findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        CustomAdapter6 customAdapter6=new CustomAdapter6(getContext(),itemAA,itemII);
        recyclerView.setAdapter(customAdapter6);
        return view;
    }

}
    //
