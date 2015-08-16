package com.pkdev.demoapplication.materialdesign.adapter;

import android.content.res.Resources;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.pkdev.demoapplication.R;

import java.util.ArrayList;

/**
 * Created by ultimate on 8/1/2015.
 */
public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.PersonalData> {

    Resources res;
    ArrayList<String> PersonalData = new ArrayList<>();
    public CardViewAdapter(ArrayList<String> PersonalData){
        this.PersonalData = PersonalData;
    }

    @Override
    public PersonalData onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_layout, parent, false);
        res = parent.getContext().getResources();
        return new PersonalData(v);
    }

    @Override
    public void onBindViewHolder(PersonalData holder, int position) {
        holder.cardview.setCardElevation(6.0f);
        holder.cardview.setRadius(16.0f);
        holder.cardview.setShadowPadding(40, 40, 40, 40);
        holder.cardview.setUseCompatPadding(true);
        holder.cardview.setPreventCornerOverlap(false);
        holder.personName.setText(PersonalData.get(position));
        holder.personAge.setText("20");

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

//        holder.personPhoto.setImageDrawable(res.getDrawable(R.mipmap.ic_launcher));
    }

    @Override
    public int getItemCount() {
        return PersonalData.size();
    }

    public static class PersonalData extends RecyclerView.ViewHolder {
        CardView cardview;
        TextView personName;
        TextView personAge;
        ImageView personPhoto;

        protected PersonalData(View itemView) {
            super(itemView);
            cardview = (CardView) itemView.findViewById(R.id.cardview);
            personName = (TextView) itemView.findViewById(R.id.person_name);
            personAge = (TextView) itemView.findViewById(R.id.person_age);
            personPhoto = (ImageView) itemView.findViewById(R.id.person_photo);
        }
    }
}