package com.jdev.common.domain.register;

import org.json.JSONObject;

import lombok.Data;

@Data
public class Address {

	private String address1;
	private String address2;
	private String street;
	private String city;
	private String state;
	private String country;
	
	@Override
	public String toString() {
		return new JSONObject(this).toString();
	}
	
}
