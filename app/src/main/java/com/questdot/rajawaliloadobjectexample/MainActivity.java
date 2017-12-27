package com.questdot.rajawaliloadobjectexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnObject = (Button)findViewById(R.id.btn_object);

        btnObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ObjectActivity.class);
                startActivity(intent);
            }
        });

        Button btnTexture = (Button)findViewById(R.id.btn_texture);

        btnTexture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TextureActivity.class);
                startActivity(intent);
            }
        });


    }
}
