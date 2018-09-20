package com.caojianfeng.testfm;

import android.app.Application;

import me.yokeyword.fragmentation.Fragmentation;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fragmentation.builder()
                // show stack view. Mode: BUBBLE, SHAKE, NONE
                .stackViewMode(Fragmentation.BUBBLE)
                .debug(BuildConfig.DEBUG)
                .install();
    }
}
