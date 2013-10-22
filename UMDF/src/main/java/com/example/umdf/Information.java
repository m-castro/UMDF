package com.example.umdf;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by Manny on 9/16/13.
 */
public class Information  extends Activity {

    private ListView mListView;
    private PlaceAdapter placeAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_layout);

        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setDisplayHomeAsUpEnabled(true);

        ActionBar bar = getActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00713d")));



        Page[] myPagesArray = new Page[]
                {
                        new Page("What is Mitochondrial Disease?", "http://www.umdf.org/site/pp.aspx?c=8qKOJ0MvF7LUG&b=7934627"),
                        new Page("Types of Mitochondrial Disease", "http://www.umdf.org/site/pp.aspx?c=8qKOJ0MvF7LUG&b=7934629"),
                        new Page("Possible Symptoms", "http://www.umdf.org/site/pp.aspx?c=8qKOJ0MvF7LUG&b=7934631"),
                        new Page("Getting a Diagnosis", "http://www.umdf.org/site/pp.aspx?c=8qKOJ0MvF7LUG&b=7934633"),
                        new Page("Treatments & Therapies", "http://www.umdf.org/site/pp.aspx?c=8qKOJ0MvF7LUG&b=7934635"),
                        new Page("FAQ\'s", "http://www.umdf.org/site/pp.aspx?c=8qKOJ0MvF7LUG&b=7934639"),
                        new Page("Other Diseases Linked to Mitochondrial Disease", "http://www.umdf.org/site/pp.aspx?c=8qKOJ0MvF7LUG&b=7934637")
                };

        placeAdapter = new PlaceAdapter(getApplicationContext(),R.layout.list_row,myPagesArray);

        mListView = (ListView) findViewById(R.id.listView);
        if(mListView != null){
            //USE IT
            mListView.setAdapter(placeAdapter);
        }

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Page p = placeAdapter.getItem(i);
                //now i can get data for that thing.
                String content = p.getmUrl();
                Uri webpage = Uri.parse(content);
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntent);
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