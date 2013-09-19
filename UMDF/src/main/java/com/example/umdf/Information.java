package com.example.umdf;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * Created by Manny on 9/16/13.
 */
public class Information extends Activity {
    public ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_layout);

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Uri uri = Uri.parse("http://www.umdf.org/site/pp.aspx?c=8qKOJ0MvF7LUG&b=7934627");
//                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//                startActivity(intent);
//
//
//            }
//        });




    }
}
