package io.freeboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.freeboot.generators.CrudRepositoryTemplate;
import io.freeboot.generators.InterfaceTemplate;
import io.freeboot.generators.RestfulControllerTemplate;
import io.freeboot.generators.ServiceTemplate;
import io.freeboot.generators.models.ControllerModel;
import io.freeboot.generators.models.EntityModel;
import io.freeboot.generators.models.InterfaceModel;
import io.freeboot.generators.models.RepositoryModel;
import io.freeboot.generators.models.ServiceModel;
import io.freeboot.generators.output.CrudFace;

@Controller
public class FreebootController {

	private RestfulControllerTemplate controller = new RestfulControllerTemplate();
	private CrudRepositoryTemplate repository = new CrudRepositoryTemplate ();
	private InterfaceTemplate interfaceTemplate = new InterfaceTemplate();
	private ServiceTemplate service = new ServiceTemplate();
	
	@RequestMapping("/") 
	public String freeboot(Model model) {
		
		model.addAttribute("page", "generator");
		return "freeboot";
		
	}
	
	@RequestMapping(value="/generate", 
			method = RequestMethod.POST,
            headers = {"Content-type=application/json"})
	public @ResponseBody CrudFace controller(@RequestBody EntityModel model) {

		CrudFace generatedClasses = new CrudFace()
			.setControllerClass(generateController(model))
			.setInterfaceClass(generateInterface(model))
			.setServiceClass(generateService(model))
			.setRepositoryClass(generateRepository(model));
		
		return generatedClasses;
	}
	
	private String generateController(EntityModel model) {
		return controller.generate(new ControllerModel(model.getEntityName(), model.getPackageName()));
	}
	
	private String generateRepository(EntityModel model) {
		return repository.generate(new RepositoryModel(model.getEntityName(), model.getPackageName()));
	}

	private String generateInterface(EntityModel model) {
		return interfaceTemplate.generate(new InterfaceModel(model.getEntityName(), model.getPackageName()));
	}

	private String generateService(EntityModel model) {
		return service.generate(new ServiceModel(model.getEntityName(), model.getPackageName()));
	}
}
