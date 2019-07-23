package com.example.amst5;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class Tareas extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tareas);
        Bundle bundle=getIntent().getExtras();
        TextView fecha= findViewById(R.id.txt_fecha);
        TextView tarea= findViewById(R.id.txt_tarea);
        Button btn_calendario=findViewById(R.id.btn_calendario);
        String fecha_tarea="8/8/2019";
        String fecha_calendario1=getIntent().getStringExtra("fecha_calendario");

        if(Objects.equals(fecha_calendario1,fecha_tarea)) {
            tarea.setText("Manufactura Proceos de soldarua");
            fecha.setText(fecha_tarea);

        }
        else
                tarea.setText("No hay tareas asignadas para esta fecha");
    }

    public void btn_calendario(View view){
        finish();
    }
}
