package com.amenuo.gittest0822_1045;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        if (true) {
            Log.i("tag1-","1");
            Log.i("tag1-","2");
            Log.i("tag1-","3");
        }
    }
}
