package cla.mdl.mydigi.law;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;



public class F_PersonalLAw extends AppCompatActivity {

    TextView t1,t2,t3,t4,t5,t6,t7,t8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f__personal_law);

        t1=(TextView)findViewById(R.id.tv_maintanence_law);
        t2=(TextView)findViewById(R.id.tv_divorce_law);
        t3=(TextView)findViewById(R.id.tv_property_law);
        t4=(TextView)findViewById(R.id.tv_disputes_law);
        t5=(TextView)findViewById(R.id.tv_personal_law);
        t6=(TextView)findViewById(R.id.tv_online_law);
        t7=(TextView)findViewById(R.id.tv_passport_law);
        t8=(TextView)findViewById(R.id.tv_councelling_law);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(F_PersonalLAw.this,F_Maintenance_Law.class);
                startActivity(i);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(F_PersonalLAw.this,F_Divorce_Law.class);
                startActivity(i);
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(F_PersonalLAw.this,F_Property_Law.class);
                startActivity(i);
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(F_PersonalLAw.this,F_Disputes_Law.class);
                startActivity(i);
            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(F_PersonalLAw.this,F_PersonalLAw.class);
                startActivity(i);
            }
        });
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(F_PersonalLAw.this,F_Online_Law.class);
                startActivity(i);
            }
        });
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(F_PersonalLAw.this,F_Passport_Law.class);
                startActivity(i);
            }
        });
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(F_PersonalLAw.this,F_Counselling_Law.class);
                startActivity(i);
            }
        });
    }
}
