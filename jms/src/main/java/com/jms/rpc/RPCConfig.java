package com.jms.rpc;

import javax.jms.ConnectionFactory;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.listener.DefaultMessageListenerContainer;
import org.springframework.jms.listener.MessageListenerContainer;
import org.springframework.jms.remoting.JmsInvokerServiceExporter;

import com.jms.main.service.AlertService;

@Configuration
public class RPCConfig {
	@Bean
	public JmsInvokerServiceExporter alertServiceExporter(AlertService service) {
		JmsInvokerServiceExporter exporter = new JmsInvokerServiceExporter();
		exporter.setService(service);
		exporter.setServiceInterface(AlertService.class);
		return exporter;
	}

	@Bean
	public MessageListenerContainer messageListnerContainer(
			ConnectionFactory connectionFactory, AlertService alertService,
			ActiveMQQueue queue,JmsInvokerServiceExporter alertServiceExporter) {
		DefaultMessageListenerContainer listenerContainer = new DefaultMessageListenerContainer();
		listenerContainer.setConnectionFactory(connectionFactory);
		listenerContainer.setDestination(queue);
		listenerContainer.setMessageListener(alertServiceExporter);
		return listenerContainer;

	}
}
