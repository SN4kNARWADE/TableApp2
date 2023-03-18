package com.sn.tableapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     Button button;
     EditText editText;
     TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editTextNumber);
        textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int n = Integer.parseInt(editText.getText().toString());
                String a = "";
                for(int i=1;i<=10;i++){
                    String s1 = Integer.toString(n*i);
                    a = a+s1+"\n";
                }
                textView.setText(a);
            }
        });
    }
}