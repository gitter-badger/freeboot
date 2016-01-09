package io.freeboot.generators.models.base;

import io.freeboot.generators.models.ClassType;

public class AbstractRepositoryModel extends AbstractClassModel {

	public AbstractRepositoryModel(String classRoot, String packageRoot) {
		super(classRoot, packageRoot, ClassType.REPOSITORY);
	}

}
