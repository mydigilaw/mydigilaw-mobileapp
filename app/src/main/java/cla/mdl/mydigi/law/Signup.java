package cla.mdl.mydigi.law;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class Signup extends AppCompatActivity {

    AnimationDrawable anim;
    AssetManager am;

    //LoginHelper loginHelper;
    Typeface typefaceLobster, typefaceArial;
    TextView lblHeader;

    EditText edtPassword, edtEmail,etname;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            findViewById(android.R.id.content).setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
        }

        setContentView(R.layout.signup);
        am = this.getApplicationContext().getAssets();
        RelativeLayout container = (RelativeLayout) findViewById(R.id.container);
        anim = (AnimationDrawable) container.getBackground();
        anim.setEnterFadeDuration(100);
        anim.setExitFadeDuration(1000);

        // loginHelper = new LoginHelper(MainActivity.this);

        typefaceLobster = Typeface.createFromAsset(getAssets(), "fonts/Unquestionify01.ttf");
        typefaceArial = Typeface.createFromAsset(getAssets(), "fonts/freeroad.light-regular.ttf");



        lblHeader = (TextView) findViewById(R.id.lblHeader);
        lblHeader.setTypeface(typefaceLobster);

        edtPassword = (EditText) findViewById(R.id.edtPassword);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        etname=(EditText)findViewById(R.id.edtName_1);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        edtPassword.setTypeface(typefaceArial);
        edtEmail.setTypeface(typefaceArial);
        etname.setTypeface(typefaceArial);
        /* btnLogin.setTypeface(typefaceArial);*/

    }

    @Override
    protected void onResume() {
        super.onResume();
        if (anim != null && !anim.isRunning())
            anim.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (anim != null && anim.isRunning())
            anim.stop();
    }
}