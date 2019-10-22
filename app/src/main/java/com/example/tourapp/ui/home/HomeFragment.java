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
        bestlocation.add(new locationclass(R.string.cairo,R.string.cairo_desc));
        bestlocation.add(new locationclass(R.string.El_giza,R.string.giza_decs));
        bestlocation.add(new locationclass(R.string.Alexandria,R.string.Alex_decs));
        bestlocation.add(new locationclass(R.string.sharam_el_shick,R.string.sharm_decs));
        bestlocation.add(new locationclass(R.string.Sina,R.string.Sina_decs));
        bestlocation.add(new locationclass(R.string.el_aksor,R.string.aksor_dec));
        bestlocation.add(new locationclass(R.string.nahr_el_Nil,R.string.nahr_dec));
        CustomAdabtor adapter = new CustomAdabtor(getActivity(), bestlocation);
        ListView listView = root.findViewById(R.id.list);
        listView.setAdapter(adapter);




        return root;
    }
}