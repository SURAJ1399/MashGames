package com.intern.mash_games;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{


    Context context;





    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_viewlayout ,viewGroup, false);
        context = viewGroup.getContext();

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }



    @Override
    public int getItemCount() {
        return 5;
    }



    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView pdfdesc;
        TextView author;

        View mView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mView = itemView;


        }
    }





}
