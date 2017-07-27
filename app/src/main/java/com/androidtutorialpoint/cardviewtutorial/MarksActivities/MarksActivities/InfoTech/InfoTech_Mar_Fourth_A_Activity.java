package com.androidtutorialpoint.cardviewtutorial.MarksActivities.MarksActivities.InfoTech;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.CheckBox;

import com.androidtutorialpoint.cardviewtutorial.R;
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

                if (rb1.isChecked()) {
                    myref.child("it").child("IV Year").child("Sec A").child("001").child("MWT").setValue(edt1.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("002").child("MWT").setValue(edt2.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("003").child("MWT").setValue(edt3.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("004").child("MWT").setValue(edt4.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("005").child("MWT").setValue(edt5.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("006").child("MWT").setValue(edt6.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("007").child("MWT").setValue(edt7.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("008").child("MWT").setValue(edt8.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("009").child("MWT").setValue(edt9.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("010").child("MWT").setValue(edt10.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("012").child("MWT").setValue(edt12.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("013").child("MWT").setValue(edt13.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("014").child("MWT").setValue(edt14.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("015").child("MWT").setValue(edt15.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("016").child("MWT").setValue(edt16.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("017").child("MWT").setValue(edt17.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("018").child("MWT").setValue(edt18.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("019").child("MWT").setValue(edt19.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("020").child("MWT").setValue(edt20.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("021").child("MWT").setValue(edt21.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("022").child("MWT").setValue(edt22.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("023").child("MWT").setValue(edt23.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("024").child("MWT").setValue(edt24.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("025").child("MWT").setValue(edt25.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("026").child("MWT").setValue(edt26.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("027").child("MWT").setValue(edt27.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("028").child("MWT").setValue(edt28.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("029").child("MWT").setValue(edt29.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("030").child("MWT").setValue(edt30.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("031").child("MWT").setValue(edt31.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("032").child("MWT").setValue(edt32.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("033").child("MWT").setValue(edt33.getText().toString());

                }


                if (rb2.isChecked()) {
                    myref.child("it").child("IV Year").child("Sec A").child("001").child("VLSI").setValue(edt1.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("002").child("VLSI").setValue(edt2.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("003").child("VLSI").setValue(edt3.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("004").child("VLSI").setValue(edt4.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("005").child("VLSI").setValue(edt5.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("006").child("VLSI").setValue(edt6.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("007").child("VLSI").setValue(edt7.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("008").child("VLSI").setValue(edt8.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("009").child("VLSI").setValue(edt9.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("010").child("VLSI").setValue(edt10.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("012").child("VLSI").setValue(edt12.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("013").child("VLSI").setValue(edt13.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("014").child("VLSI").setValue(edt14.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("015").child("VLSI").setValue(edt15.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("016").child("VLSI").setValue(edt16.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("017").child("VLSI").setValue(edt17.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("018").child("VLSI").setValue(edt18.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("019").child("VLSI").setValue(edt19.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("020").child("VLSI").setValue(edt20.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("021").child("VLSI").setValue(edt21.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("022").child("VLSI").setValue(edt22.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("023").child("VLSI").setValue(edt23.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("024").child("VLSI").setValue(edt24.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("025").child("VLSI").setValue(edt25.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("026").child("VLSI").setValue(edt26.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("027").child("VLSI").setValue(edt27.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("028").child("VLSI").setValue(edt28.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("029").child("VLSI").setValue(edt29.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("030").child("VLSI").setValue(edt30.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("031").child("VLSI").setValue(edt31.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("032").child("VLSI").setValue(edt32.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("033").child("VLSI").setValue(edt33.getText().toString());
                }
                if (rb3.isChecked()) {
                    myref.child("it").child("IV Year").child("Sec A").child("001").child("WMC").setValue(edt1.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("002").child("WMC").setValue(edt2.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("003").child("WMC").setValue(edt3.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("004").child("WMC").setValue(edt4.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("005").child("WMC").setValue(edt5.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("006").child("WMC").setValue(edt6.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("007").child("WMC").setValue(edt7.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("008").child("WMC").setValue(edt8.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("009").child("WMC").setValue(edt9.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("010").child("WMC").setValue(edt10.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("012").child("WMC").setValue(edt12.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("013").child("WMC").setValue(edt13.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("014").child("WMC").setValue(edt14.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("015").child("WMC").setValue(edt15.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("016").child("WMC").setValue(edt16.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("017").child("WMC").setValue(edt17.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("018").child("WMC").setValue(edt18.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("019").child("WMC").setValue(edt19.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("020").child("WMC").setValue(edt20.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("021").child("WMC").setValue(edt21.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("022").child("WMC").setValue(edt22.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("023").child("WMC").setValue(edt23.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("024").child("WMC").setValue(edt24.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("025").child("WMC").setValue(edt25.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("026").child("WMC").setValue(edt26.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("027").child("WMC").setValue(edt27.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("028").child("WMC").setValue(edt28.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("029").child("WMC").setValue(edt29.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("030").child("WMC").setValue(edt30.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("031").child("WMC").setValue(edt31.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("032").child("WMC").setValue(edt32.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("033").child("WMC").setValue(edt33.getText().toString());
                }
                if (rb4.isChecked()) {
                    myref.child("it").child("IV Year").child("Sec A").child("001").child("IS").setValue(edt1.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("002").child("IS").setValue(edt2.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("003").child("IS").setValue(edt3.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("004").child("IS").setValue(edt4.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("005").child("IS").setValue(edt5.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("006").child("IS").setValue(edt6.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("007").child("IS").setValue(edt7.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("008").child("IS").setValue(edt8.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("009").child("IS").setValue(edt9.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("010").child("IS").setValue(edt10.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("012").child("IS").setValue(edt12.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("013").child("IS").setValue(edt13.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("014").child("IS").setValue(edt14.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("015").child("IS").setValue(edt15.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("016").child("IS").setValue(edt16.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("017").child("IS").setValue(edt17.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("018").child("IS").setValue(edt18.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("019").child("IS").setValue(edt19.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("020").child("IS").setValue(edt20.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("021").child("IS").setValue(edt21.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("022").child("IS").setValue(edt22.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("023").child("IS").setValue(edt23.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("024").child("IS").setValue(edt24.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("025").child("IS").setValue(edt25.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("026").child("IS").setValue(edt26.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("027").child("IS").setValue(edt27.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("028").child("IS").setValue(edt28.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("029").child("IS").setValue(edt29.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("030").child("IS").setValue(edt30.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("031").child("IS").setValue(edt31.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("032").child("IS").setValue(edt32.getText().toString());
                    myref.child("it").child("IV Year").child("Sec A").child("033").child("IS").setValue(edt33.getText().toString());
                }
            }
        });

    }
}
