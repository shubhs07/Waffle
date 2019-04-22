package com.developer.jeet.phone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

public class DeviceListActivity extends AppCompatActivity {

    TextView tv;
    RecyclerView rv1;

    ArrayList<String> SamsungPhones;
    ArrayList<Integer> SamsungPhonesImages;
    ArrayList<String> SamsungPhonesDesc;

    ArrayList<String> ApplePhones;
    ArrayList<Integer> ApplePhonesImages;
    ArrayList<String> ApplePhonesDesc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_list);
        tv = findViewById(R.id.text);
        rv1 = findViewById(R.id.rv);
        String name = getIntent().getStringExtra("brandName");

        tv.setText(name);
        setData();

//        RecyclerAdapter2 recyclerAdapter = new RecyclerAdapter2(this, SamsungPhones);

                RecyclerAdapter2 recyclerAdapter2 = new RecyclerAdapter2(this, SamsungPhones, SamsungPhonesImages, SamsungPhonesDesc);
                rv1.setAdapter(recyclerAdapter2);
                rv1.setLayoutManager(new GridLayoutManager(this, 2));


    }

    void setData(){
        SamsungPhones = new ArrayList<>();
        SamsungPhonesImages = new ArrayList<>();
        SamsungPhonesDesc = new ArrayList<>();

        SamsungPhones.add("S10");
        SamsungPhonesImages.add(R.drawable.s10);

        SamsungPhones.add("Note 10");
        SamsungPhonesImages.add(R.drawable.s10plus);

        SamsungPhones.add("Note 8");
        SamsungPhonesImages.add(R.drawable.s10e);

        SamsungPhonesDesc.add("Description 1111111");
        SamsungPhonesDesc.add("Description 22222");
        SamsungPhonesDesc.add("Description 33333");
        //Apples List
        /*ApplePhones = new ArrayList<>();
        ApplePhonesImages = new ArrayList<>();
        ApplePhonesDesc = new ArrayList<>();

        ApplePhones.add("i-phone max");
        ApplePhonesImages.add(R.drawable.imax);
        ApplePhonesDesc.add("Description 1111111");

        ApplePhones.add("i-phone X");
        ApplePhonesImages.add(R.drawable.iphonex);
        ApplePhonesDesc.add("Description 1111111");*/


    }
}
