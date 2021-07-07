package com.jdev.common.domain.metadata;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class CommonRequest {

	@Valid
	@NotNull
	private InputMetaData inputMetaData;
	
}
