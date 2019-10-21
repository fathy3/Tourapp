package com.example.tourapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.tourapp.CustomAdabtor;
import com.example.tourapp.R;
import com.example.tourapp.locationclass;

import java.util.ArrayList;

public class HomeFragment extends Fragment {




    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.listitem, container, false);

        ArrayList<locationclass> bestlocation = new ArrayList<locationclass>();
        bestlocation.add(new locationclass("Cairo","The capital of egypt"));
        bestlocation.add(new locationclass("El giza","here you can find the awesome Pyramids"));
        bestlocation.add(new locationclass("Alexandria","Want swim and Ice cream xD ? here you get what you want"));
        bestlocation.add(new locationclass("Cairo","The capital of egypt"));
        bestlocation.add(new locationclass("Sina","You can swim in the red sea "));
        bestlocation.add(new locationclass("el aksor","any thing about egyptian ancient  is there "));
        bestlocation.add(new locationclass("nahr el Nil ","Romantic View For romantic People xD  "));
        CustomAdabtor adapter = new CustomAdabtor(getActivity(), bestlocation);
        ListView listView = root.findViewById(R.id.list);
        listView.setAdapter(adapter);




        return root;
    }
}