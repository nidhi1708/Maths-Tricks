package com.example.mathstricksnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }





    public void b(View v){
        Intent i = new Intent(getApplicationContext(),Table.class);
        startActivity(i);
    }
    public void c(View v){
        Intent i = new Intent(getApplicationContext(),AreasAndPeris.class);
        startActivity(i);
    }
    public void d(View v){
        Intent i = new Intent(getApplicationContext(),HCF.class);
        startActivity(i);
    }


    public void f(View v){
        Intent i = new Intent(getApplicationContext(),Roots.class);
        startActivity(i);
    }
    public void  g(View v){
        Intent i=new Intent(getApplicationContext() , SimpleAndCompound.class);
        startActivity(i);
    }
}