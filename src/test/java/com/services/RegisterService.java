package com.services;

import com.base.BaseService;

import io.restassured.response.Response;

public class RegisterService extends BaseService {

	protected static final String BASE_PATH = "api";

	public Response register(Object payload,String endpoint) {
		return postRequest(payload, BASE_PATH+endpoint); 
	}
}
