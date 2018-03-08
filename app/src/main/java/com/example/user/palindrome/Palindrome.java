package com.example.user.palindrome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Palindrome extends AppCompatActivity {

    EditText palindrome_in;
    Button button;
    TextView ausgabe;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome);

        palindrome_in = (EditText) findViewById(R.id.palindrome_in);
        button = (Button) findViewById(R.id.check);
        ausgabe = (TextView) findViewById(R.id.ausgabe);



        Button check = /*(Button)*/ findViewById(R.id.check);
        check.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String str = palindrome_in.getText().toString();

                if (str.length() > 4) {
                    char leer = ' ';
                    //Überprüfe ob es ein Leerzeichen enthält
                    if (!str.contains(" ")) {

                        boolean b = isPalindrome(str);
                        //überprüfe ob palindrome
                        if (b == true) {

                            ausgabe.setText("Eingabe ist ein Palindrom");
                            //ausgabe_ispal.setVisibility(View.VISIBLE);
                        } else {
                            ausgabe.setText("Eingabe ist KEIN Palindrom");
                        }
                    } else {
                        ausgabe.setText("Eingabe OHNE Lehrzeichen");
                    }
                } else{
                    ausgabe.setText("Wortlänge mindestens 5 Buchstaben");
                }

            }

        });
    }

    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
