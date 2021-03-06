package cla.mdl.mydigi.law;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;


import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.Profile;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
//import com.squareup.picasso.Picasso;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;

import java.util.Arrays;

import static android.provider.ContactsContract.Intents.Insert.EMAIL;


public class F_Signup extends AppCompatActivity {


    AnimationDrawable anim;
    AssetManager am;

    // LoginHelper loginHelper;
    Typeface typefaceLobster, typefaceArial;


    int RC_SIGN_IN = 232;


    TextView t1, t2, t3;
    EditText e1, e2, e3;
    Button b1,fb_s;
    ImageView i1, i2;
    GoogleSignInClient mGoogleSignInClient;
    LoginButton loginButton;
    CallbackManager callbackManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f__signup);


        t1 = (TextView) findViewById(R.id.lblHeader);
        e1 = (EditText) findViewById(R.id.edt_name);
        e2 = (EditText) findViewById(R.id.edt_email);
        e3 = (EditText) findViewById(R.id.edtPassword);
        b1 = (Button) findViewById(R.id.btnLogin);
        // i1=(ImageView)findViewById(R.id.imageView_f);
        i2 = (ImageView) findViewById(R.id.g_signin_im);

        fb_s = (Button) findViewById(R.id.fb);
        loginButton = findViewById(R.id.login_button);




        fb_s.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (v == fb_s)
                {
                    Toast.makeText(F_Signup.this, "Logging into facebook", Toast.LENGTH_SHORT).show();
                    loginButton.performClick();
                }
            }
        });


        loginButton.setReadPermissions(Arrays.asList("email", "public_profile"));

        typefaceLobster = Typeface.createFromAsset(getAssets(), "fonts/Unquestionify01.ttf");
        typefaceArial = Typeface.createFromAsset(getAssets(), "fonts/yaldevi.jaffna-regular.ttf");

        t1.setTypeface(typefaceLobster);
        e1.setTypeface(typefaceArial);
        e2.setTypeface(typefaceArial);
        e3.setTypeface(typefaceArial);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(F_Signup.this, "Server Busy.Try Sometime Later", Toast.LENGTH_SHORT).show();
            }
        });


/*
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(F_Signup.this, "Install Facebook app ", Toast.LENGTH_SHORT).show();
            }
        });*/

       /* i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(F_Signup.this, "Install Gmail app", Toast.LENGTH_SHORT).show();
            }
        });*/

        //Facebook Login
        boolean loggedOut = AccessToken.getCurrentAccessToken() == null;

        if (!loggedOut) {
           /* Picasso.with(MainActivity.this).load(Profile.getCurrentProfile().getProfilePictureUri(200, 200)).into(imageView);
            Log.d("TAG", "Username is: " + Profile.getCurrentProfile().getName());*/

            //Using Graph API
            getUserProfile(AccessToken.getCurrentAccessToken());
        }

        loginButton.setReadPermissions(Arrays.asList("email", "public_profile"));
        callbackManager = CallbackManager.Factory.create();

        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                // App code
                //loginResult.getAccessToken();
                //loginResult.getRecentlyDeniedPermissions()
                //loginResult.getRecentlyGrantedPermissions()
                boolean loggedIn = AccessToken.getCurrentAccessToken() == null;
                Log.d("API123", loggedIn + " ??");

            }

            @Override
            public void onCancel() {
                // App code
            }

            @Override
            public void onError(FacebookException exception) {
                // App code
            }
        });

        /*----------------------------------------------------------------------------------------*/
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();

        // Build a GoogleSignInClient with the options specified by gso.
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {

                    case R.id.g_signin_im:
                        Toast.makeText(F_Signup.this, "Logging into Gmail", Toast.LENGTH_SHORT).show();
                        signIn();
                        break;
                    // ...
                }
            }

            private void signIn() {
                Intent signInIntent = mGoogleSignInClient.getSignInIntent();
                startActivityForResult(signInIntent, RC_SIGN_IN);
            }
        });
    }


    //On Login - Facebook
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == RC_SIGN_IN) {
            // The Task returned from this call is always completed, no need to attach
            // a listener.
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            handleSignInResult(task);
        }
    }

    private void getUserProfile(AccessToken currentAccessToken) {
        GraphRequest request = GraphRequest.newMeRequest(
                currentAccessToken, new GraphRequest.GraphJSONObjectCallback() {
                    @Override
                    public void onCompleted(JSONObject object, GraphResponse response) {
                        Log.d("TAG", object.toString());
                        try {
                            String first_name = object.getString("first_name");
                            String last_name = object.getString("last_name");
                            String email = object.getString("email");
                            String id = object.getString("id");
                            String image_url = "https://graph.facebook.com/" + id + "/picture?type=normal";

                            //txtUsername.setText("First Name: " + first_name + "\nLast Name: " + last_name);
                            //txtEmail.setText(email);
                            //Picasso.with(MainActivity.this).load(image_url).into(imageView);

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                });

        Bundle parameters = new Bundle();
        parameters.putString("fields", "first_name,last_name,email,id");
        request.setParameters(parameters);
        request.executeAsync();

    }

   /*@Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Result returned from launching the Intent from GoogleSignInClient.getSignInIntent(...);
        if (requestCode == RC_SIGN_IN) {
            // The Task returned from this call is always completed, no need to attach
            // a listener.
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            handleSignInResult(task);
        }
    }*/

    private void handleSignInResult(Task<GoogleSignInAccount> completedTask) {
        try {
            GoogleSignInAccount account = completedTask.getResult(ApiException.class);

            // Signed in successfully, show authenticated UI.
            //updateUI(account);
        } catch (ApiException e) {
            // The ApiException status code indicates the detailed failure reason.
            // Please refer to the GoogleSignInStatusCodes class reference for more information.
            //og.w(TAG, "signInResult:failed code=" + e.getStatusCode());
            //updateUI(null);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

        // Check for existing Google Sign In account, if the user is already signed in
// the GoogleSignInAccount will be non-null.
        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(this);
        //updateUI(account);
    }
}
