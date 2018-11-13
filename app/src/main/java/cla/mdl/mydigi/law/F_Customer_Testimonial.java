package cla.mdl.mydigi.law;

import android.content.Context;
import android.os.Handler;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;

public class F_Customer_Testimonial extends AppCompatActivity
{

    ViewPager viewPager;
    PagerAdapter adapter;
    int [] img;
    private static int currentpage=0;
    private static int numpages=0;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f__customer__testimonial2);

        img=new int[]{R.drawable.image6,R.drawable.image7,R.drawable.image6,R.drawable.image7};

        viewPager =(ViewPager)findViewById(R.id.pager);
        adapter=new ViewPagerAdapter(F_Customer_Testimonial.this,img);
        viewPager.setAdapter(adapter);

        CircleIndicator indicator=(CircleIndicator)findViewById(R.id.indicator);
        indicator.setViewPager(viewPager);

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                currentpage=position;

            }

            @Override
            public void onPageScrollStateChanged(int state)
            {
                if (state==ViewPager.SCROLL_STATE_IDLE)
                {
                    int pagecount=img.length;
                    if(currentpage==0)
                    {
                        viewPager.setCurrentItem(pagecount-1,false);
                    }
                    else if(currentpage==pagecount-1)
                    {
                        viewPager.setCurrentItem(0,false);
                    }
                }


            }
        });


        final Handler handler=new Handler();
        final Runnable update= new Runnable() {
            @Override
            public void run() {
                if(currentpage==numpages)
                {
                    currentpage=0;

                }

                viewPager.setCurrentItem(currentpage++,true);

            }
        };

        Timer swipe= new Timer();
        swipe.schedule(new TimerTask() {
            @Override
            public void run()
            {
                handler.post(update);
            }
        },1000,1000 );

    }
}
