package test.ojassoft.com.ys;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class ThirdFragment extends Fragment {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    View view;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_main, container, false);
        viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        addTabs(viewPager);
        tabLayout = (TabLayout) view.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        return view;

    }
    private void addTabs(ViewPager viewPager) {

        PageviewAdapter adapter = new PageviewAdapter(getChildFragmentManager());
        adapter.addFrag(new MMFragment(), "Men");
        adapter.addFrag(new WWFragment(), "Women");
        adapter.addFrag(new KKFragment(), "Kids");
        viewPager.setAdapter(adapter);
    }}