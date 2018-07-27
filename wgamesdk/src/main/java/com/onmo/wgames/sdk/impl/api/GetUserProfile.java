package com.onmo.wgames.sdk.impl.api;

import android.database.Cursor;

import com.onmo.wgames.sdk.IResponseHandler;
import com.onmo.wgames.sdk.LogApp;
import com.onmo.wgames.sdk.SDKConnector;
import com.onmo.wgames.sdk.core.http.request.IRequestPacket;
import com.onmo.wgames.sdk.core.http.request.RequestPacket;
import com.onmo.wgames.sdk.core.http.request.RequestPacketConstant;
import com.onmo.wgames.sdk.impl.UProviderInfo;
import com.onmo.wgames.sdk.impl.handler.GetUserProfileHandler;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by srini on 1/3/18.
 */

public class GetUserProfile extends APIBaseHandler {
    private static final String TAG = "GetUserProfile";
    SDKConnector mConnector;

    private IResponseHandler<Boolean> responseHandler;


    public GetUserProfile(SDKConnector connector,
                          IResponseHandler<Boolean> uiResponseHandler) {
        super(connector, RequestPacketConstant.ServiceKeys.SERVICE_GET_USER_PROFILE);

        LogApp.d(TAG, "GetUserProfile  " );
        this.mConnector = connector;
        this.responseHandler = uiResponseHandler;
    }

    public void getUserProfile() {
        Cursor cursor = getQuaryCursor(UProviderInfo.URL_GET_USER_STATUS);
        if(cursor!=null)
        {
            LogApp.d(TAG, "getUserProfile() calling cursor -->"+cursor.getCount());

            String data =  null;
            cursor.moveToFirst();
            StringBuilder res = new StringBuilder();
            while (!cursor.isAfterLast()) {
                res.append("\n" + cursor.getString(cursor.getColumnIndex("id")) + "-" + cursor.getString(cursor.getColumnIndex("name")));
                data = cursor.getString(cursor.getColumnIndex("name"));
                cursor.moveToNext();

            }
            LogApp.d(TAG, "getUserProfile()  -->"+res);
            if(data!=null) {
                responseHandler.handleResponse(true);
            }
            else
            {
                responseHandler.handleResponse(false);
            }

        }
        else {

            GetUserProfileHandler getCategoryContentHandler = new GetUserProfileHandler(mConnector, responseHandler);
            initAPIRequest(getRequestPacket(), getCategoryContentHandler);

        }


    }


    public IRequestPacket getRequestPacket() {
        /**
         * Encapsulate all mobile App server specific request at one place
         */
        IRequestPacket mobileaAppsRequest = new RequestPacket();

        /** 1. set URL */
        String baseURL = getBaseAPIURL();

        mobileaAppsRequest.setUrl(baseURL);

        Map<String, String> reqParam = new HashMap<String, String>();
        /** set request params */

        // need to configure
       /* reqParam.put(RequestPacketConstant.GriffRequestParam.MSISDN,getPlainServerTMEID()); //"1103514782463474570"
        reqParam.put(RequestPacketConstant.GriffRequestParam.APP_ID ,getCacheParamValue(BILLING_APP_ID));
        reqParam.put(RequestPacketConstant.GriffRequestParam.USERNAME,getCacheParamValue(BILLING_USERNAME));
        reqParam.put(RequestPacketConstant.GriffRequestParam.PASSWORD,getCacheParamValue(BILLING_PASSWORD));
        reqParam.put(RequestPacketConstant.GriffRequestParam.CP_NAME,getCacheParamValue(BILLING_CPNAME));
        reqParam.put(RequestPacketConstant.GriffRequestParam.USER_AGENT,getUserAgent());*/
        mobileaAppsRequest.setRequestParam(reqParam);
        return mobileaAppsRequest;
    }


   /* private String getCacheParamValue(String aKey)
    {
        return  SDKParamCache.getCachedParams(mConnector.getApplicationContext(), PREFS_PRIFIX.concat(aKey));
    }

    private String getPlainServerTMEID()
    {
        final String localStorageTMEID =  SDKParamCache.getCachedParams(mConnector.getApplicationContext(), ConfigConstant.USER_TMEID);
        if(localStorageTMEID!=null)
        return TestEncryption.getPlainServerTMEID(localStorageTMEID);

        return null;

    }*/

    @Override
    public String getBaseAPIURL() {

        try{

           /*String baseURL =  getCacheParamValue(BILLING_BASE_API);

            if( baseURL!=null)
            {
                baseURL = baseURL.trim().concat( RequestPacketConstant.ServiceKeys.SERVICE_GET_USER_PROFILE);
                SDKLog.d(TAG, "getBaseAPIURL  "+baseURL, SDKLoggerConstant.PRIORITY_LEVEL_DEV);

                if(!baseURL.startsWith("http"))
                {
                    baseURL = "http://".concat(baseURL);
                }

                return baseURL;
            }
            else
            {
                return getGriffBaseURL().trim().concat( RequestPacketConstant.ServiceKeys.SERVICE_GET_USER_PROFILE);
            }*/

        }catch (Exception ex){
            LogApp.d("RBTAPIBaseHandler", "Get exception "+ex.getMessage());
        }
        return null;
    }
}
