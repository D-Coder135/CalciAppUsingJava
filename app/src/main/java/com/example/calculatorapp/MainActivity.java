package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText1, editText2;
    Button add, sub, mul, div;
    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText)findViewById(R.id.editText);
        editText2 = (EditText)findViewById(R.id.editText2);
        add = (Button)findViewById(R.id.button);
        sub = (Button)findViewById(R.id.button2);
        mul = (Button)findViewById(R.id.button3);
        div = (Button)findViewById(R.id.button4);
        resultView = (TextView)findViewById(R.id.textView);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstNumber = editText1.getText().toString();
                String secondNumber = editText2.getText().toString();
                Float firsNumberInFloat = Float.parseFloat(firstNumber);
                Float secondNumberInFloat = Float.parseFloat(secondNumber);
                Float resultInFloat = firsNumberInFloat + secondNumberInFloat;
                String resultInString = Float.toString(resultInFloat);
                resultView.setText(resultInString);
            }
        });
    }
}