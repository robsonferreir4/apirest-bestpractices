package com.robsonferreir4.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.robsonferreir4.api.notification.EmailNotificator;

@Configuration
public class ApiConfiguration {
	
	@Bean
	public EmailNotificator emailNotificator() {
		EmailNotificator notificator = new EmailNotificator("smtp.....br");
		notificator.setUpperCase(true);
		
		return notificator;
	}

}
