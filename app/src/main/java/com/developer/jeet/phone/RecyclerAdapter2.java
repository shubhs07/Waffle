package com.developer.jeet.phone;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerAdapter2 extends RecyclerView.Adapter<RecyclerAdapter2.ViewHolder>  {
    Context context;
    ArrayList<String> deviceList;
    ArrayList<Integer> deviceImg;
    ArrayList<String> deviceDesc;

    public RecyclerAdapter2(Context context, ArrayList<String> deviceList, ArrayList<Integer> deviceImg, ArrayList<String> deviceDesc) {
        this.context = context;
        this.deviceList = deviceList;
        this.deviceImg = deviceImg;
        this.deviceDesc = deviceDesc;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.device_list_view,viewGroup,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        viewHolder.tv.setText(deviceList.get(i));
        viewHolder.img.setImageResource(deviceImg.get(i));
        viewHolder.li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DeviceDescActivity.class);
                intent.putExtra("brandDesc",deviceDesc.get(i));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return deviceList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv;
        ImageView img;
        LinearLayout li;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.txtDevice);
            img = itemView.findViewById(R.id.imgDevice);
            li = itemView.findViewById(R.id.parent);
        }
    }
}
