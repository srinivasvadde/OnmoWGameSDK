package com.onmo.wgames;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.onmo.wgames.sdk.IResponseHandler;
import com.onmo.wgames.sdk.IWGameSession;
import com.onmo.wgames.sdk.LibMainActivity;
import com.onmo.wgames.sdk.OnmoWGSDK;
import com.onmo.wgames.sdk.SDKException;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private TextView tv_method_1;
    private TextView tv_method_2, tv_method_3;
    private TextView response_message;
    private IWGameSession mWGSession ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lib_activity_main);
        tv_method_1 = findViewById(R.id.tv_method_1);
        tv_method_2 = findViewById(R.id.tv_method_2);


        tv_method_3 = findViewById(R.id.tv_method_3);

        response_message = findViewById(R.id.response_message);
        // getting session object to access the SDK methods
        mWGSession = OnmoWGSDK.newInitializer(MainActivity.this)
                .build();

        tv_method_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(mWGSession!=null)
                {
                    mWGSession.getStoreUser(new IResponseHandler<String>() {
                        @Override
                        public void handleResponse(String aUserId) {
                            response_message.setText("User id:"+aUserId);
                        }

                        @Override
                        public void handleException(SDKException exception) {
                            response_message.setText("error::"+exception.getMessage());
                        }
                    });
                }
            }
        });

        tv_method_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(MainActivity.this, LibMainActivity.class);
                    startActivity(intent);
                }
               catch (Exception ex)
               {
                   Log.d(TAG, "Exception --->"+ex.getMessage());
               }
            }
        });
        tv_method_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(mWGSession!=null)
                {
                    mWGSession.getConfig(new IResponseHandler<String>() {
                        @Override
                        public void handleResponse(String config) {
                            response_message.setText("getConfig:"+config);
                        }

                        @Override
                        public void handleException(SDKException exception) {
                            response_message.setText("error::"+exception.getMessage());
                        }
                    });
                }

            }
        });
    }

}
