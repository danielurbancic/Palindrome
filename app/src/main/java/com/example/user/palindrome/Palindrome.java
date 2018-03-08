package com.example.user.palindrome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Palindrome extends AppCompatActivity {

    EditText palindrome_in;
    EditText button;
    EditText ausgabe_ispal;
    EditText ausgabe_nopal;
    EditText ausgabe_space;
    EditText ausgabe_wordlength;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome);

        palindrome_in = (EditText) findViewById(R.id.palindrome_in);
        button = (EditText) findViewById(R.id.button);
        ausgabe_ispal = (EditText) findViewById(R.id.ausgabe_ispal);
        ausgabe_nopal = (EditText) findViewById(R.id.ausgabe_nopal);
        ausgabe_space = (EditText) findViewById(R.id.ausgabe_space);
        ausgabe_wordlength = (EditText) findViewById(R.id.ausgabe_wordlength);
        

    }
    Button check = (Button) findViewById(R.id.check);
    check.setOnClickListener(new View.OnClickListener){
        @Override
                public void onClick (View view){

        }

    }

}
