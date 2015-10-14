package com.edwinacubillos.comunicfrag;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class ReceptorFragment extends Fragment {


    public ReceptorFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_receptor, container, false);

        TextView Name = (TextView) rootView.findViewById(R.id.tNombre);
        TextView LastName = (TextView) rootView.findViewById(R.id.tApellido);

        Bundle args = getArguments();
        String name = args.getString("name");
        String lastname = args.getString("lastname");

        Name.setText(name);
        LastName.setText(lastname);

        return rootView;
    }


}
