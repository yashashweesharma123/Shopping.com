package test.ojassoft.com.ys;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
public class MainFragment extends Fragment {


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
        adapter.addFrag(new MenFragment(), "Men");
        adapter.addFrag(new WomenFragment(), "Women");
        adapter.addFrag(new KidsFragment(), "Kids");
        viewPager.setAdapter(adapter);
    }}


