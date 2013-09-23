package com.example.umdf;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Manny on 9/16/13.
 */
public class Connect extends Activity {



        TextView mTextView;
        TextView mTextTwo;
        TextView mTextThree;
        String socialMedia;
        String phone;
        String email;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.connect_layout);

            ImageView Facebook = (ImageView) findViewById(R.id.facebookIcon);
            ImageView Twitter = (ImageView) findViewById(R.id.twitterIcon);
            ImageView GooglePlus = (ImageView) findViewById(R.id.googlePlusIcon);
            ImageView YouTube = (ImageView) findViewById(R.id.youTubeIcon);
            ImageView Email = (ImageView) findViewById(R.id.emailIconTwo);
            ImageView Phone = (ImageView) findViewById(R.id.phoneIconTwo);

            mTextView = (TextView)findViewById(R.id.socialMediaTextView);
            socialMedia = "Select Icon Below To Launch:";
            mTextView.setText(socialMedia);

            mTextTwo = (TextView) findViewById(R.id.phoneNumber);
            phone = "Call Us:";
            mTextTwo.setText(phone);

            mTextThree = (TextView) findViewById(R.id.email);
            email = "Email Us:";
            mTextThree.setText(email);


            Facebook.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Uri uri = Uri.parse("https://www.facebook.com/pages/United-Mitochondrial-Disease-Foundation/202570833099467");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

            Twitter.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Uri uri = Uri.parse("https://twitter.com/UMDF");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

            GooglePlus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Uri uri = Uri.parse("https://plus.google.com/109599791610901846365/posts");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

            YouTube.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Uri uri = Uri.parse("http://www.youtube.com/user/UMDF1");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

            Email.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Uri uri = Uri.parse("https://plus.google.com/109599791610901846365/posts");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

            Phone.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Uri uri = Uri.parse("https://plus.google.com/109599791610901846365/posts");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });


        }
    }


