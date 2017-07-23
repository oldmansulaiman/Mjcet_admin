package com.androidtutorialpoint.cardviewtutorial.BranchActivities;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.androidtutorialpoint.cardviewtutorial.About_usFragment;
import com.androidtutorialpoint.cardviewtutorial.AttendanceActivities.Eee.Eee_Att_First_A_Activity;
import com.androidtutorialpoint.cardviewtutorial.AttendanceActivities.Eee.Eee_Att_First_B_Activity;
import com.androidtutorialpoint.cardviewtutorial.AttendanceActivities.Eee.Eee_Att_Fourth_A_Activity;
import com.androidtutorialpoint.cardviewtutorial.AttendanceActivities.Eee.Eee_Att_Fourth_B_Activity;
import com.androidtutorialpoint.cardviewtutorial.AttendanceActivities.Eee.Eee_Att_Sec_A_Activity;
import com.androidtutorialpoint.cardviewtutorial.AttendanceActivities.Eee.Eee_Att_Sec_B_Activity;
import com.androidtutorialpoint.cardviewtutorial.AttendanceActivities.Eee.Eee_Att_Third_A_Activity;
import com.androidtutorialpoint.cardviewtutorial.AttendanceActivities.Eee.Eee_Att_Third_B_Activity;
import com.androidtutorialpoint.cardviewtutorial.BranchFragments.Eee_AttendanceFragment;
import com.androidtutorialpoint.cardviewtutorial.BranchFragments.Eee_MarksFragment;
import com.androidtutorialpoint.cardviewtutorial.BranchFragments.Eee_AttendanceFragment;
import com.androidtutorialpoint.cardviewtutorial.BranchFragments.Eee_MarksFragment;
import com.androidtutorialpoint.cardviewtutorial.MarksActivities.MarksActivities.Eee.Eee_Mar_First_A_Activity;
import com.androidtutorialpoint.cardviewtutorial.MarksActivities.MarksActivities.Eee.Eee_Mar_First_B_Activity;
import com.androidtutorialpoint.cardviewtutorial.MarksActivities.MarksActivities.Eee.Eee_Mar_Fourth_A_Activity;
import com.androidtutorialpoint.cardviewtutorial.MarksActivities.MarksActivities.Eee.Eee_Mar_Fourth_B_Activity;
import com.androidtutorialpoint.cardviewtutorial.MarksActivities.MarksActivities.Eee.Eee_Mar_Sec_A_Activity;
import com.androidtutorialpoint.cardviewtutorial.MarksActivities.MarksActivities.Eee.Eee_Mar_Sec_B_Activity;
import com.androidtutorialpoint.cardviewtutorial.MarksActivities.MarksActivities.Eee.Eee_Mar_Third_A_Activity;
import com.androidtutorialpoint.cardviewtutorial.MarksActivities.MarksActivities.Eee.Eee_Mar_Third_B_Activity;
import com.androidtutorialpoint.cardviewtutorial.R;
import com.androidtutorialpoint.cardviewtutorial.ViewPagerAdapter;

public class EeeActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee);

        toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragments(new Eee_AttendanceFragment(),"Attendance");
        viewPagerAdapter.addFragments(new Eee_MarksFragment(),"Marks");
        viewPagerAdapter.addFragments(new About_usFragment(),"About Us");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    public void eee_att_1_a (View view){
        Intent intent = new Intent(this,Eee_Att_First_A_Activity.class);
        startActivity(intent);
    }

    public void eee_att_1_b (View view){
        Intent intent = new Intent(this,Eee_Att_First_B_Activity.class);
        startActivity(intent);
    }

    public void eee_att_2_a (View view){
        Intent intent = new Intent(this,Eee_Att_Sec_A_Activity.class);
        startActivity(intent);
    }

    public void eee_att_2_b (View view){
        Intent intent = new Intent(this,Eee_Att_Sec_B_Activity.class);
        startActivity(intent);
    }

    public void eee_att_3_a (View view){
        Intent intent = new Intent(this,Eee_Att_Third_A_Activity.class);
        startActivity(intent);
    }

    public void eee_att_3_b (View view){
        Intent intent = new Intent(this,Eee_Att_Third_B_Activity.class);
        startActivity(intent);
    }

    public void eee_att_4_a (View view){
        Intent intent = new Intent(this,Eee_Att_Fourth_A_Activity.class);
        startActivity(intent);
    }

    public void eee_att_4_b (View view){
        Intent intent = new Intent(this,Eee_Att_Fourth_B_Activity.class);
        startActivity(intent);
    }

    public void eee_marks_1_a (View view){
        Intent intent = new Intent(this,Eee_Mar_First_A_Activity.class);
        startActivity(intent);
    }

    public void eee_marks_1_b (View view){
        Intent intent = new Intent(this,Eee_Mar_First_B_Activity.class);
        startActivity(intent);
    }
    public void eee_marks_2_a (View view){
        Intent intent = new Intent(this,Eee_Mar_Sec_A_Activity.class);
        startActivity(intent);
    }

    public void eee_marks_2_b (View view){
        Intent intent = new Intent(this,Eee_Mar_Sec_B_Activity.class);
        startActivity(intent);
    }
    public void eee_marks_3_a (View view){
        Intent intent = new Intent(this, Eee_Mar_Third_A_Activity.class);
        startActivity(intent);
    }
    public void eee_marks_3_b (View view){
        Intent intent = new Intent(this,Eee_Mar_Third_B_Activity.class);
        startActivity(intent);
    }
    public void eee_marks_4_a (View view){
        Intent intent = new Intent(this,Eee_Mar_Fourth_A_Activity.class);
        startActivity(intent);
    }
    public void eee_marks_4_b (View view){
        Intent intent = new Intent(this,Eee_Mar_Fourth_B_Activity.class);
        startActivity(intent);
    }
}
