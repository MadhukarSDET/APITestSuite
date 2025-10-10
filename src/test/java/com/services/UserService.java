package com.services;

import com.base.BaseService;

import io.restassured.response.Response;

public class UserService extends BaseService {

	protected static final String BASE_PATH = "api";

	public Response getUsersList(String endpoint) {
		return getRequest(BASE_PATH+endpoint);
	}

	public Response getSingleUser(String endpoint) {
		return getRequest(BASE_PATH+endpoint);
	}
	
	public Response updateUser(String payload,String endpoint) {
		return putRequest(payload, BASE_PATH+endpoint); 
	}

}
