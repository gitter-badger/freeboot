package io.freeboot.generators.models.base;

import io.freeboot.generators.models.ClassType;

public class AbstractInterfaceModel extends AbstractClassModel {

	public AbstractInterfaceModel(String classRoot, String packageRoot) {
		super(classRoot, packageRoot, ClassType.INTERFACE);
	}

}
