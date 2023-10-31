package com.example.practicadeevaluacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
                Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}