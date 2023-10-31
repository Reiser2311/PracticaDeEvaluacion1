package com.example.practicadeevaluacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });
    }
}