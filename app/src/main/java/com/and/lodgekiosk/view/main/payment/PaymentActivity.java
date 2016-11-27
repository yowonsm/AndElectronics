package com.and.lodgekiosk.view.main.payment;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.and.lodgekiosk.R;
import com.jinsit.dogplus.response.DogPetListItemData;

/**
 * Created by Won on 2016-11-13.
 */
public class PaymentActivity extends Activity implements View.OnClickListener {

    private Button cashButton;
    private Button cardButton;
    private TextView payAmountTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        this.cashButton = (Button) findViewById(R.id.cashButton);
        this.cardButton = (Button) findViewById(R.id.cardButton);
        this.cashButton.setOnClickListener(this);
        this.cardButton.setOnClickListener(this);

        this.payAmountTextView = (TextView)findViewById(R.id.payAmountTextView);

        DogPetListItemData petData = (DogPetListItemData)this.getIntent().getExtras().getSerializable("obj");

        this.payAmountTextView.setText(petData.getSale_price());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.cashButton:

                break;

            case R.id.cardButton:

                break;
        }
    }


}
