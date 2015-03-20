package com.universidadcauca.movil.radiobutton;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class MainActivity extends ActionBarActivity implements RadioGroup.OnCheckedChangeListener {



    ImageView color;
    RadioGroup grupo;
    RadioButton amarillo, azul , rojo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        amarillo= (RadioButton) findViewById(R.id.amarillo);
        azul=(RadioButton) findViewById(R.id.azul);
        rojo= (RadioButton) findViewById(R.id.rojo);
        color=(ImageView) findViewById(R.id.color);
        grupo=(RadioGroup) findViewById(R.id.grupo);


        //para esuchar como es un radio goup solo se lo implementamos en este caso a grupo

        grupo.setOnCheckedChangeListener(this);

    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        if (amarillo.isChecked()==false&azul.isChecked()==false&rojo.isChecked()==false){
            color.setImageResource(R.drawable.blanco);
        }
        if(amarillo.isChecked()& azul.isChecked()== false & rojo.isChecked()==false){
            color.setImageResource(R.drawable.color);
       }
        if(azul.isChecked()&amarillo.isChecked()==false & rojo.isChecked()==false){
            color.setImageResource(R.drawable.azul);
        }
        if(rojo.isChecked() & amarillo.isChecked()==false & azul.isChecked()==false){
            color.setImageResource(R.drawable.rojo);
        }
        if (azul.isChecked()&rojo.isChecked()&amarillo.isChecked()==false){
            color.setImageResource(R.drawable.morado);
        }
        if(amarillo.isChecked()&azul.isChecked()&rojo.isChecked()==false){

            color.setImageResource(R.drawable.verde);
        }
        if (rojo.isChecked()&amarillo.isChecked()&azul.isChecked()==false){

            color.setImageResource(R.drawable.naranja);
        }
        if(azul.isChecked()&rojo.isChecked()&amarillo.isChecked()){
            color.setImageResource(R.drawable.negro);
        }

    }
}
