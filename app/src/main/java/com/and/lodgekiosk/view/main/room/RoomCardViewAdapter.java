package com.and.lodgekiosk.view.main.room;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.and.lodgekiosk.R;
import com.and.lodgekiosk.view.main.payment.PaymentActivity;
import com.jinsit.dogplus.imagecontroll.ImageDownloader;
import com.jinsit.dogplus.response.DogPetListItemData;

import java.util.List;

/**
 * Created by Won on 2016-03-28.
 */
public class RoomCardViewAdapter extends RecyclerView.Adapter<RoomCardViewAdapter.ViewHolder> {

    private Context context;
    //private List<RoomCardViewItem> items;
    private List<DogPetListItemData> petList;
    private int item_layout;

    public static final String BASIC_DOWNLOAD_URL = "http://asp.jinsit2.net:60027/item/image/";
    private final ImageDownloader imageDownloader = new ImageDownloader();

    public RoomCardViewAdapter(Context context, List<RoomCardViewItem> items, int item_layout, List<DogPetListItemData> petList) {
        this.context = context;
        //this.items=items;
        this.item_layout = item_layout;
        this.petList = petList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview, null);
        return new ViewHolder(v);
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final DogPetListItemData item = petList.get(position); //헤더가 있기 때문에 position -1해주라 헤더 없으니 -1안해도됨

        holder.title.setText(item.getItm_name());
        if (item.getImage_cnt().equals("0")) {
            holder.image.setImageResource(R.drawable.noimage_uploadphoto);
        } else {
            imageDownloader.download(BASIC_DOWNLOAD_URL + item.getItm_code() + "-01.jpg", item.getItm_code() + "-01.jpg", (ImageView) holder.image);
        }

        holder.cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, item.getItm_name(), Toast.LENGTH_SHORT).show();
                movePayment(item);
            }
        });
    }

 /*   @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final RoomCardViewItem item = items.get(position);
        Drawable drawable=context.getResources().getDrawable(item.getImage());
        holder.image.setBackground(drawable);
        holder.title.setText(item.getTitle());
        holder.cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, item.getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }*/

    @Override
    public int getItemCount() {
        return this.petList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView title;
        CardView cardview;

        public ViewHolder(View itemView) {
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.image);
            title = (TextView) itemView.findViewById(R.id.title);
            cardview = (CardView) itemView.findViewById(R.id.cardview);
        }
    }


    private void movePayment(DogPetListItemData item) {
        Bundle extras = new Bundle();

        Intent intent = new Intent(context, PaymentActivity.class);
        extras.putSerializable("obj", item);
        intent.putExtras(extras);
        context.startActivity(intent);
    }
}