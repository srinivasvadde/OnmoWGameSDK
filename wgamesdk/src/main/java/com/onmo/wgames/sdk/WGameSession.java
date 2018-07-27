package com.onmo.wgames.sdk;

import com.onmo.wgames.sdk.impl.api.GetUserId;
import com.onmo.wgames.sdk.impl.api.GetUserProfile;

/**
 * Created by Srini on 14/02/2018.
 */

public class WGameSession implements IWGameSession {

	private WGameAccess credentials;
	private SDKConnector mConnector;

	public WGameSession(SDKConnector connector, WGameAccess credentials) {
		this.mConnector = connector;
		this.credentials = credentials;
	}

	@Override
	public WGameAccess getAccess() {
		return credentials;
	}

	public SDKConnector getConnector() {
		return mConnector;
	}

	@Override
	public void isUserActive(IResponseHandler<Boolean> responseHandler) {

		new GetUserProfile(mConnector, responseHandler).getUserProfile();
	}

	@Override
	public void getUserId(IResponseHandler<String> responseHandler) {
		new GetUserId(mConnector, responseHandler).getUser();
	}

}
