package com.example.umdf;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {


//    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ActionBar bar = getActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00713d")));


        Button infoButton = (Button) findViewById(R.id.information);
        Button supportButton = (Button) findViewById(R.id.connect);
        Button donateButton = (Button) findViewById(R.id.donate);
        Button connectButton = (Button) findViewById(R.id.contact);


        infoButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent infoIntent = new Intent(getApplicationContext(), Information.class);
                startActivity(infoIntent);
//
            }
        });

        supportButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent connectIntent = new Intent(MainActivity.this, Support.class);
                MainActivity.this.startActivity(connectIntent);


            }
        });

        donateButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Uri uri = Uri.parse("https://secure.umdf.org/site/apps/ka/sd/donor.asp?c=8qKOJ0MvF7LUG&b=7966007&en=joLIIKNoH3IALNOpG4IBJOOnFeKVK0PyEkLLLPPrE7KDJPOzFsG");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);


                // setContentView(R.layout.contact_form);
                //Intent donateIntent = new Intent(getApplicationContext(), Donate.class);
                //startActivity(donateIntent);

                //Intent myIntent = new Intent(MainActivity.this, Donate.class);
                //MainActivity.this.startActivity(myIntent);
            }
        });

        connectButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
//                setContentView(R.layout.connect_layout);
                Intent connectIntent = new Intent(getApplicationContext(), Connect.class);
                startActivity(connectIntent);
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }



}
