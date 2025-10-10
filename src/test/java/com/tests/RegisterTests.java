package com.tests;

import org.testng.annotations.Test;
import com.models.requests.RegisterRequest;
import com.models.responses.RegisterResponse;
import com.services.RegisterService;

import io.restassured.response.Response;

public class RegisterTests {

	RegisterService registerService = new RegisterService();

	@Test
	public void register() {
		RegisterRequest registerRequest = new RegisterRequest("madhukar", "madhukar@zoho.com", "madhukar");
		Response response = registerService.register(registerRequest, "/register");
		RegisterResponse registerResponse = response.as(RegisterResponse.class);
		if (response.getStatusCode() == 200) {
			System.out.println(registerResponse.getToken() + ":" + registerResponse.getToken());
		} else {
			System.out.println(registerResponse.getError());
		}
	}
}
