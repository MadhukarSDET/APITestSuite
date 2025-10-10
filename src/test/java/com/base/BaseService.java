package com.base;

import com.filters.LoggingFilters;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {

	protected RequestSpecification requestSpec;

	// we can use both "@BeforeMethod" and "Constructor" concept to access "request"
	// variable
	// from "LoginTest" class.
	
	static {
		RestAssured.filters(new LoggingFilters());
	}
	public BaseService() {
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification given = RestAssured.given();
		requestSpec = given.header("content-type", "application/json").header("x-api-key", "reqres-free-v1");
	}

	public Response getRequest(String endpoint) {
		return requestSpec.get(endpoint);
	}

	public Response putRequest(String payload, String endpoint) {
		return requestSpec.body(payload).put(endpoint);

	}
	
	public Response postRequest(Object payload, String endpoint) {
		return requestSpec.body(payload).post(endpoint);
	}
}
