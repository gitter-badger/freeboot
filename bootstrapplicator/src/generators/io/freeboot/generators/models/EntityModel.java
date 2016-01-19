package io.freeboot.generators.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class EntityModel {

	private String packageName;
	private String entityName;
	
	public EntityModel() {}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	
}
