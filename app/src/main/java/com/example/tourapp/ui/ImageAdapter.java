package com.example.tourapp.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.tourapp.R;
import com.example.tourapp.locationclass;

import java.util.ArrayList;
import java.util.List;

public class ImageAdapter extends ArrayAdapter<locationclass> {
    public ImageAdapter(@NonNull Context context,  @NonNull ArrayList<locationclass> objects) {
        super(context, 0, objects);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.fragment_gallery, parent, false);
        }
        locationclass currentWord = getItem(position);
        ImageView img = listItemView.findViewById(R.id.imageView2);
        img.setImageResource(currentWord.getmImageRecsourceId());

        return listItemView;

    }

}
