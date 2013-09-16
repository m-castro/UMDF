package com.example.umdf;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button infoButton = (Button) findViewById(R.id.information);
        Button connectButton = (Button) findViewById(R.id.connect);
        Button donateButton = (Button) findViewById(R.id.donate);
        Button contactButton = (Button) findViewById(R.id.contact);

        infoButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                setContentView(R.layout.info_layout);
//                Intent infoIntent = new Intent(setContentView(R.layout.info_layout));
            }
        });

        connectButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                setContentView(R.layout.connect_layout);
            }
        });

        donateButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                setContentView(R.layout.donate_layout);
            }
        });

        contactButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                setContentView(R.layout.contact_layout);
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
