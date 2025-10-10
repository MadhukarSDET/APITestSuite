package com.models.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class RegisterResponse {
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public int id;
	public String token;
	public String error;
	
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	
	
}
