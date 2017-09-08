package com.dev.jochemvanhespen.listviewexercise;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by JochemVanHespen on 9/8/2017.
 */

public class DetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //get intent used to open this intent
        Intent intent = getIntent();

        //get data from intent
        Bundle bundle = intent.getExtras();

        String phone = bundle.getString("phone");

        //update text and image view
        TextView tv = (TextView) findViewById(R.id.phoneTextView);
        tv.setText(phone);
        // get imageView from detailActivity
        ImageView imgv = (ImageView) findViewById(R.id.imageView2);

        switch(phone)
        {
            case "Android": imgv.setImageResource(R.drawable.android); break;
            case "iPhone": imgv.setImageResource(R.drawable.ios); break;
            case "WindowsMobile": imgv.setImageResource(R.drawable.windows); break;
            case "Blackberry": imgv.setImageResource(R.drawable.blackberry); break;
            case "WebOS": imgv.setImageResource(R.drawable.webos); break;
            case "Ubuntu": imgv.setImageResource(R.drawable.ubuntu); break;
        }

    }

    public void backButtonPressed(View view)
    {
        // close activity
        finish();
    }
}
