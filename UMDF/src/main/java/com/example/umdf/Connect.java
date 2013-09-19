package com.example.umdf;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Manny on 9/16/13.
 */
public class Connect extends Activity {

    TextView mTextView;
    String socialMedia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connect_layout);

        mTextView = (TextView)findViewById(R.id.socialMediaTextView);

        socialMedia = "Selecting any of the icons below\n" +
                "will launch that particular social media site for the UMDF";

        mTextView.setText(socialMedia);

//        Uri uri = Uri.parse("https://www.facebook.com/pages/United-Mitochondrial-Disease-Foundation/202570833099467");
//        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//        startActivity(intent);
    }
}