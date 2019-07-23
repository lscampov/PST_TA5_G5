package com.example.amst5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;

import androidx.appcompat.app.AppCompatActivity;

public class Calendario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);
        CalendarView calendario_fecha= findViewById(R.id.calendarView);
        calendario_fecha.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int i, int i1, int i2) {
                String fecha_calendario= i2 +"/"+ (i1+1) +"/"+ i;

                Intent cambio =  new Intent(Calendario.this,Tareas.class);
                cambio.putExtra("fecha_calendario",fecha_calendario);
                startActivity(cambio);
            }


        });
    }
    public void botonsalir(View view){
        finish();

    }
}
