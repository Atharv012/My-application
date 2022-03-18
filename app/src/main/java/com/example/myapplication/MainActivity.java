package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView2;
    private TextView textView3;
    private EditText editDecimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        editDecimal = findViewById(R.id.editDecimal);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, " Click Listener Worked! ", Toast.LENGTH_SHORT).show();
//                String s = editDecimal.getText().toString();
//                double kg = Double.parseDouble(s);
//                double pound = 2.205 * kg;
//                textView2.setText("The corresponding value in pound in " + pound);
//
//            }
//        });
    }
    public void calculate(View view){
        String s = editDecimal.getText().toString();
        double kg = Double.parseDouble(s);
        double pound = 2.205 * kg;
        textView2.setText("The corresponding value in pound in " + pound);
        Toast.makeText(this, "Thanks for using this app!😊", Toast.LENGTH_SHORT).show();

    }
}