package com.robsonferreir4.api.listener;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.robsonferreir4.api.interfaces.Notificator;
import com.robsonferreir4.api.service.ActivateClientEvent;

@Component
public class ActivateClientListener {
	
	@Autowired
	private List<Notificator> notificators;

	@EventListener
	public void clientActivationListener(ActivateClientEvent event) {
		for(Notificator n : notificators) {
			n.notify(event.getClient(), "Seu cadastro no sistema está ativo");
		}
	}
}
