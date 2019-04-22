package com.developer.jeet.phone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class DeviceDescActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_desc);

        tv = findViewById(R.id.txt);
        String description = getIntent().getStringExtra("brandDesc");
        tv.setText(description);
    }


}