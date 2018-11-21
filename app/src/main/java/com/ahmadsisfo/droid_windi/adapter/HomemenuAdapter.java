package com.ahmadsisfo.droid_windi.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ahmadsisfo.droid_windi.R;
import com.ahmadsisfo.droid_windi.DetailActivity;
import com.ahmadsisfo.droid_windi.model.Homemenu;
import com.bumptech.glide.Glide;

import java.util.List;


public class HomemenuAdapter extends RecyclerView.Adapter<HomemenuAdapter.MyViewHolder> {

    private Context mContext;
    private List<Homemenu> albumList;

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView title, count;
        public ImageView thumbnail, overflow;

        public MyViewHolder(View itemView) {

            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            count = (TextView) itemView.findViewById(R.id.count);
            thumbnail = (ImageView) itemView.findViewById(R.id.thumbnail);
            title.setOnClickListener(this);
            count.setOnClickListener(this);
            thumbnail.setOnClickListener(this);
            //overflow = (ImageView) view.findViewById(R.id.overflow);
        }

        @Override
        public void onClick(View v) {
            int pos = getAdapterPosition();
            if (pos != RecyclerView.NO_POSITION){
                Intent intent;
                intent = new Intent(mContext, DetailActivity.class);
                intent.putExtra("name", albumList.get(pos).getName());
                intent.putExtra("thumbnail", albumList.get(pos).getThumbnail());
                intent.putExtra("file", albumList.get(pos).getFile());

                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mContext.startActivity(intent);
                //Toast.makeText(v.getContext(), "You clicked " + clickedDataItem.getName(), Toast.LENGTH_SHORT).show();
            }
        }
    }


    public HomemenuAdapter(Context mContext, List<Homemenu> albumList) {
        this.mContext = mContext;
        this.albumList = albumList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.homemenu_card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        Homemenu album = albumList.get(position);
        holder.title.setText(album.getName());
        holder.count.setText(album.getNumOfSongs() + " songs");

        // loading album cover using Glide library
        Glide.with(mContext).load(album.getThumbnail()).into(holder.thumbnail);

        /*holder.overflow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopupMenu(holder.overflow);
            }
        });*/
    }


    @Override
    public int getItemCount() {
        return albumList.size();
    }


}
