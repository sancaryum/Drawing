package com.example.drawing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Yazdığımız class View classını extend ettiği için direkt olarak görüntüsünü getirebiliyoruz
        setContentView(new drawing(this));
        


    }
}
