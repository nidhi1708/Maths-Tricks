package com.example.mathstricksnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Hemisphere extends AppCompatActivity {
    private EditText ed1 , ed2, ed3 ,ed4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hemisphere);
        ed1=findViewById(R.id.editTextNumberDecimal44);
        ed2=findViewById(R.id.editTextNumberDecimal45);
        ed3=findViewById(R.id.editTextNumberDecimal46);
        ed4=findViewById(R.id.editTextNumberDecimal47);
    }

    public void find(View v){
        String s1=ed1.getText().toString();
        if(TextUtils.isEmpty(s1)){
            Toast.makeText(this, "Enter the side value", Toast.LENGTH_SHORT).show();
        }else{
            double s=Double.parseDouble(s1);
            double a=Math.pow(s , 3);
            double vol=a*Math.PI*0.67;
            String s4=String.format("%,.2f", vol);
            ed2.setText("Vol= "+s4 +" cube units");

            double tsa=3*Math.PI*s*s;
            String s5=String.format("%,.2f", tsa);
            ed3.setText("TSA= "+s5+ " sq units");

            double csa = 2*s*s*Math.PI;
            String s6=String.format("%,.2f", csa);
            ed4.setText("CSA= "+s6+" sq units");
        }
    }

    public void cs(View v){
        String s4=ed4.getText().toString();
        if(TextUtils.isEmpty(s4)){
            Toast.makeText(this, "Enter the CSA", Toast.LENGTH_SHORT).show();
        }else{
            double csa=Double.parseDouble(s4);
            double a=2*Math.PI;
            double s=Math.sqrt(csa/a);
            String s1=String.format("%,.2f", s);
            ed1.setText(s1);
        }
    }

    public void ts(View v){
        String s3=ed3.getText().toString();
        if(TextUtils.isEmpty(s3)){
            Toast.makeText(this, "Enter the TSA", Toast.LENGTH_SHORT).show();
        }else{
            double csa=Double.parseDouble(s3);
            double a=3*Math.PI;
            double s=Math.sqrt(csa/a);
            String s1=String.format("%,.2f", s);
            ed1.setText(s1);
        }
    }
    public void vs(View v){
        String s2=ed2.getText().toString();
        if(TextUtils.isEmpty(s2)){
            Toast.makeText(this, "Enter the Volume", Toast.LENGTH_SHORT).show();
        }else{
            double a=Double.parseDouble(s2);
            double vol=a/(0.67*Math.PI);
            double s=Math.cbrt(vol);
            String s1=String.format("%,.2f", s);
            ed1.setText(s1);
        }
    }
}