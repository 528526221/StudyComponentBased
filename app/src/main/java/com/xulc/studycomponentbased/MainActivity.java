package com.xulc.studycomponentbased;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openLoginModule(View view) {
        // 1. Simple jump within application (Jump via URL in 'Advanced usage')
        ARouter.getInstance().build("/login/loginActivity").navigation();

// 2. Jump with parameters
//        ARouter.getInstance().build("/test/1")
//                .withLong("key1", 666L)
//                .withString("key3", "888")
//                .withObject("key4", new Test("Jack", "Rose"))
//                .navigation();
    }
}
