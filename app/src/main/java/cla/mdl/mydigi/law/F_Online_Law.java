package cla.mdl.mydigi.law;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;


public class F_Online_Law extends AppCompatActivity {


    Typeface custom_font_2,custom_font_3;
    TextView tv1,tv2,tv3;
    AnimationDrawable animationDrawable;
    AssetManager am;
    FrameLayout relativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f__descrption);

        tv1=(TextView)findViewById(R.id.tvheading);
        tv2=(TextView)findViewById(R.id.tvdesc);
        tv3=(TextView)findViewById(R.id.tvraise);


        custom_font_2 = Typeface.createFromAsset(getAssets(),  "fonts/Unquestionify01.ttf");
        custom_font_3 = Typeface.createFromAsset(getAssets(),  "fonts/yaldevi.jaffna-regular.ttf");


        relativeLayout = (FrameLayout) findViewById(R.id.relativeLayout);
        animationDrawable = (AnimationDrawable) relativeLayout.getBackground();


        tv1.setTypeface(custom_font_3);
        tv2.setTypeface(custom_font_3);
        tv3.setTypeface(custom_font_3);






        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(F_Online_Law.this,Maintanence_form.class);
                startActivity(i);
            }
        });
    }
}
