package com.androidtutorialpoint.cardviewtutorial.MarksActivities.MarksActivities.InfoTech;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.Toast;

import com.androidtutorialpoint.cardviewtutorial.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class InfoTech_Mar_Fourth_A_Activity extends AppCompatActivity {


    public CheckBox rb1, rb2, rb3, rb4;
    public Button sendBtn;
    public EditText edt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_tech_mar__fourth__a_);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myref = database.getReference();

        final CheckBox rb1 = (CheckBox) findViewById(R.id.sub1_mwt);
        final CheckBox rb2 = (CheckBox) findViewById(R.id.sub2_vlsi);
        final CheckBox rb3 = (CheckBox) findViewById(R.id.sub3_wmc);
        final CheckBox rb4 = (CheckBox) findViewById(R.id.sub4_is);
        final Button sendBtn = (Button) findViewById(R.id.btn_001);
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

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (rb1.isChecked()) {//comit
                    myref.child("users").child("UID").child("ZWzIfIUFjHZ53mcja4NmHg3gbWx1").child("MWT").setValue(edt1.getText().toString());
                    myref.child("users").child("UID").child("iSX7BobuWdYymZgiI2CCl1Scris1").child("MWT").setValue(edt2.getText().toString());
                    myref.child("users").child("UID").child("WuRgtqRPHRWeqCT4Iiy6cNqrJO52").child("MWT").setValue(edt3.getText().toString());
                    myref.child("users").child("UID").child("7JJpJNiR7lNENWzNEAnm72xQPr23").child("MWT").setValue(edt4.getText().toString());
                    myref.child("users").child("UID").child("KIgQ5xKfoOQ5TZGeqaVHmR8l7Bs2").child("MWT").setValue(edt5.getText().toString());
                    myref.child("users").child("UID").child("e4aMvuDm1rZytl60OP91kVP2EAw1").child("MWT").setValue(edt6.getText().toString());
                    myref.child("users").child("UID").child("nQsxL5ueaEPFQn6cwcMdlumMyl93").child("MWT").setValue(edt7.getText().toString());
                    myref.child("users").child("UID").child("Cfz5LkLVMpfAs6rxgNSWRpETWTA2").child("MWT").setValue(edt8.getText().toString());
                    myref.child("users").child("UID").child("FZ03ydMj3iZEBhqkTblmElJ0F2I2").child("MWT").setValue(edt9.getText().toString());
                    myref.child("users").child("UID").child("pNzmDClyLyWiQeWnDC4E3Jqxzpr1").child("MWT").setValue(edt10.getText().toString());


                }


                if (rb2.isChecked()) {
                    myref.child("users").child("UID").child("ZWzIfIUFjHZ53mcja4NmHg3gbWx1").child("VLSI").setValue(edt1.getText().toString());
                    myref.child("users").child("UID").child("iSX7BobuWdYymZgiI2CCl1Scris1").child("VLSI").setValue(edt2.getText().toString());
                    myref.child("users").child("UID").child("WuRgtqRPHRWeqCT4Iiy6cNqrJO52").child("VLSI").setValue(edt3.getText().toString());
                    myref.child("users").child("UID").child("7JJpJNiR7lNENWzNEAnm72xQPr23").child("VLSI").setValue(edt4.getText().toString());
                    myref.child("users").child("UID").child("KIgQ5xKfoOQ5TZGeqaVHmR8l7Bs2").child("VLSI").setValue(edt5.getText().toString());
                    myref.child("users").child("UID").child("e4aMvuDm1rZytl60OP91kVP2EAw1").child("VLSI").setValue(edt6.getText().toString());
                    myref.child("users").child("UID").child("nQsxL5ueaEPFQn6cwcMdlumMyl93").child("VLSI").setValue(edt7.getText().toString());
                    myref.child("users").child("UID").child("Cfz5LkLVMpfAs6rxgNSWRpETWTA2").child("VLSI").setValue(edt8.getText().toString());
                    myref.child("users").child("UID").child("FZ03ydMj3iZEBhqkTblmElJ0F2I2").child("VLSI").setValue(edt9.getText().toString());
                    myref.child("users").child("UID").child("pNzmDClyLyWiQeWnDC4E3Jqxzpr1").child("VLSI").setValue(edt10.getText().toString());

                }
                if (rb3.isChecked()) {
                    myref.child("users").child("UID").child("ZWzIfIUFjHZ53mcja4NmHg3gbWx1").child("WMC").setValue(edt1.getText().toString());
                    myref.child("users").child("UID").child("iSX7BobuWdYymZgiI2CCl1Scris1").child("WMC").setValue(edt2.getText().toString());
                    myref.child("users").child("UID").child("WuRgtqRPHRWeqCT4Iiy6cNqrJO52").child("WMC").setValue(edt3.getText().toString());
                    myref.child("users").child("UID").child("7JJpJNiR7lNENWzNEAnm72xQPr23").child("WMC").setValue(edt4.getText().toString());
                    myref.child("users").child("UID").child("KIgQ5xKfoOQ5TZGeqaVHmR8l7Bs2").child("WMC").setValue(edt5.getText().toString());
                    myref.child("users").child("UID").child("e4aMvuDm1rZytl60OP91kVP2EAw1").child("WMC").setValue(edt6.getText().toString());
                    myref.child("users").child("UID").child("nQsxL5ueaEPFQn6cwcMdlumMyl93").child("WMC").setValue(edt7.getText().toString());
                    myref.child("users").child("UID").child("Cfz5LkLVMpfAs6rxgNSWRpETWTA2").child("WMC").setValue(edt8.getText().toString());
                    myref.child("users").child("UID").child("FZ03ydMj3iZEBhqkTblmElJ0F2I2").child("WMC").setValue(edt9.getText().toString());
                    myref.child("users").child("UID").child("pNzmDClyLyWiQeWnDC4E3Jqxzpr1").child("WMC").setValue(edt10.getText().toString());

                }
                if (rb4.isChecked()) {
                    myref.child("users").child("UID").child("ZWzIfIUFjHZ53mcja4NmHg3gbWx1").child("IS").setValue(edt1.getText().toString());
                    myref.child("users").child("UID").child("iSX7BobuWdYymZgiI2CCl1Scris1").child("IS").setValue(edt2.getText().toString());
                    myref.child("users").child("UID").child("WuRgtqRPHRWeqCT4Iiy6cNqrJO52").child("IS").setValue(edt3.getText().toString());
                    myref.child("users").child("UID").child("7JJpJNiR7lNENWzNEAnm72xQPr23").child("IS").setValue(edt4.getText().toString());
                    myref.child("users").child("UID").child("KIgQ5xKfoOQ5TZGeqaVHmR8l7Bs2").child("IS").setValue(edt5.getText().toString());
                    myref.child("users").child("UID").child("e4aMvuDm1rZytl60OP91kVP2EAw1").child("IS").setValue(edt6.getText().toString());
                    myref.child("users").child("UID").child("nQsxL5ueaEPFQn6cwcMdlumMyl93").child("IS").setValue(edt7.getText().toString());
                    myref.child("users").child("UID").child("Cfz5LkLVMpfAs6rxgNSWRpETWTA2").child("IS").setValue(edt8.getText().toString());
                    myref.child("users").child("UID").child("FZ03ydMj3iZEBhqkTblmElJ0F2I2").child("IS").setValue(edt9.getText().toString());
                    myref.child("users").child("UID").child("pNzmDClyLyWiQeWnDC4E3Jqxzpr1").child("IS").setValue(edt10.getText().toString());
                }
            }
        });

        FirebaseUser currentFirebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        Toast.makeText(this, "" + currentFirebaseUser.getUid(), Toast.LENGTH_SHORT).show();

        String uid = currentFirebaseUser.getUid();
        FirebaseDatabase.getInstance().getReference().child("users").child(uid).child("attendance");


    }
}
