package com.and.lodgekiosk.view.main.room;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.and.lodgekiosk.R;
import com.and.lodgekiosk.infrastructure.enums.RoomType;
import com.jinsit.dogplus.request.PetListRequestData;
import com.jinsit.dogplus.response.DogPetListItemData;
import com.jinsit.dogplus.webservice.DoubleInqueryDogService;
import com.jinsit.dogplus.webservice.InterfaceDogService;

import java.util.ArrayList;

/**
 * Created by Won on 2016-11-06.
 */
public class RoomActivity extends Activity {

    private Context context;

    //region widget
    private LinearLayoutManager layoutManager;
    private RoomType roomType;
    private TextView RoomTypeTextView;
    private RecyclerView roomRecyclerView;
    //Widget

    private ArrayList<DogPetListItemData> petList;
    private android.app.ProgressDialog ProgressDialog;
    private InterfaceDogService PDAService;


    /***
     * Constructor
     * RoomType: 특실, 일반실 등
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_room);

        this.context = this;
        this.PDAService = new DoubleInqueryDogService(context); //서비스온

        RoomTypeTextView = (TextView)findViewById(R.id.roomTypeTextView);
        Intent intent = this.getIntent();
        String type = intent.getStringExtra("roomType");
        if(RoomType.Special.toString().equals(type)){
            this.roomType = RoomType.Special;
            RoomTypeTextView.setText(this.roomType.getTypeName());
        }else{
            this.roomType = RoomType.Standard;
            RoomTypeTextView.setText(this.roomType.getTypeName());
        }

        this.roomRecyclerView = (RecyclerView)findViewById(R.id.roomRecyclerView);

        //this.layoutManager = new LinearLayoutManager(this.context); //노말 레이아웃 매니저
        this.layoutManager = new LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false);  //리싸이클러뷰를 호리즌탈로 만들수 있을까?

        this.roomRecyclerView.setHasFixedSize(true);
        this.roomRecyclerView.setLayoutManager(layoutManager);

        new GetRoomAsyncTask().execute();
    }



    private class GetRoomAsyncTask extends AsyncTask<Void, String ,Void>
    {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            RoomActivity.this.ProgressDialog = android.app.ProgressDialog.show(
                    context,
                    getResources().getString(R.string.async_room_title), getResources().getString(R.string.async_room_msg));
        }

        @Override
        protected Void doInBackground(Void... params) {

            PetListRequestData reqData = new PetListRequestData();
            reqData.setStoreCode("");
            reqData.setPriceFrom("0");
            reqData.setPriceTo("999999999999");

            petList = PDAService.getPetList(reqData);

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            RoomActivity.this.ProgressDialog.dismiss();
            roomRecyclerView.setAdapter(new RoomCardViewAdapter(context, null, R.layout.activity_room, petList));


        }
    }
}
