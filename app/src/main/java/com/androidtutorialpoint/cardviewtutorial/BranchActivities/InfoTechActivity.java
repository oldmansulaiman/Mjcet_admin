package com.androidtutorialpoint.cardviewtutorial.BranchActivities;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;


import com.androidtutorialpoint.cardviewtutorial.AttendanceActivities.InfoTech.InfoTech_Att_First_A_Activity;
import com.androidtutorialpoint.cardviewtutorial.AttendanceActivities.InfoTech.InfoTech_Att_First_B_Activity;
import com.androidtutorialpoint.cardviewtutorial.AttendanceActivities.InfoTech.InfoTech_Att_Fourth_A_Activity;
import com.androidtutorialpoint.cardviewtutorial.AttendanceActivities.InfoTech.InfoTech_Att_Fourth_B_Activity;
import com.androidtutorialpoint.cardviewtutorial.AttendanceActivities.InfoTech.InfoTech_Att_Sec_A_Activity;
import com.androidtutorialpoint.cardviewtutorial.AttendanceActivities.InfoTech.InfoTech_Att_Sec_B_Activity;
import com.androidtutorialpoint.cardviewtutorial.AttendanceActivities.InfoTech.InfoTech_Att_Third_A_Activity;
import com.androidtutorialpoint.cardviewtutorial.AttendanceActivities.InfoTech.InfoTech_Att_Third_B_Activity;
import com.androidtutorialpoint.cardviewtutorial.BranchFragments.InfoTech_AttendanceFragment;
import com.androidtutorialpoint.cardviewtutorial.BranchFragments.InfoTech_MarksFragment;

import com.androidtutorialpoint.cardviewtutorial.MarksActivities.MarksActivities.InfoTech.InfoTech_Mar_First_A_Activity;
import com.androidtutorialpoint.cardviewtutorial.MarksActivities.MarksActivities.InfoTech.InfoTech_Mar_First_B_Activity;
import com.androidtutorialpoint.cardviewtutorial.MarksActivities.MarksActivities.InfoTech.InfoTech_Mar_Fourth_A_Activity;
import com.androidtutorialpoint.cardviewtutorial.MarksActivities.MarksActivities.InfoTech.InfoTech_Mar_Fourth_B_Activity;
import com.androidtutorialpoint.cardviewtutorial.MarksActivities.MarksActivities.InfoTech.InfoTech_Mar_Sec_A_Activity;
import com.androidtutorialpoint.cardviewtutorial.MarksActivities.MarksActivities.InfoTech.InfoTech_Mar_Sec_B_Activity;
import com.androidtutorialpoint.cardviewtutorial.MarksActivities.MarksActivities.InfoTech.InfoTech_Mar_Third_A_Activity;
import com.androidtutorialpoint.cardviewtutorial.MarksActivities.MarksActivities.InfoTech.InfoTech_Mar_Third_B_Activity;
import com.androidtutorialpoint.cardviewtutorial.MiscActivities.About_usFragment;
import com.androidtutorialpoint.cardviewtutorial.MiscActivities.ViewPagerAdapter;
import com.androidtutorialpoint.cardviewtutorial.R;

public class InfoTechActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_tech);

        toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragments(new InfoTech_AttendanceFragment(), "Attendance");
        viewPagerAdapter.addFragments(new InfoTech_MarksFragment(), "Marks");
        viewPagerAdapter.addFragments(new About_usFragment(), "About Us");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    public void infotech_att_1_a(View view) {
        Intent intent = new Intent(this, InfoTech_Att_First_A_Activity.class);
        startActivity(intent);
    }

    public void infotech_att_1_b(View view) {
        Intent intent = new Intent(this, InfoTech_Att_First_B_Activity.class);
        startActivity(intent);
    }

    public void infotech_att_2_a(View view) {
        Intent intent = new Intent(this, InfoTech_Att_Sec_A_Activity.class);
        startActivity(intent);
    }

    public void infotech_att_2_b(View view) {
        Intent intent = new Intent(this, InfoTech_Att_Sec_B_Activity.class);
        startActivity(intent);
    }

    public void infotech_att_3_a(View view) {
        Intent intent = new Intent(this, InfoTech_Att_Third_A_Activity.class);
        startActivity(intent);
    }

    public void infotech_att_3_b(View view) {
        Intent intent = new Intent(this, InfoTech_Att_Third_B_Activity.class);
        startActivity(intent);
    }

    public void infotech_att_4_a(View view) {
        Intent intent = new Intent(this, InfoTech_Att_Fourth_A_Activity.class);
        startActivity(intent);
    }

    public void infotech_att_4_b(View view) {
        Intent intent = new Intent(this, InfoTech_Att_Fourth_B_Activity.class);
        startActivity(intent);
    }

    public void infotech_marks_1_a(View view) {
        Intent intent = new Intent(this, InfoTech_Mar_First_A_Activity.class);
        startActivity(intent);
    }

    public void infotech_marks_1_b(View view) {
        Intent intent = new Intent(this, InfoTech_Mar_First_B_Activity.class);
        startActivity(intent);
    }

    public void infotech_marks_2_a(View view) {
        Intent intent = new Intent(this, InfoTech_Mar_Sec_A_Activity.class);
        startActivity(intent);
    }

    public void infotech_marks_2_b(View view) {
        Intent intent = new Intent(this, InfoTech_Mar_Sec_B_Activity.class);
        startActivity(intent);
    }

    public void infotech_marks_3_a(View view) {
        Intent intent = new Intent(this, InfoTech_Mar_Third_A_Activity.class);
        startActivity(intent);
    }

    public void infotech_marks_3_b(View view) {
        Intent intent = new Intent(this, InfoTech_Mar_Third_B_Activity.class);
        startActivity(intent);
    }

    public void infotech_marks_4_a(View view) {
        Intent intent = new Intent(this, InfoTech_Mar_Fourth_A_Activity.class);
        startActivity(intent);
    }

    public void infotech_marks_4_b(View view) {
        Intent intent = new Intent(this, InfoTech_Mar_Fourth_B_Activity.class);
        startActivity(intent);
    }
}