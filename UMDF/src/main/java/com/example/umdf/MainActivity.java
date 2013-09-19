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
//                infoIntent.putExtra(" ", " ");
                startActivity(infoIntent);
//                setContentView(R.layout.info_layout);
//                Intent infoIntent = new Intent(setContentView(R.layout.info_layout));
            }
        });

        supportButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent connectIntent = new Intent(getApplicationContext(), Support.class);
                startActivity(connectIntent);
//                setContentView(R.layout.support_layout);
            }
        });

        donateButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
//                setContentView(R.layout.donate_layout);
                Intent donateIntent = new Intent(getApplicationContext(), Donate.class);
                startActivity(donateIntent);
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
