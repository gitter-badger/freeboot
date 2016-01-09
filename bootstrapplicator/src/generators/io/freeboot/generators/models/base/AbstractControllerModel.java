package io.freeboot.generators.models.base;

import io.freeboot.generators.models.ClassType;

public abstract class AbstractControllerModel extends AbstractClassModel {

	public AbstractControllerModel(String classRoot, String packageRoot) {
		super(classRoot, packageRoot, ClassType.CONTROLLER);
	}

}
