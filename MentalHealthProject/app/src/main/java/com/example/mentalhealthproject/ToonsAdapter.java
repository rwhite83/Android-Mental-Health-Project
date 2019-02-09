package com.example.mentalhealthproject;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ToonsAdapter extends ArrayAdapter<Toon> {
    Context _context;
    public ToonsAdapter(Context context, ArrayList<Toon> toons) {
        super(context, 0, toons);
        _context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Activity activity = (Activity) _context;
        // Get the data item for this position
        Toon toon = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.layout, parent, false);
        }
        TextView text1 = (TextView) convertView.findViewById(R.id.name);
        TextView text2 = (TextView) convertView.findViewById(R.id.phone);
        TextView text3 = (TextView) convertView.findViewById(R.id.website);
        TextView text4 = (TextView) convertView.findViewById(R.id.location);
        TextView text5 = (TextView) convertView.findViewById(R.id.description);
        // Populate the data into the template view using the data object
        text1.setText(toon.getProperties().getName());
        text2.setText(toon.getProperties().getPhone());
        text3.setText("website: \n" + toon.getProperties().getWebsite());
        text4.setText(toon.getProperties().getLocation());
        text5.setText("Hospital Description : \n" + toon.getProperties().getDescription());

        // Return the completed view to render on screen
        return convertView;
    }
}
