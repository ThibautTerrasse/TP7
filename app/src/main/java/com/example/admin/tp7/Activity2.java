package com.example.admin.tp7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by admin on 12/06/2017.
 */

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);

        //on récupère l'intent qui a lancé votre activité
        Intent intent = getIntent();
        String texte = intent.getStringExtra("param");
        TextView editText = (TextView) findViewById(R.id.reponse);
        editText.setText(texte);

        Button button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Bouton", "Bouton 3");
                Intent intent = new Intent(Activity2.this,Activity3.class);
                //intent.putExtra("param", "Vrai ,  et il a réalisé le record de la piste!");
                startActivity(intent);
            }
        });
    }
}
