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
    TextView ausgabe_ispal;
    TextView ausgabe_nopal;
    TextView ausgabe_space;
    TextView ausgabe_wordlength;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome);

        palindrome_in = (EditText) findViewById(R.id.palindrome_in);
        button = (Button) findViewById(R.id.button);
        ausgabe_ispal = (TextView) findViewById(R.id.ausgabe_ispal);
        ausgabe_nopal = (TextView) findViewById(R.id.ausgabe_nopal);
        ausgabe_space = (TextView) findViewById(R.id.ausgabe_space);
        ausgabe_wordlength = (TextView) findViewById(R.id.ausgabe_wordlength);


        Button check = (Button) findViewById(R.id.check);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = palindrome_in.getText().toString();

                if (str.length() > 4) {
                    char leer = ' ';
                    //Überprüfe ob es ein Leerzeichen enthält
                    if (str.indexOf(leer) == 0) {

                        boolean b = isPalindrome(str);
                        //überprüfe ob palindrome
                        if (b == true) {

                            ausgabe_ispal.setText("Es IST ein Palindrom");
                        } else ausgabe_nopal.setText("Es ist kein Palindrom");
                    } else ausgabe_space.setText("Wort ohne leerzeichen");
                } else ausgabe_wordlength.setText("Wort muss mindestens 5 Buchstaben haben");

            }

        });
    }

    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
