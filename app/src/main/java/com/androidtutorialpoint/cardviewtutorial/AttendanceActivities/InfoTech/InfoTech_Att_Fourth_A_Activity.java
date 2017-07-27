package com.androidtutorialpoint.cardviewtutorial.AttendanceActivities.InfoTech;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.androidtutorialpoint.cardviewtutorial.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
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
        final EditText edt6 = (EditText) findViewById(R.id.edt_006);
        final EditText edt7 = (EditText) findViewById(R.id.edt_007);
        final EditText edt8 = (EditText) findViewById(R.id.edt_008);
        final EditText edt9 = (EditText) findViewById(R.id.edt_009);
        final EditText edt10 = (EditText) findViewById(R.id.edt_010);
        final EditText edt12 = (EditText) findViewById(R.id.edt_012);
        final EditText edt13 = (EditText) findViewById(R.id.edt_013);
        final EditText edt14 = (EditText) findViewById(R.id.edt_014);
        final EditText edt15 = (EditText) findViewById(R.id.edt_015);
        final EditText edt16 = (EditText) findViewById(R.id.edt_016);
        final EditText edt17 = (EditText) findViewById(R.id.edt_017);
        final EditText edt18 = (EditText) findViewById(R.id.edt_018);
        final EditText edt19 = (EditText) findViewById(R.id.edt_019);
        final EditText edt20 = (EditText) findViewById(R.id.edt_020);
        final EditText edt21 = (EditText) findViewById(R.id.edt_021);
        final EditText edt22 = (EditText) findViewById(R.id.edt_022);
        final EditText edt23 = (EditText) findViewById(R.id.edt_023);
        final EditText edt24 = (EditText) findViewById(R.id.edt_024);
        final EditText edt25 = (EditText) findViewById(R.id.edt_025);
        final EditText edt26 = (EditText) findViewById(R.id.edt_026);
        final EditText edt27 = (EditText) findViewById(R.id.edt_027);
        final EditText edt28 = (EditText) findViewById(R.id.edt_028);
        final EditText edt29 = (EditText) findViewById(R.id.edt_029);
        final EditText edt30 = (EditText) findViewById(R.id.edt_030);
        final EditText edt31 = (EditText) findViewById(R.id.edt_031);
        final EditText edt32 = (EditText) findViewById(R.id.edt_032);
        final EditText edt33 = (EditText) findViewById(R.id.edt_033);


        Button btn1 = (Button) findViewById(R.id.btn_001);
        Button btn2 = (Button) findViewById(R.id.btn_002);
        Button btn3 = (Button) findViewById(R.id.btn_003);
        Button btn4 = (Button) findViewById(R.id.btn_004);
        Button btn5 = (Button) findViewById(R.id.btn_005);
        Button btn6 = (Button) findViewById(R.id.btn_006);
        Button btn7 = (Button) findViewById(R.id.btn_007);
        Button btn8 = (Button) findViewById(R.id.btn_008);
        Button btn9 = (Button) findViewById(R.id.btn_009);
        Button btn10 = (Button) findViewById(R.id.btn_010);
        Button btn12 = (Button) findViewById(R.id.btn_012);
        Button btn13 = (Button) findViewById(R.id.btn_013);
        Button btn14 = (Button) findViewById(R.id.btn_014);
        Button btn15 = (Button) findViewById(R.id.btn_015);
        Button btn16 = (Button) findViewById(R.id.btn_016);
        Button btn17 = (Button) findViewById(R.id.btn_017);
        Button btn18 = (Button) findViewById(R.id.btn_018);
        Button btn19 = (Button) findViewById(R.id.btn_019);
        Button btn20 = (Button) findViewById(R.id.btn_020);
        Button btn21 = (Button) findViewById(R.id.btn_021);
        Button btn22 = (Button) findViewById(R.id.btn_022);
        Button btn23 = (Button) findViewById(R.id.btn_023);
        Button btn24 = (Button) findViewById(R.id.btn_024);
        Button btn25 = (Button) findViewById(R.id.btn_025);
        Button btn26 = (Button) findViewById(R.id.btn_026);
        Button btn27 = (Button) findViewById(R.id.btn_027);
        Button btn28 = (Button) findViewById(R.id.btn_028);
        Button btn29 = (Button) findViewById(R.id.btn_029);
        Button btn30 = (Button) findViewById(R.id.btn_030);
        Button btn31 = (Button) findViewById(R.id.btn_031);
        Button btn32 = (Button) findViewById(R.id.btn_032);
        Button btn33 = (Button) findViewById(R.id.btn_033);

        FirebaseUser currentFirebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        String uid = currentFirebaseUser.getUid();

        if (uid.equals((myref.child("users").child("pNzmDClyLyWiQeWnDC4E3Jqxzpr1")).toString())) {
            Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(getApplicationContext(), "fail", Toast.LENGTH_LONG).show();
        }

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("users").child("UID").child("ZWzIfIUFjHZ53mcja4NmHg3gbWx1").child("attendance").setValue(edt1.getText().toString());
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("users").child("UID").child("iSX7BobuWdYymZgiI2CCl1Scris1").child("attendance").setValue(edt2.getText().toString());
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("users").child("UID").child("WuRgtqRPHRWeqCT4Iiy6cNqrJO52").child("attendance").setValue(edt3.getText().toString());
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("users").child("UID").child("7JJpJNiR7lNENWzNEAnm72xQPr23").child("attendance").setValue(edt4.getText().toString());
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("users").child("UID").child("KIgQ5xKfoOQ5TZGeqaVHmR8l7Bs2").child("attendance").setValue(edt5.getText().toString());
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("users").child("UID").child("e4aMvuDm1rZytl60OP91kVP2EAw1").child("attendance").setValue(edt6.getText().toString());
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("users").child("UID").child("nQsxL5ueaEPFQn6cwcMdlumMyl93").child("attendance").setValue(edt7.getText().toString());
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("users").child("UID").child("Cfz5LkLVMpfAs6rxgNSWRpETWTA2").child("attendance").setValue(edt8.getText().toString());
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("users").child("UID").child("FZ03ydMj3iZEBhqkTblmElJ0F2I2").child("attendance").setValue(edt9.getText().toString());
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("users").child("UID").child("pNzmDClyLyWiQeWnDC4E3Jqxzpr1").child("attendance").setValue(edt10.getText().toString());
            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("users").child("UID").child("Sec A").child("attendance").setValue(edt12.getText().toString());
            }
        });

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("users").child("UID").child("Sec A").child("attendance").setValue(edt13.getText().toString());
            }
        });

        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("users").child("UID").child("Sec A").child("attendance").setValue(edt14.getText().toString());
            }
        });

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("users").child("UID").child("Sec A").child("attendance").setValue(edt15.getText().toString());
            }
        });

        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("users").child("UID").child("Sec A").child("attendance").setValue(edt17.getText().toString());
            }
        });

        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("users").child("UID").child("Sec A").child("attendance").setValue(edt18.getText().toString());
            }
        });

        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("users").child("UID").child("Sec A").child("attendance").setValue(edt19.getText().toString());
            }
        });

        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("users").child("UID").child("Sec A").child("attendance").setValue(edt20.getText().toString());
            }
        });

        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("users").child("UID").child("Sec A").child("attendance").setValue(edt21.getText().toString());
            }
        });

        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("users").child("UID").child("Sec A").child("attendance").setValue(edt22.getText().toString());
            }
        });

        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("users").child("UID").child("Sec A").child("attendance").setValue(edt23.getText().toString());
            }
        });

        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("users").child("UID").child("Sec A").child("attendance").setValue(edt24.getText().toString());
            }
        });

        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("users").child("UID").child("Sec A").child("attendance").setValue(edt25.getText().toString());
            }
        });

        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("users").child("UID").child("Sec A").child("attendance").setValue(edt26.getText().toString());
            }
        });

        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("users").child("UID").child("Sec A").child("attendance").setValue(edt27.getText().toString());
            }
        });

        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("users").child("UID").child("Sec A").child("attendance").setValue(edt28.getText().toString());
            }
        });

        btn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("users").child("UID").child("Sec A").child("attendance").setValue(edt29.getText().toString());
            }
        });

        btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("users").child("UID").child("Sec A").child("attendance").setValue(edt30.getText().toString());
            }
        });

        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("users").child("UID").child("Sec A").child("attendance").setValue(edt31.getText().toString());
            }
        });

        btn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("users").child("UID").child("Sec A").child("attendance").setValue(edt32.getText().toString());
            }
        });

        btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myref.child("users").child("UID").child("Sec A").child("attendance").setValue(edt33.getText().toString());
            }
        });


    }
}
