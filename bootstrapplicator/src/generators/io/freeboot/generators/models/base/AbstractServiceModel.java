package io.freeboot.generators.models.base;

import io.freeboot.generators.models.ClassType;

public class AbstractServiceModel extends AbstractClassModel {

	public AbstractServiceModel(String classRoot, String packageRoot) {
		super(classRoot, packageRoot, ClassType.SERVICE);
	}

}
