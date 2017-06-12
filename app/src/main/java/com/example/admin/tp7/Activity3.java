package com.example.admin.tp7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        Button button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Bouton", "Bouton 4");
                Intent intent = new Intent(Activity3.this,Activity4.class);
                intent.putExtra("param", "Vrai, et c'est sa 56ème victoire en carrière!");
                startActivity(intent);
            }
        });
    }
    public void bouton5(View view){
        Log.d("Bouton", "Button 5");
        Intent intent = new Intent(Activity3.this, Activity4.class);
        intent.putExtra("param","Faux, il a fini troisième");
        startActivity(intent);
    }
}
