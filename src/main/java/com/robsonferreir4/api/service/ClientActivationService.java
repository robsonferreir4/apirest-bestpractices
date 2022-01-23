package com.robsonferreir4.api.service;

import org.springframework.stereotype.Component;

import com.robsonferreir4.api.interfaces.Notificator;
import com.robsonferreir4.api.model.Client;

@Component
public class ClientActivationService {
	
	private Notificator notificador;
	

	public ClientActivationService(Notificator notificador) {
		this.notificador = notificador; 
		
		System.out.println("AtivacaoClienteService: " + notificador);
	}

	public void activate(Client client) {
		client.activate();

		notificador.notify(client, "Seu cadastro no sistema está ativo!");
	}
}
