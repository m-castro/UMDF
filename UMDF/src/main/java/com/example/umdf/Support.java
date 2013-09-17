package com.example.umdf;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/**
 * Created by Manny on 9/16/13.
 */
public class Support extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connect_layout);

        Uri uri = Uri.parse("http://www.umdf.org/site/c.8qKOJ0MvF7LUG/b.7978381/k.241C/Chapters_and_Groups_Contact_Form/apps/ka/ct/contactus.asp?c=8qKOJ0MvF7LUG&b=7978381&en=9sJHKUOzF8JQI4OCJ7IMI6PTLrK1KdMPIgKPL9PUJwH");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);

    }
}