package com.onmo.wgames.sdk;

/**
 * Created by Srini on 14/07/2018.
 * Comment
 */

public interface IWGameSession {
	WGameAccess getAccess();
	void isUserActive(IResponseHandler<Boolean> responseHandler);
	void getUserId(IResponseHandler<String> responseHandler);
}
