package com.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.models.responses.UserResponse;
import com.services.UserService;

import io.restassured.response.Response;

@Listeners(com.listeners.TestListener.class)
public class UserTests {
	
//	API Validations
//	1. Status code
//	2. Response time
//	3. Response Body
//	4. Response Body Size
//	5. Schema Validation
//	6. Each field data type validation
//	7. Null check
//	8. Key existance check
//	9. Content Type check /Headers
//	10 .Business logic

	UserService userService = new UserService();

	@Test
	public void getUserInfoTest() {
		Response response = userService.getSingleUser("/users/1");
		UserResponse responsePOJO = response.as(UserResponse.class);
		System.out.println(response.prettyPrint());
		System.out.println(responsePOJO.getMeta().getUpgrade_url());
		System.out.println(responsePOJO.getSupport().getText());
	}

	@Test
	public void getUsersListTest() {
		Response response = userService.getUsersList("/users");
		int dataArraySize = response.jsonPath().getList("data").size();
		System.out.println("data size:" + dataArraySize);
		System.out.println(response.asPrettyString());
		Assert.assertEquals(dataArraySize, 6, "Array Size MisMatch:");
		Object object = response.jsonPath().get("page");
		System.out.println("page:" + object);
		Object id = response.jsonPath().get("data[0].id");
		Object email = response.jsonPath().get("data[0].email");
		System.out.println(id);
		System.out.println(email);
		
		boolean doesAvatarExists = response.getBody().asString().contains("avatar");
		Assert.assertTrue(doesAvatarExists, "Avatar Not Avilable");
		
		Object id2 = response.jsonPath().get("data[0].id");
		Assert.assertNotNull(id2, "ID KEY NOT EXISTS");
		
		Object idType = response.jsonPath().get("data[0].id");
		Assert.assertTrue(idType instanceof Integer, "ID is not declared as integer:");

	}

	@Test
	public void updateUserTest() {

		String payload = "{\r\n" + "  \"data\": {\r\n" + "    \"id\": 1,\r\n"
				+ "    \"email\": \"madhukar@reqres.in\",\r\n" + "    \"first_name\": \"Madhukar\",\r\n"
				+ "    \"last_name\": \"Mandadi\",\r\n"
				+ "    \"avatar\": \"https://reqres.in/img/faces/1-image-updated.jpg\"\r\n" + "  }\r\n" + "}\r\n" + "";

		userService.putRequest(payload, "/users/1");
	}
}
