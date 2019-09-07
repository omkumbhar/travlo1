package com.example.travlo.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.travlo.LocationDetailsActivity;
import com.example.travlo.R;

import java.util.List;

public class CityAdapter extends RecyclerView.Adapter<CityAdapter.MyViewHolder> {

    List<String> cities;
    private Context context;

    public CityAdapter(List<String> cities, Context context) {
        this.cities = cities;
        this.context = context;
    }

    @NonNull
    @Override
    public CityAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.city_list,parent,false);
        return new CityAdapter.MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull CityAdapter.MyViewHolder holder, final int position) {
        final String city = cities.get(position);

        holder.city.setText(city);
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, LocationDetailsActivity.class);
                i.putExtra("CityName",cities.get(position));
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(i);
                //Toast.makeText(context, ""+ cities.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return cities.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView city;
        RelativeLayout layout;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            city = (TextView) itemView.findViewById(R.id.city);
            layout = (RelativeLayout) itemView.findViewById(R.id.layout);
        }
    }
}
