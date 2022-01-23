package com.robsonferreir4.api.notification;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.robsonferreir4.api.interfaces.Notificator;
import com.robsonferreir4.api.model.Client;

@Profile("dev")
@Component
public class SmsNotificator implements Notificator {
	
//	private boolean upperCase;
//	private String serverHostSmtp;
	
	public SmsNotificator(/* String serverHostSmtp */) {
//		this.serverHostSmtp = serverHostSmtp;
		System.out.println("construtor notificador email chamado");
	}
	
	@Override
	public void notify(Client cliente, String mensagem) {
//		if(this.upperCase) {
//			mensagem = mensagem.toUpperCase();
//		}
		
		System.out.printf("Notificando %s através de SMS %s para telefone: %s\n", 
				cliente.getNome(), cliente.getTelefone()/* , this.serverHostSmtp */, mensagem);
	}

//	public void setUpperCase(boolean upperCase) {
//		this.upperCase = upperCase;
//	}
//
//	public String getServerHostSmtp() {
//		return serverHostSmtp;
//	}
//
//	public void setServerHostSmtp(String serverHostSmtp) {
//		this.serverHostSmtp = serverHostSmtp;
//	}
	
	
	
}
