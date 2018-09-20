package com.caojianfeng.testfm;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import me.yokeyword.fragmentation.Fragmentation;
import me.yokeyword.fragmentation.SupportActivity;

public class MainActivity extends SupportActivity implements OnFragmentInteractionListener, View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if (findFragment(HomeFragment.class) == null) {
            loadRootFragment(R.id.fl_container, HomeFragment.newInstance());  //load root Fragment
        }
        findViewById(R.id.tv_page_a).setOnClickListener(this);
        findViewById(R.id.tv_page_b).setOnClickListener(this);
        ((TextView)findViewById(R.id.tv_mode)).setText("mode:"+Fragmentation.getDefault().getMode());
    }

    @Override
    public void onClick(View v) {
        int vid = v.getId();
        if (vid == R.id.tv_page_a) {
            popTo(HomeFragment.class,false);
            start(PageAFragment.newInstance("", ""));
        } else if (vid == R.id.tv_page_b) {
            popTo(HomeFragment.class,false);
            start(PageBFragment.newInstance("", ""));
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
