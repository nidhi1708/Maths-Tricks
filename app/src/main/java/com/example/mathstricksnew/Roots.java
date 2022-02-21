package com.example.mathstricksnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Roots extends AppCompatActivity {
    private EditText ed1 , ed2 , ed3;
    private TextView f , s;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roots);
        ed1=findViewById(R.id.editTextNumber4);
        ed2=findViewById(R.id.editTextNumber5);
        ed3=findViewById(R.id.editTextNumber6);
        f=findViewById(R.id.textView5);
        s=findViewById(R.id.textView6);
        button=findViewById(R.id.button17);
    }

    public void find(View v) {
        String s1 = ed1.getText().toString();
        String s2 = ed2.getText().toString();
        String s3 = ed3.getText().toString();
        if (TextUtils.isEmpty(s1) || TextUtils.isEmpty(s2) || TextUtils.isEmpty(s3)) {
            Toast.makeText(this, "Enter the required fields", Toast.LENGTH_SHORT).show();
        } else {
            double a = Double.parseDouble(s1);
            double b = Double.parseDouble(s2);
            double c = Double.parseDouble(s3);
            double firstroot, secondroot;
            double det = (b * b) - (4 * a * c);

            // check if determinant is greater than 0
            if (det > 0) {

                // two real and distinct roots
                firstroot = (-b + Math.sqrt(det)) / (2 * a);
                secondroot = (-b - Math.sqrt(det)) / (2 * a);
                String s4 = String.format("%,.2f", firstroot);
                String s5 = String.format("%,.2f", secondroot);

                f.setText(s4);
                s.setText(s5);
            }

            // check if determinant is equal to 0
            else if (det == 0) {

                // two real and equal roots
                // determinant is equal to 0
                // so -b + 0 == -b
                firstroot = secondroot = -b / (2 * a);

                String s4 = String.format("%,.2f", firstroot);
                String s5 = String.format("%,.2f", secondroot);

                f.setText(s4);
                s.setText(s5);

            }

            // if determinant is less than zero
            else {

                // roots are complex number and distinct
                double real = -b / (2 * a);

                double imaginary = Math.sqrt(-det) / (2 * a);
                String s4 = String.format("%,.2f", real);
                String s5 = String.format("%,.2f", imaginary);

                f.setText(s4 + " + (" + s5 + ")i");
                s.setText(s4 + " - (" + s5 + ")i");

            }
        }
    }
}
