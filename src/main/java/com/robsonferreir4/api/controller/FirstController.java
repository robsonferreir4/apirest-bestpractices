package com.robsonferreir4.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.robsonferreir4.api.model.Client;
import com.robsonferreir4.api.service.ClientActivationService;

@Controller
public class FirstController {
	
	private ClientActivationService ativacaoClienteService;
	
	public FirstController(ClientActivationService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
		
		System.out.println("FirstController constructor: " + ativacaoClienteService);
	}



	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		
		Client john = new Client("John", "john@email.com", "123214421");
		
		ativacaoClienteService.activate(john);

		return "First Controller!!!!!!!!!!!";
	}

}
