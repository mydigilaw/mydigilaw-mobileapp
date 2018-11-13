package cla.mdl.mydigi.law;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;


public class Maintanence_form extends AppCompatActivity {


    Typeface custom_font_2,custom_font_3;
    TextView tv2;
    AssetManager am;
  /*  AnimationDrawable animationDrawable;

    RelativeLayout relativeLayout;*/

    EditText e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16,e17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintanence_form);

        /* TextView tx = (TextView)findViewById(R.id.textView);*/
        tv2 = (TextView) findViewById(R.id.headingtv);
        e1=(EditText)findViewById(R.id.edt_1);
        e2=(EditText)findViewById(R.id.edt_2);
        e3=(EditText)findViewById(R.id.edt_3);
        e4=(EditText)findViewById(R.id.edt_4);
        e5=(EditText)findViewById(R.id.edt_5);
        e6=(EditText)findViewById(R.id.edt_6);
        e7=(EditText)findViewById(R.id.edt_7);
        e8=(EditText)findViewById(R.id.edt_8);
        e9=(EditText)findViewById(R.id.edt_9);
        e10=(EditText)findViewById(R.id.edt_10);
        e11=(EditText)findViewById(R.id.edt_11);
        e12=(EditText)findViewById(R.id.edt_12);
        e13=(EditText)findViewById(R.id.edt_13);
        e14=(EditText)findViewById(R.id.edt_14);
        e15=(EditText)findViewById(R.id.edt_15);
        e16=(EditText)findViewById(R.id.edt_16);
        e17=(EditText)findViewById(R.id.edt_17);














        custom_font_2 = Typeface.createFromAsset(getAssets(),  "fonts/Unquestionify01.ttf");
        tv2.setTypeface(custom_font_2);


        custom_font_3 = Typeface.createFromAsset(getAssets(), "fonts/yaldevi.jaffna-regular.ttf");
        e1.setTypeface(custom_font_3);
        e2.setTypeface(custom_font_3);
        e3.setTypeface(custom_font_3);
        e4.setTypeface(custom_font_3);
        e5.setTypeface(custom_font_3);
        e6.setTypeface(custom_font_3);
        e7.setTypeface(custom_font_3);
        e8.setTypeface(custom_font_3);
        e9.setTypeface(custom_font_3);
        e10.setTypeface(custom_font_3);
        e11.setTypeface(custom_font_3);
        e12.setTypeface(custom_font_3);
        e13.setTypeface(custom_font_3);
        e14.setTypeface(custom_font_3);
        e15.setTypeface(custom_font_3);
        e16.setTypeface(custom_font_3);
        e17.setTypeface(custom_font_3);






        //tv3=(TextView)findViewById(R.id.desc_tv);
/*
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Unquestionify01.ttf");
        tx.setTypeface(custom_font);*//*



      //  custom_font_3 = Typeface.createFromAsset(getAssets(),  "fonts/yaldevi.jaffna-regular.ttf");
       // tv3.setTypeface(custom_font_3);

        relativeLayout = (RelativeLayout)findViewById(R.id.relativeLayout);
        animationDrawable = (AnimationDrawable) relativeLayout.getBackground();
        animationDrawable.setEnterFadeDuration(5000);
        animationDrawable.setExitFadeDuration(2000);


    }

    @Override
    protected void onResume() {
        super.onResume();
        if (animationDrawable != null && !animationDrawable.isRunning())
            animationDrawable.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (animationDrawable != null && animationDrawable.isRunning())
            animationDrawable.stop();
    }*/
    }
    }
