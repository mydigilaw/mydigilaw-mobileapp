package cla.mdl.mydigi.law;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


public class F_HomeScreen_Activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, OnMapReadyCallback {


    ImageView i1,i2;
    ImageView fb_login;

    ImageView sf,sg,sln,stw;

    Typeface custom_font_3;
    AssetManager am;

    TextView aboutustv;
    private GoogleMap mMap;

    private static final String EMAIL = "email";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f__home_screen_);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map2);
        mapFragment.getMapAsync(F_HomeScreen_Activity.this);


        i1=(ImageView)findViewById(R.id.im_personallaw);
        i2=(ImageView)findViewById(R.id.im_coporatelaw);

        sf=(ImageView)findViewById(R.id.s_fb);
        sg=(ImageView)findViewById(R.id.s_google);
        sln=(ImageView)findViewById(R.id.s_linkedin);
        stw=(ImageView)findViewById(R.id.s_twitter);



        sf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.facebook.com/mydigilaw/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


        sg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.facebook.com/mydigilaw/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        sln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://in.linkedin.com/company/mydigilaw";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        stw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "hhttps://twitter.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });








        aboutustv=(TextView)findViewById(R.id.tv_aboutus);

        custom_font_3 = Typeface.createFromAsset(getAssets(),  "fonts/yaldevi.jaffna-regular.ttf");
        aboutustv.setTypeface(custom_font_3);

       /*// private static final String EMAIL = "email";

        fb_login = (LoginButton) findViewById(R.id.login_button);
        loginButton.setReadPermissions(Arrays.asList(EMAIL));
        // If you are using in a fragment, call loginButton.setFragment(this);

        // Callback registration
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                // App code
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
*/
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(F_HomeScreen_Activity.this,F_PersonalLAw.class);
                startActivity(i);

            }
        });


        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(F_HomeScreen_Activity.this,F_CoporateLaw.class);
                startActivity(i);

            }
        });


      /*  FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.f__home_screen_, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.aboutus)
        {
            // Handle the camera action
            Intent i = new Intent(F_HomeScreen_Activity.this,F_AboutUs.class);
            startActivity(i);
        }


        else if (id == R.id.signup)
        {
            Intent i = new Intent(F_HomeScreen_Activity.this,F_Signin.class);
            startActivity(i);

        }
        else if (id == R.id.testimonials)
        {
            Intent k=new Intent(F_HomeScreen_Activity.this,F_Customer_Testimonial.class);
            startActivity(k);

        }
        else if (id == R.id.contactus)
        {
            Intent k=new Intent(F_HomeScreen_Activity.this,F_Map_Contact.class);
            startActivity(k);
        }
        else if (id == R.id.nav_share)
        {
            String url = "https://play.google.com/store/apps/details?id=cla.mdl.mydigi.law";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }
        else if (id == R.id.nav_send)
        {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onMapReady(GoogleMap googleMap)
    {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(13.090512, 80.28833800000007);
        // mMap.addMarker(new MarkerOptions().position(sydney).title("MyDigiLAw"));
        mMap.moveCamera( CameraUpdateFactory.newLatLngZoom(new LatLng(13.090512, 80.28833800000007) , 14) );
        Marker marker = mMap.addMarker(new MarkerOptions().position(sydney).title("MyDigiLaw"));
        marker.showInfoWindow();
        // mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));


        googleMap.getUiSettings().setZoomControlsEnabled(true);
        /*googleMap.getUiSettings().setRotateGesturesEnabled(true);
        googleMap.getUiSettings().setScrollGesturesEnabled(true);
        googleMap.getUiSettings().setTiltGesturesEnabled(true);*/


    }

}
