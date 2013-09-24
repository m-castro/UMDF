package com.example.umdf;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
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

        Button Calendar = (Button) findViewById(R.id.eventcal);
        Button Form = (Button) findViewById(R.id.contacform);

        Calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uri = Uri.parse("http://www.umdf.org/site/c.8qKOJ0MvF7LUG/b.7942591/k.9900/Event_Calendar/apps/cd/event.asp?event_date=&master_filter=");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

        Form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.contact_form);


            }
        });



    }
}