package com.onmo.wgames.sdk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.onmo.sdk.R;

public class LibMainActivity extends AppCompatActivity {

    private static final String TAG = "LibMainActivity";
    private TextView tv_method_1;
    private TextView tv_method_2;
    private TextView response_message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lib_activity_main);
        tv_method_1 = findViewById(R.id.tv_method_1);
        tv_method_2 = findViewById(R.id.tv_method_2);

        response_message = findViewById(R.id.response_message);
        // getting session object to access the SDK methods


        tv_method_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });

        tv_method_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });
    }

}
