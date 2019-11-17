package facci.pm.lozanoipocuro.medid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import facci.pm.lozanoipocuro.medid2.ui.login.LoginActivity;

public class perfil extends AppCompatActivity {
    ImageView atras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        atras =(ImageView)findViewById(R.id.buttonatras);

        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =new Intent(perfil.this,Inicio.class);
                startActivity(intent1);
            }
        });
    }
}
