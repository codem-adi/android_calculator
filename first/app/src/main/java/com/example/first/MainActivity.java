package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //TextView editText;
   // Button btn1;
    int num=0;
    ArrayList<String> word = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        word.add("aditya");
        word.add("ashish");
        word.add("rinki");
        word.add("kriti");
        word.add("shivam");
        word.add("anurag");
        word.add("adi");
        word.add("avinash");



        TextView editText=findViewById(R.id.textView1);
        Button btn1= findViewById(R.id.button2);
        Button btn2= findViewById(R.id.button3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
               // Random dig=new Random();
                num=num+1;
                editText.setText(String.valueOf(num));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                // Random dig=new Random();
                if(num<8)
                {
                    String tu = word.get(num);
                    editText.setText(String.valueOf(tu));
                    num=0;
                }
                else {
                    editText.setText("out of index");
                    num=0;
                }
            }
        });
    }
}
