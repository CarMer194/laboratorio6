package com.henriquez.laboratorio6;

import android.media.Image;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.TableLayout;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    PlanetViewPagerAdapter planetViewPagerAdapter;
    ArrayList<Planeta> planetas;
    PlanetsFragment planetsFragment, favoriteFragment;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        planetas = fillList();

        planetsFragment = new PlanetsFragment(planetas);
        favoriteFragment = new PlanetsFragment(planetas);

        toolbar = findViewById(R.id.toolbar1);
        toolbar.setTitle(R.string.app_name);
        setSupportActionBar(toolbar);


        planetViewPagerAdapter = new PlanetViewPagerAdapter(getSupportFragmentManager());
        planetViewPagerAdapter.addItem("Planetas",planetsFragment);
        planetViewPagerAdapter.addItem("favoritos",favoriteFragment);

        viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(planetViewPagerAdapter);

        viewPager.addOnPageChangeListener(pageChangeListener);

        tabLayout = findViewById(R.id.tablayout);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setupWithViewPager(viewPager,true);
    }

    public ArrayList<Planeta> fillList(){
        ArrayList<Planeta> list = new ArrayList<>();
        list.add(new Planeta("Tierra","tierra","la tierra el planeta en que vivimos"));
        list.add(new Planeta("marte","marte","el planeta rojo"));
        list.add(new Planeta("venus","venus","segundo planeta del sistema solar"));

        return list;
    }

    private ViewPager.OnPageChangeListener pageChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            PlanetViewPagerAdapter.FragmentLifeCycle fragmentShow = (PlanetViewPagerAdapter.FragmentLifeCycle) planetViewPagerAdapter.getItem(position);
            fragmentShow.onResumeFragment();

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };



}
