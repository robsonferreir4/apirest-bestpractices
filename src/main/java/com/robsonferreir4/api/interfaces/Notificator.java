package com.robsonferreir4.api.interfaces;

import com.robsonferreir4.api.model.Client;

public interface Notificator {

	void notify(Client cliente, String mensagem);

}