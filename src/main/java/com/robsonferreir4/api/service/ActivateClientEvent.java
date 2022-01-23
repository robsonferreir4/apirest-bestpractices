package com.robsonferreir4.api.service;

import com.robsonferreir4.api.model.Client;

public class ActivateClientEvent {

	private Client client;

	public ActivateClientEvent(Client client) {
		super();
		this.client = client;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
}
