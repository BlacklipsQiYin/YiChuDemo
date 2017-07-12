package com.baway.fuxuewei.yichudemo;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    static Demo sDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (sDemo == null) {
             sDemo = new Demo();
            }
        finish();
        }

        class Demo {
        }




}
