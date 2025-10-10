package com.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.models.responses.UserResponse;
import com.services.UserService;

import io.restassured.response.Response;

@Listeners(com.listeners.TestListener.class)
public class UserTests {
	
	UserService userService= new UserService();

	@Test
	public void getUserInfoTest() {
		Response response = userService.getSingleUser("/users/1");
		UserResponse responsePOJO = response.as(UserResponse.class);
		System.out.println(response.prettyPrint());
		//System.out.println(responsePOJO.getMeta().getUpgrade_url());
		//System.out.println(responsePOJO.getSupport().getText());
	}

	@Test
	public void getUsersListTest() {
		Response response = userService.getUsersList("/users");
		System.out.println(response.asPrettyString());
	}
	
	@Test
	public void updateUserTest() {
		
		String payload="{\r\n"
				+ "  \"data\": {\r\n"
				+ "    \"id\": 1,\r\n"
				+ "    \"email\": \"madhukar@reqres.in\",\r\n"
				+ "    \"first_name\": \"Madhukar\",\r\n"
				+ "    \"last_name\": \"Mandadi\",\r\n"
				+ "    \"avatar\": \"https://reqres.in/img/faces/1-image-updated.jpg\"\r\n"
				+ "  }\r\n"
				+ "}\r\n"
				+ "";
		
		userService.putRequest(payload, "/users/1");
	}
}
