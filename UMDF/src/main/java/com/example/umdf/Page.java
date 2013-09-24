package com.example.umdf;

/**
 * Created by Manny on 9/23/13.
 */
public class Page {
    public String mNameOfPage;
    public String mUrl;

    public Page (String startNameOfPage, String startUrl){
        this.mNameOfPage = startNameOfPage;
        this.mUrl = startUrl;
    }

    public String getmUrl() {
        return mUrl;
    }
}

