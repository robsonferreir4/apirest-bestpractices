package com.robsonferreir4.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.robsonferreir4.api.interfaces.Notificator;
import com.robsonferreir4.api.model.Client;

@Component
public class ClientActivationService {
	
	@Autowired
	private Notificator notificador;
	
//	public ClientActivationService(Notificator notificator) {
//		this.notificador = notificator; 
//		
//		System.out.println("AtivacaoClienteService: " + notificator);
//	}

	public void activate(Client client) {
		client.activate();

		notificador.notify(client, "Seu cadastro no sistema está ativo!");
	}
}
