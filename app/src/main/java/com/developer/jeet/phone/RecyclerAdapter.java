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

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    ArrayList<String> brandName;
    ArrayList<Integer> brandImage;
//    int[] brandImage;
    Context context;

    public RecyclerAdapter(ArrayList<Integer> brandImage, ArrayList<String> brandName, Context context) {
        this.brandName = brandName;
        this.context = context;
        this.brandImage = brandImage;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recyclerlistitem, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        viewHolder.tv.setText(brandName.get(i));
        viewHolder.img.setImageResource(brandImage.get(i));
        viewHolder.li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DeviceListActivity.class);
                intent.putExtra("brandName",brandName.get(i));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return brandImage.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv;
        ImageView img;
        LinearLayout li;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.txt);
            img = itemView.findViewById(R.id.img);
            li = itemView.findViewById(R.id.parent);
        }
    }
}
