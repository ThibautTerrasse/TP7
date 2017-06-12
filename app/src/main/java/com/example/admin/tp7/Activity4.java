package com.example.admin.tp7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        //on récupère l'intent qui a lancé votre activité
        Intent intent = getIntent();
        String texte = intent.getStringExtra("param");
        TextView editText = (TextView) findViewById(R.id.reponse2);
        editText.setText(texte);
    }
}
