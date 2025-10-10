package com.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.models.requests.LoginRequest;
import com.models.responses.LoginResponse;
import com.services.LoginService;

import io.restassured.response.Response;

@Listeners(com.listeners.TestListener.class)
public class LoginTests{
	
	LoginService loginService= new LoginService();
	
	
	@Test
	public void loginWithPOJO() {
		LoginRequest loginRequest=new LoginRequest("eve.holt@reqres.in","pistol");
		Response response=loginService.login(loginRequest, "/login");
		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println(loginResponse.getToken());
		Assert.assertEquals(response.getStatusCode(), 200);
	}
}
