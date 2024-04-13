package com.example.ejemplos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PlanningAdapter extends RecyclerView.Adapter<PlanningAdapter.ViewHolder>{

    private String[] datos;

    public PlanningAdapter(String[] datos) {
        this.datos = datos;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView texto;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            texto=itemView.findViewById(R.id.textDay);
        }
        public TextView getTexto(){
            return texto;
        }
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlanningAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return this.datos.length;
    }
}
