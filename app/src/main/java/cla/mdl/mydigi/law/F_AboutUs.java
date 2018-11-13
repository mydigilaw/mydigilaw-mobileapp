package cla.mdl.mydigi.law;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;



public class F_AboutUs extends AppCompatActivity {

    Typeface custom_font_2,custom_font_3;
    TextView tv2,tv3;
    AnimationDrawable animationDrawable;
    AssetManager am;
    RelativeLayout relativeLayout;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        /* TextView tx = (TextView)findViewById(R.id.textView);*/
        tv2 = (TextView)findViewById(R.id.aboutus_tv);
        tv3=(TextView)findViewById(R.id.desc_tv);
/*
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Unquestionify01.ttf");
        tx.setTypeface(custom_font);*/

        custom_font_2 = Typeface.createFromAsset(getAssets(),  "fonts/Unquestionify01.ttf");
        tv2.setTypeface(custom_font_2);

        custom_font_3 = Typeface.createFromAsset(getAssets(),  "fonts/yaldevi.jaffna-regular.ttf");
        tv3.setTypeface(custom_font_3);

        relativeLayout = (RelativeLayout)findViewById(R.id.relativeLayout);
        animationDrawable = (AnimationDrawable) relativeLayout.getBackground();
   /*     animationDrawable.setEnterFadeDuration(5000);
        animationDrawable.setExitFadeDuration(2000);*/


    }

   /* @Override
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