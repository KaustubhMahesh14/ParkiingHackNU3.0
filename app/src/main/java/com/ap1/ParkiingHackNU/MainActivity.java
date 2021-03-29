package com.ap1.ParkiingHackNU;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void regis(View view){
        Intent intent=new Intent(MainActivity.this,activityregis.class);
        startActivity(intent);



    }
}

