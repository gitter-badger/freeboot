$(document).ready(function() {
	$('a#generate-button').click(function() {

		var entityName = $('#entityName').val();
		var packageName = $('#packageName').val();
		var json = { "entityName" : entityName,
				"packageName" : packageName};
		
		$.ajax({
			url: "generate",
			data: JSON.stringify(json),
			type: "POST",

			beforeSend: function(xhr) {
				xhr.setRequestHeader("Accept", "application/json");
				xhr.setRequestHeader("Content-Type", "application/json");
			},
			success: function(crud) {
				$("#controller-code").html(crud.controllerClass);         
				$("#interface-code").html(crud.interfaceClass);         
				$("#service-code").html(crud.serviceClass);         
				$("#repository-code").html(crud.repositoryClass);         
				$("#rest-client-code").html(crud.restClient);         
			}
		});

	});
});
