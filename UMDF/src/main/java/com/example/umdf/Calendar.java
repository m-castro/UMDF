package com.example.umdf;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;


/**
 * Created by 3digital on 11/14/13.
 */
public class Calendar extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar bar = getActionBar();

        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setDisplayHomeAsUpEnabled(true);


        MonthView mv = new MonthView(this);
        setContentView(mv);
    }
}
