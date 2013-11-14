package com.example.umdf;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by Manny on 9/16/13.
 */
public class Support extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.support_layout);

        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setDisplayHomeAsUpEnabled(true);

        ActionBar bar = getActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00713d")));

        Button Calendar = (Button) findViewById(R.id.eventcal);
        Button Form = (Button) findViewById(R.id.contacform);

        Calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Uri uri = Uri.parse("http://www.umdf.org/site/c.8qKOJ0MvF7LUG/b.7942591/k.9900/Event_Calendar/apps/cd/event.asp?event_date=&master_filter=");
//                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//                startActivity(intent);

                Intent intent = new Intent(getApplicationContext(),Calendar.class);
                startActivity(intent);

            }
        });

        Form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                setContentView(R.layout.contact_form);
                Intent intent = new Intent(getApplicationContext(),Donate.class);
                startActivity(intent);



            }




        });



    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case android.R.id.home:
                // app icon in action bar clicked; go home
                Intent intentHome = new Intent(this, MainActivity.class);
                intentHome.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intentHome);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}