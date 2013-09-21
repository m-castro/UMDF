package com.example.umdf;

import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by 3digital on 9/20/13.
 */
public class WebViewPage extends Information {

    @Override
    public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.webview);


    WebView wbView = (WebView) findViewById(R.id.WebView);
    wbView.getSettings().setJavaScriptEnabled(true);
    wbView.loadUrl("http://www.google.com");

}



}