package com.services;

import com.base.BaseService;

import io.restassured.response.Response;

public class LoginService extends BaseService {

	protected static final String BASE_PATH = "api";

	public Response login(Object payload,String endpoint) {
		return postRequest(payload, BASE_PATH+endpoint); 
	}
}
