package com.example.orcbuilder;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class TalentsActivity extends AppCompatActivity {

    static final String TAG = "myLogs";
    static final int PAGE_COUNT = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talents);

        ViewPager talentsPager = findViewById(R.id.talentsPager);

        TalentsPagesAdapter adapter = new TalentsPagesAdapter(getSupportFragmentManager());
        talentsPager.setAdapter(adapter);

        talentsPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                Log.d(TAG, "onPageSelected, position = " + i);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }

}
