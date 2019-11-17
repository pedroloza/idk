package facci.pm.lozanoipocuro.medid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import facci.pm.lozanoipocuro.medid2.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {


    ImageView buttonmain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonmain =(ImageView)findViewById(R.id.inicio);

        buttonmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent1);
            }
        });

        //ButtonIniciar = (Button)findViewById(R.id.button_iniciar);






       /* ButtonIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Se LLama a una pantalla
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);

                startActivity(intent);
            }
        });
       */
    }
}
