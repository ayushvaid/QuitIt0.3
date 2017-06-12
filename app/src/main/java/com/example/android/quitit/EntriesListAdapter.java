package com.example.android.quitit;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ayush vaid on 12-06-2017.
 */
public class EntriesListAdapter extends ArrayAdapter<Entry>{

    public EntriesListAdapter(Activity activity, ArrayList<Entry> entries)
    {
        super(activity,0,entries);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View ListItem = convertView;
        if(ListItem == null)
        {
            ListItem = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Entry current = getItem(position);

        TextView Name = (TextView) ListItem.findViewById(R.id.name);
        Name.setText(current.getName());

        TextView Age = (TextView) ListItem.findViewById(R.id.age);
        Age.setText(""+current.getAge());

        TextView Date = (TextView) ListItem.findViewById(R.id.date_time);
        Date.setText(""+current.getAge());


        return ListItem;
    }
}
