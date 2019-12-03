package com.example.recyclerviewandeventclickitem;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BirdAdapter extends RecyclerView.Adapter<BirdAdapter.ViewHolder> {

    private List<Bird> list;
    private OnClick click;

    public BirdAdapter(OnClick click, List<Bird> list) {
        this.list = list;
        this.click = click;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Bird bird = list.get(position);

        holder.imgitem.setImageResource(bird.getPhoto());
        holder.txvName.setText(bird.getName());
        holder.txvDescription.setText(bird.getDescription());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgitem;
        TextView txvName, txvDescription;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgitem = itemView.findViewById(R.id.imgItem);
            txvName = itemView.findViewById(R.id.txvName);
            txvDescription = itemView.findViewById(R.id.txvDescription);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    click.OnClick(getPosition());
                }
            });
        }
    }
}
