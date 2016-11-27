package com.and.lodgekiosk.view.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.and.lodgekiosk.R;
import com.and.lodgekiosk.infrastructure.enums.RoomType;
import com.and.lodgekiosk.view.main.room.RoomActivity;
import com.and.lodgekiosk.view.widget.KioskActivity;

/**
 * Created by Won on 2016-11-06.
 */
public class HomeActivity extends Activity implements View.OnClickListener{

    private Button standardRoomButton;
    private Button specialRoomButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        this.standardRoomButton = (Button)findViewById(R.id.standardRoomButton);
        this.specialRoomButton = (Button)findViewById(R.id.specialRoomButton);

        this.standardRoomButton.setOnClickListener(this);
        this.specialRoomButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.standardRoomButton:
                this.roomActivity(RoomType.Standard);
                break;
            case R.id.specialRoomButton:
                this.roomActivity(RoomType.Special);
                break;
        }
    }

    private void roomActivity(RoomType type){

        Intent intent = new Intent(this, RoomActivity.class);
        intent.putExtra("roomType", type.toString());
        startActivity(intent);
    }
}
