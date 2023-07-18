package com.anas.Belajar_Geometri;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.anas.Belajar_Geometri.R;

import java.util.List;

/**
 * Created by anas on 5/6/2023.
 */

public class JaringAdapter extends RecyclerView.Adapter<JaringAdapter.JaringViewHolder> {

    private Context mCtx;
    private List<JaringItem> JaringList;

    public JaringAdapter(Context mCtx, List<JaringItem> JaringList){
        this.mCtx = mCtx;
        this.JaringList = JaringList;
    }

    @Override
    public JaringViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.item_jaring, null);
        return new JaringViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull JaringViewHolder holder, final int position){
        final JaringItem JaringItem = JaringList.get(position);

        holder.textViewJaring.setText(JaringItem.getNamaJaring());
        holder.imageJaring.setImageResource(JaringItem.getThumbJaring());

        holder.cardViewJaring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mCtx, MateriJaring.class);
                intent.putExtra("namaJaring", JaringList.get(position).getNamaJaring());
                intent.putExtra("thumbJaring", JaringList.get(position).getThumbJaring());
                intent.putExtra("whiteThumbJaring", JaringList.get(position).getWhiteThumbJaring());
                intent.putExtra("rumusJaring", JaringList.get(position).getRumusJaring());
                mCtx.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount(){
        return JaringList.size();
    }


    class JaringViewHolder extends RecyclerView.ViewHolder{

        TextView textViewJaring;
        ImageView imageJaring;
        CardView cardViewJaring;

        public JaringViewHolder(View itemView) {
            super(itemView);

            textViewJaring = itemView.findViewById(R.id.textViewJaring);
            imageJaring = itemView.findViewById(R.id.imageJaring);
            cardViewJaring = itemView.findViewById(R.id.cardViewJaring);
        }

    }
}
