package com.example.canvas_jose_angel_marin_david_sanchez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Componente1 mco_componente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mco_componente=(Componente1) findViewById(R.id.componente13);

    }
    public void Boton(View view ){
        Toast.makeText(this, mco_componente.getEstado()+"", Toast.LENGTH_SHORT).show();
    }
}