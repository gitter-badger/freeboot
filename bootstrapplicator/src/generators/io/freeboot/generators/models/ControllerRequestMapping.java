package io.freeboot.generators.models;

import org.h2.util.StringUtils;

public class ControllerRequestMapping {

	private String mappingName;
	private String returnView;
	
	public ControllerRequestMapping(String mappingName) {
		this(mappingName, null);
	}
	
	public ControllerRequestMapping(String mappingName, String returnView) {
		this.setMappingName(mappingName);
	    this.setReturnView(!StringUtils.isNullOrEmpty(returnView) ? returnView : mappingName.toLowerCase());
	}

	public String getReturnView() {
		return returnView;
	}

	public void setReturnView(String returnView) {
		this.returnView = returnView;
	}

	public String getMappingName() {
		return mappingName;
	}

	public void setMappingName(String mappingName) {
		this.mappingName = mappingName;
	}
	
}
