package com.example.tourapp.ui.tools;

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

public class ToolsFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.listitem, container, false);
        ArrayList<galleryclass> safariallery = new ArrayList<galleryclass>();

        safariallery.add(new galleryclass(R.drawable.sea1,R.string.Sea1));
        safariallery.add(new galleryclass(R.drawable.sea2,R.string.Sea2));
        safariallery.add(new galleryclass(R.drawable.sea3,R.string.Sea3));
        safariallery.add(new galleryclass(R.drawable.sea4,R.string.Sea4));
        safariallery.add(new galleryclass(R.drawable.sea5,R.string.Sea5));
        safariallery.add(new galleryclass(R.drawable.sea6,R.string.Sea6));
        safariallery.add(new galleryclass(R.drawable.sea7,R.string.Sea7));
        safariallery.add(new galleryclass(R.drawable.sea2,R.string.Sea8));



        ListView listView = root.findViewById(R.id.list);

        ImageAdapter adapter = new ImageAdapter(getActivity(), safariallery);
        listView.setAdapter(adapter);
        return root;
    }
}