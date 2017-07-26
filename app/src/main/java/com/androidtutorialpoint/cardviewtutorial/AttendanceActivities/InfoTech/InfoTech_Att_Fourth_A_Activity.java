package com.androidtutorialpoint.cardviewtutorial.AttendanceActivities.InfoTech;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.androidtutorialpoint.cardviewtutorial.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class InfoTech_Att_Fourth_A_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_tech__att__fourth__a_);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myref = database.getReference();

        final EditText edt1 = (EditText) findViewById(R.id.edt_001);
        final EditText edt2 = (EditText) findViewById(R.id.edt_002);
        final EditText edt3 = (EditText) findViewById(R.id.edt_003);
        final EditText edt4 = (EditText) findViewById(R.id.edt_004);
        final EditText edt5 = (EditText) findViewById(R.id.edt_005);

        Button btn1 = (Button) findViewById(R.id.btn_001);
        Button btn2 = (Button) findViewById(R.id.btn_002);
        Button btn3 = (Button) findViewById(R.id.btn_003);
        Button btn4 = (Button) findViewById(R.id.btn_004);
        Button btn5 = (Button) findViewById(R.id.btn_005);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("it").child("IV Year").child("Sec A").child("001").child("Attendance").setValue(edt1.getText().toString());
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("it").child("IV Year").child("Sec A").child("002").child("Attendance").setValue(edt2.getText().toString());
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("it").child("IV Year").child("Sec A").child("003").child("Attendance").setValue(edt3.getText().toString());
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("it").child("IV Year").child("Sec A").child("004").child("Attendance").setValue(edt4.getText().toString());
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("it").child("IV Year").child("Sec A").child("001").child("Attendance").setValue(edt5.getText().toString());
            }
        });
    }
}
