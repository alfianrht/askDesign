package com.github.alfian.askdesign;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.github.alfian.askdesign.adapter.BottomBarAdapter;
import com.github.alfian.askdesign.fragment.FragmentHistory;
import com.github.alfian.askdesign.fragment.FragmentHome;
import com.github.alfian.askdesign.fragment.FragmentProfile;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.viewpager_main)
    ViewPager viewpager_main;

    @BindView(R.id.bottombar_main)
    BottomBar bottombar_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setupViewPager(viewpager_main);
        viewpager_main.setOffscreenPageLimit(3);
        bottombar_main.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(int tabId) {
                switch (tabId) {
                    case R.id.tab_home:
                        viewpager_main.setCurrentItem(0);
                        break;
                    case R.id.tab_history:
                        viewpager_main.setCurrentItem(1);
                        break;
                    case R.id.tab_profile:
                        viewpager_main.setCurrentItem(2);
                        break;
                }
            }
        });
    }

    public void setupViewPager(ViewPager viewPager) {
        BottomBarAdapter adapter = new BottomBarAdapter(getSupportFragmentManager(), false);
        adapter.addFragment(new FragmentHome(), "Main");
        adapter.addFragment(new FragmentHistory(), "History");
        adapter.addFragment(new FragmentProfile(), "Profile");
        viewPager.setAdapter(adapter);
    }
}
