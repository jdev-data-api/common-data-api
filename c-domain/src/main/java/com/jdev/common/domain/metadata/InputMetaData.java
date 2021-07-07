package com.jdev.common.domain.metadata;

import org.json.JSONObject;

import lombok.Data;

@Data
public class InputMetaData {

	private String transactionId;
	
	@Override
	public String toString() {
		return new JSONObject(this).toString();
	}
}
