package com.robsonferreir4.api.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.robsonferreir4.api.interfaces.Notificator;
import com.robsonferreir4.api.model.Client;

@Profile("dev")
@Component
public class EmailNotificator implements Notificator {
	
//	private boolean upperCase;
//	private String serverHostSmtp;
	
//	@Value("${notificator.email.host}")
//	private String host;
//
//	@Value("${notificator.email.port}")
//	private String port;
	
	@Autowired
	private NotificatorProperties notificatorProperties;
	
	public EmailNotificator(/* String serverHostSmtp */) {
//		this.serverHostSmtp = serverHostSmtp;

	}
	
	@Override
	public void notify(Client cliente, String mensagem) {
//		if(this.upperCase) {
//			mensagem = mensagem.toUpperCase();
//		}
		
		System.out.println("construtor notificador email chamado");
		System.out.println("Host / port - "+ notificatorProperties.getHost() +" / " + notificatorProperties.getPort());
		
		System.out.printf("Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail()/* , this.serverHostSmtp */, mensagem);
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
