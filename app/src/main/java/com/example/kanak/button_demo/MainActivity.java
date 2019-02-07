package com.example.kanak.button_demo;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int count=0;
    private Button loginButton;
    private TextView textView;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton= (Button)findViewById(R.id.loginID);
        textView= (TextView)findViewById(R.id.textViewId);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;

                Toast.makeText(MainActivity.this,"login Butoon is clicked "+count + " times",Toast.LENGTH_SHORT).show();


            }
        });

    }
}
