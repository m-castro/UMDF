package com.example.umdf;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

/**
 * Created by Manny on 9/16/13.
 */
class Information extends MainActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_layout);

        Uri uri = Uri.parse("http://www.umdf.org/site/pp.aspx?c=8qKOJ0MvF7LUG&b=7934627");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);

//        WebView webview = new WebView(this);
//        setContentView(webview);
//
//        webview.loadUrl("http://www.umdf.org/site/pp.aspx?c=8qKOJ0MvF7LUG&b=7934627");

//        Bundle extras = getIntent().getExtras();
//        TextView infoView1 = (TextView) findViewById(R.id.infoView1);
//        if (extras != null) {
//        infoView1.setText(extras.getString("info"));
//        }
    }
}
