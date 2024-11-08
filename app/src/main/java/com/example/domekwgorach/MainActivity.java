package com.example.domekwgorach;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
   private TextView TextViewLike;
   private Button like;
   private Button usun;
   private int likes=0;

   @Override
    protected void onCreate(Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

       TextViewLike = findViewById(R.id.textView5);
       like = findViewById(R.id.like);
       usun = findViewById(R.id.usun);

       like.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               likes++;
               TextViewLike.setText(likes + " polubień");
           }
       });
       usun.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(likes>0){
                   likes--;
                   TextViewLike.setText(likes + " polubień");
               }
           }
       });
   }
        }
