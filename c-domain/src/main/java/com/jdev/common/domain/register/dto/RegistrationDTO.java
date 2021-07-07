package com.jdev.common.domain.register.dto;

import javax.validation.constraints.NotEmpty;

import org.json.JSONObject;
import org.springframework.data.mongodb.core.mapping.Document;

import com.jdev.common.domain.metadata.CommonRequest;
import com.jdev.common.domain.register.Address;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode(callSuper=true)
@Document(collection = "registration")
public class RegistrationDTO extends CommonRequest {

//	@Id
//	private String id;
	
	@NotEmpty(message = "Firstname should not be Empty")
	private String firstName;
	private String lastName;
	private String userName; //try for auto generate with the combination of FN and LN
	private String phoneNo;
	private boolean gender;
	private String requestId;
	private Address address;
	
	@Override
	public String toString() {
		return new JSONObject(this).toString();
	}
}
