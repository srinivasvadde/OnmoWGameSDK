package com.onmo.wgames.sdk.impl.handler;

import android.os.Handler;
import android.util.Log;

import com.google.gson.Gson;
import com.onmo.wgames.sdk.IResponseHandler;
import com.onmo.wgames.sdk.LogApp;
import com.onmo.wgames.sdk.SDKConnector;
import com.onmo.wgames.sdk.SDKException;
import com.onmo.wgames.sdk.Utils;
import com.onmo.wgames.sdk.core.http.parser.IHTTPResponseParser;
import com.onmo.wgames.sdk.impl.griff.Packs;
import com.onmo.wgames.sdk.impl.griff.Status;
import com.onmo.wgames.sdk.impl.griff.UserChargingProfile;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import okhttp3.Headers;

/**
 * Created by srini on 1/3/18.
 */
public class GetUserProfileHandler implements IHTTPResponseParser {
//    private IResponseHandler<UserChargingProfile> uiResponseHandler;
	private IResponseHandler<Boolean> uiMainResponseHandler;
	private Handler mHandler;
	private String TAG = "GetUserProfileHandler";
	private SDKConnector mConnector;
	public static final String ITEMS = "items";

	public GetUserProfileHandler(SDKConnector connector,  IResponseHandler<Boolean> uiHandler) {

    	this.uiMainResponseHandler = uiHandler;
        this.mConnector = connector;
		mHandler = new Handler();

    }

    @Override
    public void handleException(int code, SDKException ex) {

		final SDKException e = ex;

          mHandler.post(new Runnable() {
            @Override
            public void run() {
				uiMainResponseHandler.handleException(e);
            }
        });
    }


    public void parser(int code, String httpResponseStr, Headers header ) {

		if (!Utils.isStringEmpty(httpResponseStr)) {
    		 final UserChargingProfile response = parse(httpResponseStr);
	          if(response!=null )
	          {


				  if (response.getStatus() != null && response.getStatus().length > 0) {
					  Status status = response.getStatus()[0];


					  mHandler.post(new Runnable() {
						  @Override
						  public void run() {
							  uiMainResponseHandler.handleResponse(true);
						  }
					  });
					  // sving the user pack details in cache
					/*  SDKParamCache.setCachedParams(mConnector.getApplicationContext(), ConfigConstant.USER_SUB_STATUS,status.getStatus() );
					  SDKParamCache.setCachedParams(mConnector.getApplicationContext(), ConfigConstant.USER_SUB_PACK_ID,status.getPackid() );
					  SDKParamCache.setCachedParams(mConnector.getApplicationContext(), ConfigConstant.USER_SUB_PACK_DESCRIPTION,status.getDescription() );*/

					  Log.d(TAG, "result activate user case --->" + status.getPackid() + ": getName: " + status.getName() + " , getStatus:" + status.getStatus() + " ,getDescription: " + status.getDescription());

				  } else if (response.getPacks()!=null &&response.getPacks().length>0 ) {
				  		int size = response.getPacks().length;
					    Packs packs = response.getPacks()[0];
					  	ArrayList<Packs> packsArrayList =null;
					  	try {
							if (size > 1) {
								packsArrayList = new ArrayList<Packs>(Arrays.asList(response.getPacks()));
								Collections.sort(packsArrayList);

								/*Log.d(TAG, "##########################");
								for (int i = 0; i < size; i++) {
									Log.d(TAG, "result activate user case --->" + packsArrayList.get(i).getPackid() + ": getName: " + packsArrayList.get(i).getName() + " , getPeriod:" + packsArrayList.get(i).getBilling_details().getPeriod() + " ,getDescription: " + packsArrayList.get(i).getBilling_details().getAmount());

								}*/
								packs = packsArrayList.get(0);
//								Log.d(TAG, "#########end #################");

							}
						}catch (Exception ex)
						{
							Log.d(TAG, "got exception at pack sorting");
						}
					  mHandler.post(new Runnable() {
						  @Override
						  public void run() {
							  uiMainResponseHandler.handleResponse(false);
						  }
					  });
					  Log.d(TAG, "result not ** activate user case --->" + packs.getPackid() + ": getName: " + packs.getName() + " , getType:" + packs.getType() + " ,getDescription: " + packs.getDescription());
				  }
				  else
				  {
					  mHandler.post(new Runnable() {
						  @Override
						  public void run() {
							  uiMainResponseHandler.handleResponse(false);
						  }
					  });
				  }



	          }
	          else {
	        	  LogApp.d(TAG," response is null or empty:");
	        	  handleException(code,new SDKException("CONNECTION_ERROR",5000));
	          }
	        }
	        else {
			handleException(code,new SDKException("CONNECTION_ERROR",5000));
		}
    }

	public UserChargingProfile parse(String p_Response) {
		UserChargingProfile userChargingProfile =null;
		try {
			LogApp.d(TAG," inside the parse()");
			JSONObject jsonData = new JSONObject(p_Response);
			Gson gson = new Gson();
			userChargingProfile = gson.fromJson(jsonData.toString(), UserChargingProfile.class);
			LogApp.d(TAG, "getSessionid :  -->"+userChargingProfile.getSessionid() );
		} catch (Exception ex) {
			LogApp.d(TAG," got error inside the parse()"+ex.getMessage());
			return null;
		}

		LogApp.d(TAG, "returning the results");
		return userChargingProfile;
	}


}

