package com.example.android.sveteam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void scalePic(){
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.activity_main);
        int w, h;
        w = linearLayout.getWidth();
        h = 2;
        ImageView imageView = (ImageView) findViewById(R.id.lable_pic);
        imageView.setMaxWidth(w);
        imageView.setMinimumWidth(w);
        imageView.setMaxHeight(h);
        imageView.setMinimumHeight(h);

    }
}
