package com.example.mathstricksnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Rectangle extends AppCompatActivity {
    EditText ed1, ed2, ed3, ed4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);

    }

    public void find(View v) {
        ed1 = findViewById(R.id.editTextNumberDecimal3);
        ed2 = findViewById(R.id.editTextNumberDecimal4);
        ed3 = findViewById(R.id.editTextNumberDecimal5);
        ed4 = findViewById(R.id.editTextNumberDecimal6);
        String length = ed1.getText().toString();
        String width = ed2.getText().toString();

        if (TextUtils.isEmpty(length) || TextUtils.isEmpty(width)) {
            Toast.makeText(this, "Enter the required fields", Toast.LENGTH_SHORT).show();
        }else {
            double l = Double.parseDouble(length);
            double b = Double.parseDouble(width);
            double ans = 2 * (l + b);
            String s = String.format("%,.2f", ans);
            ed3.setText(s+" units");

            double ans1 = l * b;
            String s6 = String.format("%,.2f", ans1);
            ed4.setText(s6+ " sq units");

        }
    }
}