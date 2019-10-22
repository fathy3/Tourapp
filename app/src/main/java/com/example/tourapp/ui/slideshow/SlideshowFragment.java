package com.example.tourapp.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.tourapp.R;
import com.example.tourapp.galleryclass;
import com.example.tourapp.locationclass;
import com.example.tourapp.ui.ImageAdapter;

import java.util.ArrayList;

public class SlideshowFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.listitem, container, false);
        ArrayList<galleryclass> safariallery = new ArrayList<galleryclass>();
        safariallery.add(new galleryclass(R.drawable.safari1,R.string.Safari1));
        safariallery.add(new galleryclass(R.drawable.safari2,R.string.Safari2));
        safariallery.add(new galleryclass(R.drawable.safari3,R.string.Safari3));
        safariallery.add(new galleryclass(R.drawable.safari4,R.string.Safari4));
        safariallery.add(new galleryclass(R.drawable.safari5,R.string.Safari5));
        safariallery.add(new galleryclass(R.drawable.safari6,R.string.Safari6));
        safariallery.add(new galleryclass(R.drawable.safari7,R.string.Safari7));

        ListView listView = root.findViewById(R.id.list);

        ImageAdapter adapter = new ImageAdapter(getActivity(), safariallery);
        listView.setAdapter(adapter);


        return root;
    }
}