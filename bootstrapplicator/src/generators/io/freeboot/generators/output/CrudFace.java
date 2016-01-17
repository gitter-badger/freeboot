package io.freeboot.generators.output;

public class CrudFace {

	private String controllerClass;
	private String interfaceClass;
	private String serviceClass;
	private String repositoryClass;
	private String restClient;
	
	public String getControllerClass() {
		return controllerClass;
	}
	
	public CrudFace setControllerClass(String controllerClass) {
		this.controllerClass = controllerClass;
		return this;
	}
	
	public String getInterfaceClass() {
		return interfaceClass;
	}
	
	public CrudFace setInterfaceClass(String interfaceClass) {
		this.interfaceClass = interfaceClass;
		return this;
	}
	
	public String getServiceClass() {
		return serviceClass;
	}
	
	public CrudFace setServiceClass(String serviceClass) {
		this.serviceClass = serviceClass;
		return this;
	}
	
	public String getRepositoryClass() {
		return repositoryClass;
	}
	
	public CrudFace setRepositoryClass(String repositoryClass) {
		this.repositoryClass = repositoryClass;
		return this;
	}

	public String getRestClient() {
		return restClient;
	}

	public CrudFace setRestClient(String restClient) {
		this.restClient = restClient;
		return this;
	}
}
