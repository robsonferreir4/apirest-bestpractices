package com.robsonferreir4.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.robsonferreir4.api.interfaces.Notificator;
import com.robsonferreir4.api.model.Client;

@Component
public class ClientActivationService {
	
	@Autowired
	private List<Notificator> notificators;
	
//	public ClientActivationService(Notificator notificator) {
//		this.notificador = notificator; 
//		
//		System.out.println("AtivacaoClienteService: " + notificator);
//	}

	public void activate(Client client) {
		client.activate();

		for(Notificator n : notificators) {
			n.notify(client, "Seu cadastro no sistema está ativo!");
		}
		
	}
}
