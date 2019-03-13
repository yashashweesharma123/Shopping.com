package test.ojassoft.com.ys;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;



public class FourthFragment extends Fragment {
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
        adapter.addFrag(new MMMFragment(), "Men");
        adapter.addFrag(new WWWFragment(), "Women");
        adapter.addFrag(new KKKFragment(), "Kids");
        viewPager.setAdapter(adapter);
    }}
