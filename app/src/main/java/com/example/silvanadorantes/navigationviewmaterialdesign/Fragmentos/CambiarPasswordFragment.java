package com.example.silvanadorantes.navigationviewmaterialdesign.Fragmentos;


import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.silvanadorantes.navigationviewmaterialdesign.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CambiarPasswordFragment extends Fragment {

    private TextInputLayout til_contraseña_actual;
    private TextInputLayout til_nueva_contraseña;
    private TextInputLayout til_repita_nueva_contraseña;

    private EditText et_contraseña_actual;
    private EditText et_nueva_contraseña;
    private EditText et_repita_nueva_contraseña;

    private Button mButtonGuardar;
    private Button mButtonCancelar;


    public CambiarPasswordFragment() {
        // Required empty public constructor
    }

    public static CambiarPasswordFragment newInstance(){
        CambiarPasswordFragment fragment = new CambiarPasswordFragment();
        fragment.setRetainInstance(true);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cambiar_password, container, false);

        til_contraseña_actual = (TextInputLayout) view.findViewById(R.id.til_contraseña_Actual);
        til_nueva_contraseña = (TextInputLayout) view.findViewById(R.id.til_Contraseña_Nueva);
        til_repita_nueva_contraseña = (TextInputLayout) view.findViewById(R.id.til_Repita_Nueva_Contraseña);

        et_contraseña_actual = (EditText) view.findViewById(R.id.et_contraseña_actual);
        et_nueva_contraseña = (EditText) view.findViewById(R.id.et_Contraseña_Nueva);
        et_repita_nueva_contraseña = (EditText) view.findViewById(R.id.et_Repita_Nueva_Contraseña);

        mButtonCancelar = (Button) view.findViewById(R.id.button_cancelar);
        mButtonGuardar = (Button) view.findViewById(R.id.button_guardar);



        return view;
    }

}
