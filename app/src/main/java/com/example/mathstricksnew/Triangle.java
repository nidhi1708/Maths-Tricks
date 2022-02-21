package com.example.mathstricksnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Triangle extends AppCompatActivity {
   private EditText ed1 , ed2, ed3 , ed4 , ed5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);
        ed1=findViewById(R.id.editTextNumberDecimal7);
        ed2=findViewById(R.id.editTextNumberDecimal8);
        ed3=findViewById(R.id.editTextNumberDecimal9);
        ed4=findViewById(R.id.editTextNumberDecimal10);
        ed5=findViewById(R.id.editTextNumberDecimal11);
    }

    public void peri(View v){
        String s1=ed1.getText().toString();
        String s2=ed2.getText().toString();
        String s3=ed3.getText().toString();

        if(TextUtils.isEmpty(s1) || TextUtils.isEmpty(s2)|| TextUtils.isEmpty(s3)){
            Toast.makeText(this, "Enter all the required fields", Toast.LENGTH_SHORT).show();
        }else{
            double a=Double.parseDouble(s1);
            double b=Double.parseDouble(s2);
            double c=Double.parseDouble(s3);

            double ans=a+b+c;
            String s=String.format("%,.2f", ans);
            ed4.setText(s+" units");
        }
    }

    public void ar(View v){
        String s1=ed1.getText().toString();
        String s2=ed2.getText().toString();

        if(TextUtils.isEmpty(s1) || TextUtils.isEmpty(s2)){
            Toast.makeText(this, "Enter all the required fields", Toast.LENGTH_SHORT).show();
        }else{
            double a=Double.parseDouble(s1);
            double b=Double.parseDouble(s2);

            double ans=(a*b)/2;
            String s=String.format("%,.2f", ans);
            ed5.setText(s+" sq units");
        }
    }

    public void hypo(View v){
        String s1=ed1.getText().toString();
        String s2=ed2.getText().toString();

        if(TextUtils.isEmpty(s1) || TextUtils.isEmpty(s2)){
            Toast.makeText(this, "Enter all the required fields", Toast.LENGTH_SHORT).show();
        }else{
            double a=Double.parseDouble(s1);
            double b=Double.parseDouble(s2);
            double c=(a*a)+(b*b);
            double ans=Math.sqrt(c);
            String s=String.format("%,.2f", ans);
            ed3.setText(s);
        }
    }

    public void ea(View v){
        String s1=ed1.getText().toString();


        if(TextUtils.isEmpty(s1) ){
            Toast.makeText(this, "Enter 1st value (Base)", Toast.LENGTH_SHORT).show();
        }else{
            double a=Double.parseDouble(s1);
            double c=Math.sqrt(3);
            double ans=(c/4)*a *a;
            String s=String.format("%,.2f", ans);
            ed5.setText(s+ " sq units");
        }
    }

    public void sa(View v){
        String s1=ed1.getText().toString();
        String s2=ed2.getText().toString();
        String s3=ed3.getText().toString();

        if(TextUtils.isEmpty(s1) || TextUtils.isEmpty(s2)|| TextUtils.isEmpty(s3)){
            Toast.makeText(this, "Enter all the required fields", Toast.LENGTH_SHORT).show();
        }else{
            double a=Double.parseDouble(s1);
            double b=Double.parseDouble(s2);
            double c=Double.parseDouble(s3);

            double s=(a+b+c)/2;
            double d=s*(s-a)*(s-b)*(s-c);
            double ans=Math.sqrt(d);
            String s6=String.format("%,.2f", ans);
            ed5.setText(s6+ " sq units");
        }
    }
}