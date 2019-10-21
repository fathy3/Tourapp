package com.example.tourapp.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.tourapp.CustomAdabtor;
import com.example.tourapp.R;
import com.example.tourapp.locationclass;
import com.example.tourapp.ui.ImageAdapter;

import java.util.ArrayList;

public class GalleryFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.listitem, container, false);
        ArrayList<locationclass> Pyrmidgallery = new ArrayList<locationclass>();
        Pyrmidgallery.add(new locationclass(R.drawable.p));
        Pyrmidgallery.add(new locationclass(R.drawable.pp));
        Pyrmidgallery.add(new locationclass(R.drawable.ppp));
        Pyrmidgallery.add(new locationclass(R.drawable.pppp));
        Pyrmidgallery.add(new locationclass(R.drawable.ppppp));
        Pyrmidgallery.add(new locationclass(R.drawable.pppppp));
        Pyrmidgallery.add(new locationclass(R.drawable.ppppppp));
        Pyrmidgallery.add(new locationclass(R.drawable.pppppppp));

        ListView listView = root.findViewById(R.id.list);

        ImageAdapter adapter = new ImageAdapter(getActivity(), Pyrmidgallery);
        listView.setAdapter(adapter);



        return root;
    }
}