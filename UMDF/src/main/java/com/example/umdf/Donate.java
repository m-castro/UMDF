package com.example.umdf;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

/**
 * Created by Manny on 9/16/13.
 */
public class Donate extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_form);

//        getActionBar().setHomeButtonEnabled(true);
//        getActionBar().setDisplayHomeAsUpEnabled(true);

        ActionBar bar = getActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00713d")));



        //Uri uri = Uri.parse("https://secure.umdf.org/site/apps/ka/sd/donor.asp?c=8qKOJ0MvF7LUG&b=7966007&en=joLIIKNoH3IALNOpG4IBJOOnFeKVK0PyEkLLLPPrE7KDJPOzFsG");
        //Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        //startActivity(intent);
    }
}
