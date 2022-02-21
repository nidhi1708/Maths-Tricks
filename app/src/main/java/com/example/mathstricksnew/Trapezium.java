package com.example.mathstricksnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Trapezium extends AppCompatActivity {
    private  EditText ed1 , ed2, ed3 ,ed4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapezium);
        ed1=findViewById(R.id.editTextNumberDecimal15);
        ed2=findViewById(R.id.editTextNumberDecimal16);
        ed3=findViewById(R.id.editTextNumberDecimal17);
        ed4=findViewById(R.id.editTextNumberDecimal18);
    }

    public void area(View v){
        String s1=ed1.getText().toString();
        String s2=ed2.getText().toString();
        String s3=ed3.getText().toString();
        String s4=ed4.getText().toString();
        if(TextUtils.isEmpty(s1) || TextUtils.isEmpty(s2)||TextUtils.isEmpty(s3)){
            ed4.setText("0");
            Toast.makeText(this, "Enter all the required feilds", Toast.LENGTH_SHORT).show();

        }else{
            double a=Double.parseDouble(s1);
            double b=Double.parseDouble(s2);
            double h=Double.parseDouble(s3);
            double ans=(a+b)*h;
            double p=ans/2;
            String s=String.format("%,.2f", p);
            ed4.setText(s+" sq units");

        }
    }
}