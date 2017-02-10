package com.example.android.sveteam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void scaleLayout() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.activity_main);
        int w, h;
        w = linearLayout.getWidth();
        h = linearLayout.getHeight();
        LinearLayout ll = (LinearLayout) findViewById(R.id.ll_content);
        ll.setLayoutParams(new LinearLayout.LayoutParams(w, h));
    }

    private void scalePic() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.activity_main);
        int w, h;
        w = linearLayout.getWidth();
        h = w/2;
        ImageView imageView = (ImageView) findViewById(R.id.lable_pic);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(w, h));
    }



    private void changeTextViewContent(String str) {
        TextView textView = (TextView) findViewById(R.id.textview_news);
        textView.setText(str);
    }

    public void changeToNews(View view) {
//        scalePic();
//        scaleLayout();
        makeNewsVisible(true);
        makeInfoVisible(false);
        makeTableVisible(false);

        TextView textView = (TextView) findViewById(R.id.textview_header2);
        textView.setText(getString(R.string.headerContentNews));

    }

    public void changeToTable(View view) {
        makeTableVisible(true);
        makeInfoVisible(false);
        makeNewsVisible(false);
        TextView textView = (TextView) findViewById(R.id.textview_header2);
        textView.setText(getString(R.string.headerContentTable));
    }

    public void changeToInfo(View view) {
        makeNewsVisible(false);
        makeInfoVisible(true);
        makeTableVisible(false);
        TextView textView = (TextView) findViewById(R.id.textview_header2);
        textView.setText(getString(R.string.headerContentInfo));
    }

    //visibility of content

    private void makeNewsVisible(boolean boo) {
        if (boo) {
            TextView textView = (TextView) findViewById(R.id.textview_news);
            textView.setVisibility(View.VISIBLE);
        } else {
            TextView textView = (TextView) findViewById(R.id.textview_news);
            textView.setVisibility(View.GONE);

        }

    }

    private void makeInfoVisible(boolean boo) {
        if (boo) {
            TextView textView = (TextView) findViewById(R.id.textview_info);
            textView.setVisibility(View.VISIBLE);
        } else {
            TextView textView = (TextView) findViewById(R.id.textview_info);
            textView.setVisibility(View.GONE);

        }

    }

    private void makeTableVisible(boolean boo) {
        if (boo) {
            ImageView img = (ImageView) findViewById(R.id.content_table);
            img.setVisibility(View.VISIBLE);
        } else {
            ImageView img = (ImageView) findViewById(R.id.content_table);
            img.setVisibility(View.GONE);

        }

    }


}
