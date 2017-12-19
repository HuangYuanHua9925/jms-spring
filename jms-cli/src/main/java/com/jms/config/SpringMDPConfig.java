package com.jms.config;

import javax.jms.ConnectionFactory;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.listener.DefaultMessageListenerContainer;
import org.springframework.jms.listener.MessageListenerContainer;

import com.jms.main.service.SpitterAlertHandler;

@Configuration
public class SpringMDPConfig {
	@Bean
	public MessageListenerContainer queueMessageListnerContainer(
			ConnectionFactory connectionFactory,
			SpitterAlertHandler spitterHandler, ActiveMQQueue queue) {
		DefaultMessageListenerContainer listenerContainer = new DefaultMessageListenerContainer();
		listenerContainer.setConnectionFactory(connectionFactory);
		listenerContainer.setDestination(queue);
		listenerContainer.setMessageListener(spitterHandler);
		return listenerContainer;

	}

	@Bean
	public MessageListenerContainer topicMessageListenerContainer(
			ConnectionFactory connectionFactory,
			SpitterAlertHandler spitterAlertHandler, ActiveMQTopic topic) {
		DefaultMessageListenerContainer container = new DefaultMessageListenerContainer();
		container.setMessageListener(spitterAlertHandler);
		container.setConnectionFactory(connectionFactory);
		container.setDestination(topic);
		return container;
	}

}
