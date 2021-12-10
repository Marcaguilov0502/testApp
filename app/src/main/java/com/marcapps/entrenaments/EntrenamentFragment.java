package com.marcapps.entrenaments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class EntrenamentFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.entrenament_fragment, container, false);

        TextView nom = view.findViewById(R.id.nom);
        nom.setText(Entrenament.selected.getNom());
        TextView descripcio = view.findViewById(R.id.descripcio);
        descripcio.setText(Entrenament.selected.getDescripcio());
        ImageView icono = view.findViewById(R.id.icono);

        if (Entrenament.selected == Entrenament.entrenaments[0]) {
            icono.setImageResource(R.drawable.e1);
        } else if (Entrenament.selected == Entrenament.entrenaments[1]) {
            icono.setImageResource(R.drawable.e2);
        } else if (Entrenament.selected == Entrenament.entrenaments[2]) {
            icono.setImageResource(R.drawable.e3);
        } else if (Entrenament.selected == Entrenament.entrenaments[3]) {
            icono.setImageResource(R.drawable.e4);
        }

        return inflater.inflate(R.layout.entrenament_fragment, container, false);
    }

}
