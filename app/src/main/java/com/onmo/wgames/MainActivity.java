package com.onmo.wgames;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

import com.onmo.wgames.sdk.IResponseHandler;
import com.onmo.wgames.sdk.IWGameSession;
import com.onmo.wgames.sdk.OnmoWGSDK;
import com.onmo.wgames.sdk.SDKException;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private TextView mTextMessage;

    IWGameSession mWGSession ;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        // getting session object to access the SDK methods
        mWGSession = OnmoWGSDK.newInitializer(MainActivity.this)
                .build();

    }



    private void getUser()
    {
        Log.d(TAG,"getUser-->");

        if(mWGSession!=null)
        {
            mWGSession.getStoreUser(new IResponseHandler<String>() {
                @Override
                public void handleResponse(String result) {

                }

                @Override
                public void handleException(SDKException exception) {

                }
            });
        }



    }
}
