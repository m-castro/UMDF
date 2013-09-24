package com.example.umdf;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Manny on 9/23/13.
 */
public class PlaceAdapter extends ArrayAdapter<Page> {
    Context mContext;
    int mLayoutResourceId;
    Page mData[] = null;

    public PlaceAdapter(Context context, int layoutResourceId, Page[] data){
        super (context, layoutResourceId, data);
        this.mContext = context;
        this.mLayoutResourceId = layoutResourceId;
        this.mData = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View row = convertView;

        PlaceHolder holder = null;
        if (row == null)
        {
            //Create a new view
            LayoutInflater inflater = LayoutInflater.from(mContext);
            row = inflater.inflate(mLayoutResourceId, parent, false);

            holder = new PlaceHolder();

            holder.nameView = (TextView) row.findViewById(R.id.infoPageName);
//            holder.addressView = (TextView) row.findViewById(R.id.address);


            row.setTag(holder);

        }else{
            //Use an existing one
            holder = (PlaceHolder)row.getTag();
        }
        //Getting the data from the data array
        Page place = mData[position];
        //setting the view to reflect the data we need to display
        holder.nameView.setText(place.mNameOfPage);
//        holder.addressView.setText(place.mAddress);

        //returning the row (because this is called getView after all)
        return row;
    }
    static class PlaceHolder {
        TextView nameView;
//        TextView addressView;
    }
}
