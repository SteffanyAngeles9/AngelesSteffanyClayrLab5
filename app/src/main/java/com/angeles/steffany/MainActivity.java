package com.angeles.steffany;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(this, myService.class);
        startService(i);
    }

    public void nextScreen(View v){
        Intent i=null, chooser=null;
        if(v.getId()==R.id.activity){
            i = new Intent (this, Activity2.class);
            startActivity(i);

        }else if(v.getId()==R.id.map){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.6012,120.9750"));
            chooser = Intent.createChooser(i, "Create a map app");
            startActivity(chooser);
        }
    }
}
