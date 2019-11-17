package facci.pm.lozanoipocuro.medid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import facci.pm.lozanoipocuro.medid2.ui.login.LoginActivity;

public class medicina extends AppCompatActivity {
    ImageView atras2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicina);

        atras2 =(ImageView)findViewById(R.id.buttonatras2);

        atras2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =new Intent(medicina.this, Inicio.class);
                startActivity(intent1);
            }
        });
    }
}
