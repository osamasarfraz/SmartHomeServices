package com.example.munawar.mazdoor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button cashbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cashbutton = (Button) findViewById(R.id.cash);
        cashbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cashactivity();
            }
        });
    }

    public void cashactivity(){
        Intent i = new Intent(this, Cash.class);
        startActivity(i);
    }
}
