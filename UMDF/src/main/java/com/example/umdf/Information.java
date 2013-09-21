package com.example.umdf;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Manny on 9/16/13.
 */
public class Information extends MainActivity {

    private ListView listView;
    private ArrayAdapter<String> listAdapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.info_layout);
        String[] names = new String[]{
                "Info"

        };


        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.info_layout,names));
//       ArrayAdapter<String>  = new ArrayAdapter<String>(getApplicationContext(),R.layout.info_layout);
//        listView = (ListView) findViewById(R.id.listView);
    }



//        AdapterView listView = null;
//        if (listView != null) {
//
//        listView.setAdapter(listAdapter);
//        listView.setOnItemClickListener(new ListView.OnItemClickListener() {
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

        super.onListItemClick(l,v,position,id);
        Intent in = new Intent(this,WebViewPage.class);
        startActivity(in);
    }

//

//                WebView wbView = (WebView) findViewById(R.id.WebView);
//                wbView.getSettings().setJavaScriptEnabled(true);
//                wbView.loadUrl("http://www.google.com");
//    }
//        try{
//
//                Uri uri = Uri.parse("https://secure.umdf.org/site/apps/ka/sd/donor.asp?c=8qKOJ0MvF7LUG&b=7966007&en=joLIIKNoH3IALNOpG4IBJOOnFeKVK0PyEkLLLPPrE7KDJPOzFsG");
//                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//                startActivity(intent);}

//        }catch(Exception exception)
//            {
//                Toast.makeText(getApplicationContext(), "The link isn't working",Toast.LENGTH_LONG).show();
//            }
//
//        }
//
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//
//            }

    public void setListAdapter(ArrayAdapter<String> listAdapter) {
        this.listAdapter = listAdapter;
    }

    //});
//
//    }
//
//
//    }
}



