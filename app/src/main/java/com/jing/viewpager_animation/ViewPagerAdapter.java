package com.jing.viewpager_animation;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by Ding.pengqiang
 * on 2017/3/9.
 */

public class ViewPagerAdapter extends PagerAdapter{

    private List<View> data;

    public ViewPagerAdapter(List<View> data) {
        this.data = data;
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {


        container.addView(data.get(position));
        return data.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {


        container.removeView(data.get(position));
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {


        return view==object;
    }
}
