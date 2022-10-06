package com.example.s4q1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    Button b1;
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText) findViewById(R.id.editText);
        b1=(Button) findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String res="";
                x=Integer.parseInt(e1.getText().toString());
                if(x%2==0)
                    res="number is even";
                else
                    res="number is odd";

                Toast.makeText(getApplicationContext(),res, Toast.LENGTH_LONG).show();
            }
        });
    }
}