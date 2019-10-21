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
import com.example.tourapp.locationclass;
import com.example.tourapp.ui.ImageAdapter;

import java.util.ArrayList;

public class SlideshowFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.listitem, container, false);
        ArrayList<locationclass> safariallery = new ArrayList<locationclass>();
        safariallery.add(new locationclass(R.drawable.r));
        safariallery.add(new locationclass(R.drawable.rr));
        safariallery.add(new locationclass(R.drawable.rrr));
        safariallery.add(new locationclass(R.drawable.rrrr));
        safariallery.add(new locationclass(R.drawable.rrrrr));
        safariallery.add(new locationclass(R.drawable.rrrrrr));
        safariallery.add(new locationclass(R.drawable.rrrrrrr));
        safariallery.add(new locationclass(R.drawable.rrrrrrrr));

        ListView listView = root.findViewById(R.id.list);

        ImageAdapter adapter = new ImageAdapter(getActivity(), safariallery);
        listView.setAdapter(adapter);


        return root;
    }
}