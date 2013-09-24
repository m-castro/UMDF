package com.example.umdf;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                Intent myIntent = new Intent(MainActivity.this, Donate.class);
                MainActivity.this.startActivity(myIntent);
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


    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
        }














