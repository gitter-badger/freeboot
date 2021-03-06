package io.freeboot.generators.models.base;

import com.google.common.base.CaseFormat;

import io.freeboot.generators.models.ClassType;

public abstract class AbstractClassModel {

	protected final String packageRoot;
	protected final String classRoot;
	private final ClassType type;
	
	public AbstractClassModel(String classRoot, String packageRoot, ClassType type) {
		this.classRoot = classRoot;
		this.packageRoot = packageRoot;
		this.type = type;
	}
	
	public String getClassRoot() {
		return classRoot;
	}
	
	public String getClassRootCamelCase() {
		return CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, getClassRoot());
	}
	
	public String getClassRootKebabCase() {
		return CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_HYPHEN, getClassRoot());
	}
	
	public final String getClassName() {
		switch(type) {
		case CONTROLLER:
			return classRoot + "Controller";
		case INTERFACE: 
			return "I" + classRoot + "Service";
		case SERVICE: 
			return classRoot + "Service";
		case REPOSITORY: 
			return classRoot + "Repository";
		}
		return classRoot;
	}
	
	public String getPackageRoot() {
		return packageRoot;
	}

	
}
