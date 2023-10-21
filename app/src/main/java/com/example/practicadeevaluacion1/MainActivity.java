package com.example.practicadeevaluacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void layout1() {
        setContentView(R.layout.layout1);

        final Button btnAcceder = findViewById(R.id.btnAcceso);

        btnAcceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout2();
            }
        });
    }

    public void layout2() {
        setContentView(R.layout.layout2);

        final EditText edtxtNom = findViewById(R.id.edtxtNombre);
        final EditText edtxtFecha = findViewById(R.id.edtxtFecha);
        final CheckBox recordatorio = findViewById(R.id.checkRecor);
        final TextView txtInfo = findViewById(R.id.txtInfo);
        final Button btnAcept = findViewById(R.id.btnAcep);
        final Button btnSiguiente = findViewById(R.id.btnSiguiente);

        btnAcept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = edtxtNom.getText().toString();
                String fecha = edtxtFecha.getText().toString();
                String texto;
                if (!nombre.equals("") && !fecha.equals("")) {
                    texto = "¡Hola " + nombre + "! Has nacido el " + fecha + ".";
                    if (recordatorio.isChecked()) {
                        texto += " Se ha creado un recordatorio.";
                    }
                } else {
                    texto = "ERROR: No ha escrito los siguientes campos:";
                    if (nombre.equals("")) {
                        texto += "\nNombre";
                    }
                    if (fecha.equals("")) {
                        texto += "\nFecha";
                    }
                }

                txtInfo.setText(texto);
                btnSiguiente.setVisibility(View.VISIBLE);
            }
        });

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout3();
            }
        });
    }

    public void layout3() {
        setContentView(R.layout.layout3);

        final RatingBar utilidad = findViewById(R.id.ratingUtilidad);
        final RatingBar diseno = findViewById(R.id.ratingDiseno);
        final RatingBar funcionalidad = findViewById(R.id.ratingFuncionalidad);
        final TextView txtMandado = findViewById(R.id.txtMandado);
        final TextView txtUtilidad = findViewById(R.id.txtUtilidad);
        final TextView txtDiseño = findViewById(R.id.txtDiseño);
        final TextView txtFuncionalidad = findViewById(R.id.txtFuncionalidad);
        final Button btnMandar = findViewById(R.id.btnMandar);

        utilidad.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                txtUtilidad.setText("Utilidad: " + rating);
            }
        });

        diseno.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                txtDiseño.setText("Diseño: " + rating);
            }
        });

        funcionalidad.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                txtFuncionalidad.setText("Funcionalidad: " + rating);
            }
        });

        btnMandar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMandado.setVisibility(View.VISIBLE);
                txtUtilidad.setVisibility(View.VISIBLE);
                txtDiseño.setVisibility(View.VISIBLE);
                txtFuncionalidad.setVisibility(View.VISIBLE);
            }
        });

        final Button btnInicio = findViewById(R.id.btnInicio);

        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout1();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        layout1();
        //layout2();
        //layout3();

    }


}