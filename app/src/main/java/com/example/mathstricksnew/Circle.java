package com.example.mathstricksnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Circle extends AppCompatActivity {
    private EditText ed1 , ed2 , ed3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
        ed1=findViewById(R.id.editTextNumberDecimal12);
        ed2=findViewById(R.id.editTextNumberDecimal13);
        ed3=findViewById(R.id.editTextNumberDecimal14);
    }

    public void pa(View v){
        String s1=ed1.getText().toString();
        if(TextUtils.isEmpty(s1)){
            Toast.makeText(this, "Enter the Radius", Toast.LENGTH_SHORT).show();
        }
        else{
            double r=Double.parseDouble(s1);
            double p=2*Math.PI*r;
            String s=String.format("%,.2f", p);
            ed2.setText(s+" units");
            double a=Math.PI * r *r;
            String s2=String.format("%,.2f", a);
            ed3.setText(s2+" sq units");
        }
    }


    public void ar(View v){
        String s3=ed3.getText().toString();
        if (TextUtils.isEmpty(s3)){
            Toast.makeText(this, "Enter the perimeter", Toast.LENGTH_SHORT).show();
        }else{
            double a=Double.parseDouble(s3);
            double r=Math.sqrt(a/Math.PI);

            String s=String.format("%,.2f", r);
            ed1.setText(s);
        }
    }
    public void pr(View v){
        String s2=ed2.getText().toString();
        if (TextUtils.isEmpty(s2)){
            Toast.makeText(this, "Enter the perimeter", Toast.LENGTH_SHORT).show();
        }else{
            double p=Double.parseDouble(s2);
            double r= p/(2*Math.PI);

            String s=String.format("%,.2f", r);
            ed1.setText(s);
        }
    }
}