package com.robsonferreir4.api.notification;

import org.springframework.stereotype.Component;

import com.robsonferreir4.api.interfaces.Notificator;
import com.robsonferreir4.api.model.Client;

@Component
public class EmailNotificator implements Notificator {
	
	
	
	public EmailNotificator() {
		System.out.println("construtor notificador email chamado");
	}
	
	@Override
	public void notify(Client cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
}
