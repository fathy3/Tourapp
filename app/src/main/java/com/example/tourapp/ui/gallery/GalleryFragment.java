package com.example.tourapp.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.tourapp.CustomAdabtor;
import com.example.tourapp.R;
import com.example.tourapp.galleryclass;
import com.example.tourapp.locationclass;
import com.example.tourapp.ui.ImageAdapter;

import java.util.ArrayList;

public class GalleryFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.listitem, container, false);
        ArrayList<galleryclass> Pyrmidgallery = new ArrayList<galleryclass>();
        Pyrmidgallery.add(new galleryclass(R.drawable.pyrmids,R.string.pyrmidDesc1));
        Pyrmidgallery.add(new galleryclass(R.drawable.pyrmids2,R.string.pyrmidDesc2));
        Pyrmidgallery.add(new galleryclass(R.drawable.pyrmids3,R.string.pyrmidDesc3));
        Pyrmidgallery.add(new galleryclass(R.drawable.pyrmids4,R.string.pyrmidDesc4));
        Pyrmidgallery.add(new galleryclass(R.drawable.pyrmids5,R.string.pyrmidDesc5));
        Pyrmidgallery.add(new galleryclass(R.drawable.pyrmids6,R.string.pyrmidDesc6));
        Pyrmidgallery.add(new galleryclass(R.drawable.pyrmids7,R.string.pyrmidDesc7));
        Pyrmidgallery.add(new galleryclass(R.drawable.pyrmids8,R.string.pyrmidDesc8));

        ListView listView = root.findViewById(R.id.list);

        ImageAdapter adapter = new ImageAdapter(getActivity(), Pyrmidgallery);
        listView.setAdapter(adapter);



        return root;
    }
}