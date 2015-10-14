package com.edwinacubillos.comunicfrag;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class EnvioFragment extends Fragment {

    comunicador interfaz;

    public EnvioFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_envio, container, false);

        Button Enviar = (Button) rootView.findViewById(R.id.bEnviar);
        final EditText Name = (EditText) rootView.findViewById(R.id.eNombre);
        final EditText LastName = (EditText) rootView.findViewById(R.id.eApellido);

        Enviar.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View v) {
               String name = Name.getText().toString();
               String lastname = LastName.getText().toString();
               interfaz.envioDatos(name,lastname);
            }
        });
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            interfaz = (comunicador) activity;
        }catch(ClassCastException e){
            throw new ClassCastException(getActivity().toString()+"must implemented comunicador");
        }
    }
}
