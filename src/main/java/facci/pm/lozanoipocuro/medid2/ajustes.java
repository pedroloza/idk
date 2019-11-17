package facci.pm.lozanoipocuro.medid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ajustes extends AppCompatActivity {
    Button butoncre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajustes);
        butoncre = (Button) findViewById(R.id.buttonjoder);

        butoncre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =new Intent(ajustes.this, MainActivity.class);
                startActivity(intent1);
            }
        });


    }
}
