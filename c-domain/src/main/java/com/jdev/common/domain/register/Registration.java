package com.jdev.common.domain.register;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import org.json.JSONObject;

import com.jdev.common.domain.metadata.CommonRequest;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
@Valid
public class Registration extends CommonRequest {

//	@Id
//	private String id;
	
	@NotEmpty(message = "Firstname should not be Empty")
	private String firstName;
	private String lastName;
	private String userName; //try for auto generate with the combination of FN and LN
	private String phoneNo;
	private String gender;
	private Address address;
	
	@Override
	public String toString() {
		return new JSONObject(this).toString();
	}
}
