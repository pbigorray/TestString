package com.pabiya.teststring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text,result;
    Button boton;
    EditText comprueba;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text=findViewById(R.id.texto);
        result=findViewById(R.id.result);
        boton=findViewById(R.id.boton);
        comprueba=findViewById(R.id.comprueba);

        text.setText(R.string.texto);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aux=getString(R.string.texto);
                if (comprueba.getText().toString().equals(aux)){
                    result.setText("Es la misma palabra");
                }else {
                    result.setText("Son palabras diferentes");
                }
            }
        });
    }
}