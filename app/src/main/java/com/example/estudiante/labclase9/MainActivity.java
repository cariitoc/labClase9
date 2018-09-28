package com.example.estudiante.labclase9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button[] boton;
    Boolean turno;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = new Button[9];

        boton[0]= findViewById(R.id.btn_1);
        boton[1]= findViewById(R.id.btn_2);
        boton[2]= findViewById(R.id.btn_3);
        boton[3]= findViewById(R.id.btn_4);
        boton[4]= findViewById(R.id.btn_5);
        boton[5]= findViewById(R.id.btn_6);
        boton[6]= findViewById(R.id.btn_7);
        boton[7]= findViewById(R.id.btn_8);
        boton[8]= findViewById(R.id.btn_9);
        int numero=(int)(Math.random()*5);

        if (numero%2 == 0){
            turno =true;
        }else {
            turno =false;
        }


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btn_1:

                break;

            case R.id.btn_2:

                break;

            case R.id.btn_3:

                break;

            case R.id.btn_4:

                break;
            case R.id.btn_5:

                break;
            case R.id.btn_6:

                break;
            case R.id.btn_7:

                break;
            case R.id.btn_8:

                break;
            case R.id.btn_9:

                break;
        }


    }
}
