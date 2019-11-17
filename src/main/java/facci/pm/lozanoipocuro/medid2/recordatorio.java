package facci.pm.lozanoipocuro.medid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class recordatorio extends AppCompatActivity {
    ImageView atras3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recordatorio);


        atras3 =(ImageView)findViewById(R.id.butondeatras);

        atras3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =new Intent(recordatorio.this, Inicio.class);
                startActivity(intent1);
            }
        });
    }
}
