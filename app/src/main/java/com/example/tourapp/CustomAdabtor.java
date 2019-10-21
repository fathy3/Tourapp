package com.example.tourapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CustomAdabtor extends ArrayAdapter<locationclass> {
    private Context mcontext;

    public CustomAdabtor(@NonNull Context context, @NonNull ArrayList<locationclass> objects) {
        super(context , 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.fragment_home, parent, false);
        }
        locationclass currentWord = getItem(position);
        TextView locname = listItemView.findViewById(R.id.locname);
        TextView locdecs = listItemView.findViewById(R.id.locdesc);
        locname.setText(currentWord.getmLoctionName());
        locdecs.setText(currentWord.getmLoctionDescribtion());
        return listItemView;

    }
}
