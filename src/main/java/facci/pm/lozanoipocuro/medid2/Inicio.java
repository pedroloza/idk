package facci.pm.lozanoipocuro.medid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        ImageView buttonrecordatorio;
        ImageView buttonperfil ;
        ImageView buttonmedicina;
        ImageView  buttonajustes;



        buttonperfil  = (ImageView) findViewById(R.id.loginperfil);

        buttonperfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Inicio.this, perfil.class);

                startActivity(intent3);
            }


        });

        buttonrecordatorio  = (ImageView) findViewById(R.id.loginrecordatorio);

        buttonrecordatorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Inicio.this, recordatorio.class);

                startActivity(intent1);
            }


    });


        buttonmedicina = (ImageView)findViewById(R.id.loginmedicina);

        buttonmedicina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Inicio.this,medicina.class);
                startActivity(intent2);
            }

        });

        buttonajustes = (ImageView)findViewById(R.id.loginajustes);

        buttonajustes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Inicio.this,ajustes.class);
                startActivity(intent);
            }

        });


    }
    }
