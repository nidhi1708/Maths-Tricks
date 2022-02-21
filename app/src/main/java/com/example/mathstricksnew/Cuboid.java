package com.example.mathstricksnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cuboid extends AppCompatActivity {
    private EditText ed1 , ed2 , ed3 , ed4 , ed5 , ed6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuboid);
        ed1=findViewById(R.id.editTextNumberDecimal23);
        ed2=findViewById(R.id.editTextNumberDecimal24);
        ed3=findViewById(R.id.editTextNumberDecimal25);
        ed4=findViewById(R.id.editTextNumberDecimal26);
        ed5=findViewById(R.id.editTextNumberDecimal27);
        ed6=findViewById(R.id.editTextNumberDecimal28);
    }

    public void find(View v){
        String s1=ed1.getText().toString();
        String s2=ed2.getText().toString();
        String s3=ed3.getText().toString();
        if(TextUtils.isEmpty(s1) || TextUtils.isEmpty(s2) || TextUtils.isEmpty(s3)){
            Toast.makeText(this, "Enter all the requires fields", Toast.LENGTH_SHORT).show();
        }else{
            double l=Double.parseDouble(s1);
            double b=Double.parseDouble(s2);
            double h=Double.parseDouble(s3);
            double vol=l*b*h;
            String s4=String.format("%,.2f", vol);
            ed4.setText("Vol= "+s4 +" cube units");

            double tsa=2*h*(l+b);
            String s5=String.format("%,.2f", tsa);
            ed5.setText("TSA= "+s5+ " sq units");

            double csa = 2*((l*b) + (b*h) +(h*l));
            String s6=String.format("%,.2f", csa);
            ed6.setText("CSA= "+s6+" sq units");
        }
    }
}