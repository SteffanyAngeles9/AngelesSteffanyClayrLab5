package com.angeles.steffany;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void nextScreen(View v){
        Intent i=null, chooser=null;
        if(v.getId()==R.id.activity){
            i = new Intent (this, MainActivity.class);
            startActivity(i);

        }else if(v.getId()==R.id.map){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.6336,121.0194"));
            chooser = Intent.createChooser(i, "Create a map app");
            startActivity(chooser);
        }
    }
}
