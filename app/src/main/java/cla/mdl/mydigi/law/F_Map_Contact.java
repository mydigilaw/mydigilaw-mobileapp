package cla.mdl.mydigi.law;

import android.location.Location;
import android.provider.SyncStateContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

//activity_f__map__contact
public class F_Map_Contact extends AppCompatActivity implements OnMapReadyCallback {


    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f__map__contact);
       /* Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);




    }

    @Override
    public void onMapReady(final GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(13.090512, 80.28833800000007);
       // mMap.addMarker(new MarkerOptions().position(sydney).title("MyDigiLAw"));
        mMap.moveCamera( CameraUpdateFactory.newLatLngZoom(new LatLng(13.090512, 80.28833800000007) , 20) );
        Marker marker = mMap.addMarker(new MarkerOptions().position(sydney).title("MyDigiLaw"));
        marker.showInfoWindow();
       // mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));


        googleMap.getUiSettings().setZoomControlsEnabled(true);
        googleMap.getUiSettings().setRotateGesturesEnabled(false);
        googleMap.getUiSettings().setScrollGesturesEnabled(false);
        googleMap.getUiSettings().setTiltGesturesEnabled(false);


     /*   mMap.setOnMyLocationChangeListener(new GoogleMap.OnMyLocationChangeListener() {
            @Override
            public void onMyLocationChange(Location location) {

                CameraUpdate center=CameraUpdateFactory.newLatLng(new LatLng(location.getLatitude(), location.getLongitude()));
                CameraUpdate zoom=CameraUpdateFactory.zoomTo(20);
                mMap.moveCamera(center);
                mMap.animateCamera(zoom);

            }
        });*/

       /* float zoom = mMap.getCameraPosition().zoom;


//To set that just use

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(13.090512, 80.28833800000007),zoom));*/

/*
        // update map view
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, googleMap.getCameraPosition().zoom));*/

        /*googleMap.setOnCameraChangeListener(new GoogleMap.OnCameraChangeListener() {
            @Override
            public void onCameraChange(CameraPosition position) {
                if (!isMapChangeRequired) {
                    isMapChangeRequired = true;
                    return;
                }
                //double meterDistance = objUtils.getDistanceInMeter(l.latitude, llSprenter.longitude, llTO.latitude, llTO.longitude);
                //float Zoomlevel = (float)((float) objUtils.getZoomForMetersWide(meterDistance, llTO.latitude) – 0.3);
                if (Zoomlevel != ZOOM_LEVEL) {
                    ZOOM_LEVEL = Zoomlevel;
                    googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(llTO, (float) ZOOM_LEVEL));

                } else {
                    googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(llTO, mGoogleMap.getCameraPosition().zoom));
                }
                isMapChangeRequired = false;
            }
        });
*/
    }


}