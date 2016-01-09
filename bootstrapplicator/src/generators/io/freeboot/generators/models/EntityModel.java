package io.freeboot.generators.models;

public class EntityModel {

	private String packageName;
	private String entityName;
	
	public EntityModel() {}

	public String getEntityName() {
		return entityName;
	}

	public void setClassName(String className) {
		this.entityName = className;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	
}
