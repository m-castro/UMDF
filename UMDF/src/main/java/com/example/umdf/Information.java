package com.example.umdf;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Manny on 9/16/13.
 */
public class Information extends Activity  {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_layout);

        final String [] info = {"What is Mitochondrial Disease","Types of Mitochondrial Disease","Possible Symptoms", "Getting a Diagnosis","Treatments & Therapies","FAQ's", "Other Diseases Linked to Mitochondrial Disease"};
        final ListView lv = (ListView) findViewById(R.id.listView);

        ArrayAdapter<Object> adapter = new ArrayAdapter<Object>(getApplicationContext(), android.R.layout.simple_list_item_1, info);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> arg0, View View, int position, long id) {
//                super.onItemClick(0, View, position, id);
                String string = info[position];

                try{
                    Uri uri = Uri.parse("http://www.umdf.org/site/pp.aspx?c=8qKOJ0MvF7LUG&b=7934627");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);

                }catch (Exception e){
                    e.printStackTrace();
            }
            }

        });

    }
}