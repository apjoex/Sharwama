package com.sharwama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(Patterns.EMAIL_ADDRESS.matcher("apjoex@gmail.com").matches()){
            Toast.makeText(this, "E match", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "E no match", Toast.LENGTH_SHORT).show();
        }


    }
}
