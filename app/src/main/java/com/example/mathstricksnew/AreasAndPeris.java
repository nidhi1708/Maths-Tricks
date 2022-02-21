package com.example.mathstricksnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Bundle;
import android.view.View;

public class AreasAndPeris extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areas_and_peris);
    }
    public void sq(View v){
        Intent i = new Intent(AreasAndPeris.this,Square.class);
        startActivity(i);
    }
    public void rect(View v){
        Intent i = new Intent(AreasAndPeris.this, Rectangle.class);
        startActivity(i);
    }

   public void tri(View v){
        Intent i=new Intent(AreasAndPeris.this , Triangle.class);
        startActivity(i);
   }

   public void cir(View v){
       Intent i=new Intent(AreasAndPeris.this , Circle.class);
       startActivity(i);
   }
   public void trap(View v){
       Intent i=new Intent(AreasAndPeris.this , Trapezium.class);
       startActivity(i);
   }

   public void cub(View v){
       Intent i=new Intent(AreasAndPeris.this , Cube.class);
       startActivity(i);
   }

   public void cubo(View v){
       Intent i=new Intent(AreasAndPeris.this , Cuboid.class);
       startActivity(i);
   }

   public void sphere(View v){
       Intent i=new Intent(AreasAndPeris.this , Sphere.class);
       startActivity(i);
   }

   public void cone(View v){
       Intent i=new Intent(AreasAndPeris.this , Cone.class);
       startActivity(i);
   }

   public void cy(View v){
        Intent i=new Intent(AreasAndPeris.this , Cylinder.class);
       startActivity(i);
   }

  public  void hemis(View v){
      Intent i=new Intent(AreasAndPeris.this ,Hemisphere.class);
      startActivity(i);
  }
}