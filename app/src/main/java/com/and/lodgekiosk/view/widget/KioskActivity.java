package com.and.lodgekiosk.view.widget;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import com.and.lodgekiosk.R;

/**
 * Created by Won on 2016-11-06.
 */
public class KioskActivity extends Activity {
    public TextView BaseMessageTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_base);

        this.BaseMessageTextView = (TextView)findViewById(R.id.BaseMessageTextView);
    }

    public void setBaseMessage(String msg) {
        this.BaseMessageTextView.setText(msg);
    }
    public String getBaseMessage() {
        return this.BaseMessageTextView.getText().toString();
    }

}
