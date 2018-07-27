package com.onmo.wgames.sdk.impl;

import android.net.Uri;

 public final class UProviderInfo {

     public static final String PROVIDER_NAME = "com.onmo.ugames.WGameDataProvider";
     public static final String BASE_URL = "content://" + PROVIDER_NAME ;
     public static final String URL_GET_APP_DEATILS = "/cte";
     public static final String URL_GET_USER_ID = "/cte/getUserId";
     public static final String URL_GET_USER_STATUS = "/cte/getUserStatus";
     public static final String URL_GET_CONFIG = "/cte/getConfig";

     public static Uri getContentUri(String methodName)
     {
         return Uri.parse(BASE_URL.concat(methodName));
     }
}
