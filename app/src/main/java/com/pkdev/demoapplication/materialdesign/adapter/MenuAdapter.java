package com.pkdev.demoapplication.materialdesign.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.pkdev.demoapplication.R;

import java.util.ArrayList;

/**
 * Created by ultimate on 7/19/2015.
 */
public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {

    ArrayList<String> menu;
    MenuOnClick mItemClickListener;
    public interface MenuOnClick {
        void onItemClick(View view, int position);
    }

    public MenuAdapter(ArrayList<String> menuList){
        menu = menuList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_adapter, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.MenuName.setText(menu.get(position));

//        holder.itemView.setSelected(true);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mItemClickListener.onItemClick(view , position);
            }
        });
    }

    public void setOnLongItemClickListener(final MenuOnClick mItemClickListener) {
        this.mItemClickListener = mItemClickListener;
    }

    @Override
    public int getItemCount() {
        return menu.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView MenuName;
        public ImageView MenuImage;
        public ViewHolder(View v) {
            super(v);
            MenuName = (TextView) v.findViewById(R.id.menu_listview);
            MenuImage = (ImageView) v.findViewById(R.id.image_listview);
        }
    }
}
