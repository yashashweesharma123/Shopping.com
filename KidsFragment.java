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

public class KidsFragment extends Fragment {
    ArrayList itemNNN=new ArrayList<>(Arrays.asList("T-Shirt1","T-Shirt2","T-Shirt3","T-Shirt4","T-Shirt5","T-Shirt6","T-Shirt7","T-Shirt8","T-Shirt9","T-Shirt10","T-Shirt11"));
    ArrayList<Integer> itemIII =new ArrayList<>(Arrays.asList(R.drawable.kid1,R.drawable.kid2,R.drawable.kid3,R.drawable.kid4,R.drawable.kid5,R.drawable.kid6,R.drawable.kid7,R.drawable.kid8,R.drawable.kid9,R.drawable.kid10,R.drawable.kid11));
    Context context;
    public KidsFragment() {
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

        View view=LayoutInflater.from(getContext()).inflate(R.layout.fragment_kids,container,false);
        RecyclerView recyclerView=(RecyclerView) view.findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        CustomAdapter3 customAdapter3=new CustomAdapter3(getContext(),itemNNN,itemIII);
        recyclerView.setAdapter(customAdapter3);
        return view;
    }

}





