package com.jing.viewpager_animation;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.jing.viewpager_animation.animation.ABaseTransformer;
import com.jing.viewpager_animation.animation.AccordionTransformer;
import com.jing.viewpager_animation.animation.BackgroundToForegroundTransformer;
import com.jing.viewpager_animation.animation.CubeInTransformer;
import com.jing.viewpager_animation.animation.CubeOutTransformer;
import com.jing.viewpager_animation.animation.DefaultTransformer;
import com.jing.viewpager_animation.animation.DepathTransformer;
import com.jing.viewpager_animation.animation.FlipHorizontalTransformer;
import com.jing.viewpager_animation.animation.FlipVerticalTransformer;
import com.jing.viewpager_animation.animation.ForegroundToBackgroundTransformer;
import com.jing.viewpager_animation.animation.RotateDownPageTransformer;
import com.jing.viewpager_animation.animation.RotateDownTransformer;
import com.jing.viewpager_animation.animation.StackTransformer;
import com.jing.viewpager_animation.animation.TabletTransformer;
import com.jing.viewpager_animation.animation.ZoomInTransformer;
import com.jing.viewpager_animation.animation.ZoomOutSlideTransformer;
import com.jing.viewpager_animation.animation.ZoomOutTranformer;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;

    private int [] image={R.mipmap.a1,R.mipmap.a2,R.mipmap.a3,R.mipmap.a4};
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }



    private void initView() {
        mViewPager = (ViewPager) findViewById(R.id.viewPager);
    }

    private void initData() {
        List<View>data=new ArrayList<>();
        for (int i = 0; i < image.length ; i++) {
            ImageView imageView=new ImageView(this);
            imageView.setImageResource(image[i]);
            data.add(imageView);
        }
        Log.e("TAG", "initData: 集合个数" +data.size());


        mViewPager.setPageTransformer(true, new ZoomOutTranformer());
        adapter = new ViewPagerAdapter(data);
        mViewPager.setAdapter(adapter);
    }
}
