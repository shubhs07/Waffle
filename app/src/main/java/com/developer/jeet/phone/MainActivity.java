package com.developer.jeet.phone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    ArrayList<String> brandName;
    ArrayList<Integer> brandImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        brandImage = new ArrayList<>();
        brandName = new ArrayList<>();

        brandName.add("Samsung");
        brandName.add("Apple");
        brandName.add("OnePlus");
        brandName.add("Google");
        brandName.add("Asus");
        brandName.add("Oppo");
        brandName.add("Vivo");
        brandName.add("Honor");
        brandImage.add(R.drawable.samsung);
        brandImage.add(R.drawable.apple);
        brandImage.add(R.drawable.oneplus);
        brandImage.add(R.drawable.google);
        brandImage.add(R.drawable.asus);
        brandImage.add(R.drawable.oppo);
        brandImage.add(R.drawable.vivo);
        brandImage.add(R.drawable.huawei);


        rv = findViewById(R.id.rv);
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(brandImage, brandName, this);
        rv.setAdapter(recyclerAdapter);
        rv.setLayoutManager(new LinearLayoutManager(this));
    }
}
