package com.example.domekwgorach;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends AppCompatActivity {
    private Button button1, button2, button3;
    private TextView Counter;
    private int LikeCount =0;





    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    Button button1=findViewById(R.id.button1);
    Button button2=findViewById(R.id.button2);
    Button button3=findViewById(R.id.button3);
     Counter=findViewById(R.id.textView5);


    button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            LikeCount++;

        }
    });
    button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    });

        }
    }