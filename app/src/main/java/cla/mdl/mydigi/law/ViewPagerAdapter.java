package cla.mdl.mydigi.law;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class ViewPagerAdapter extends PagerAdapter
{

    int [] image;
    LayoutInflater inflater;
    Context context;

    public ViewPagerAdapter(F_Customer_Testimonial mainActivity, int [] img)
    {
        this.context=mainActivity;
        this.image=img;
    }

    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==((RelativeLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position)
    {
        ImageView trailimg;
        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemview=inflater.inflate(R.layout.testimonial_item,container,false);
        trailimg=(ImageView)itemview.findViewById(R.id.trailing );
        trailimg.setImageResource(image[position]);

        ((ViewPager)container).addView(itemview);

        return itemview;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ((ViewPager)container).removeView((RelativeLayout)object);
    }
}

