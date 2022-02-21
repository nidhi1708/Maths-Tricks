package com.example.mathstricksnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HCF extends AppCompatActivity {
    private EditText c , d;
    private TextView t1;
    private Button b1 , b2 , b3 , b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hcf);

        c=findViewById(R.id.editTextNumber);
        d=findViewById(R.id.editTextNumber2);
        t1=findViewById(R.id.textView4);

        b1=findViewById(R.id.button12);
        b2=findViewById(R.id.button13);
    }

    public void h(View v){
        String s1=c.getText().toString();
        String s2=d.getText().toString();
        if(TextUtils.isEmpty(s1) || TextUtils.isEmpty(s2)){
            Toast.makeText(this, "Enter the required fields", Toast.LENGTH_SHORT).show();
        }else {
            int n = Integer.parseInt(s1);
            int m = Integer.parseInt(s2);

            int temp;
            while (m > 0) {
                temp = m;
                m = n % m;
                n = temp;
            }

            t1.setText(Integer.toString(n));
        }
    }


    public int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    // method to return LCM of two numbers
    public int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }


    public void l(View v){
        String s1=c.getText().toString();
        String s2=d.getText().toString();
        if(TextUtils.isEmpty(s1) || TextUtils.isEmpty(s2)){
            Toast.makeText(this, "Enter the required fields", Toast.LENGTH_SHORT).show();
        }else {

        int n=Integer.parseInt(s1);
        int m=Integer.parseInt(s2);

        int ans=lcm(n , m);
        t1.setText(Integer.toString(ans));}
    }

    public void pf1(View v){
        String s1=c.getText().toString();
        if(TextUtils.isEmpty(s1)){
            Toast.makeText(this, "Enter the required fields", Toast.LENGTH_SHORT).show();
        }else{
        int n=Integer.parseInt(s1);
      StringBuilder sb=new StringBuilder();
        for(int i = 2; i< n; i++) {
            while(n%i == 0) {
                sb.append(i+", ");
                n = n/i;
            }
        }
        if(n >=2) {
            sb.append(n+",");
        }
            sb.append(".");


        t1.setText(sb);}
    }

    public void pf2(View v){
        String s1=d.getText().toString();
        if(TextUtils.isEmpty(s1)){
            Toast.makeText(this, "Enter the required fields", Toast.LENGTH_SHORT).show();
        }else{
        int n=Integer.parseInt(s1);
        StringBuilder sb=new StringBuilder();
        for(int i = 2; i< n; i++) {
            while(n%i == 0) {
                sb.append(i+", ");
                n = n/i;
            }
        }
        if(n >=2) {
            sb.append(n+",");
        }
        sb.append(".");

        t1.setText(sb);}
    }
}