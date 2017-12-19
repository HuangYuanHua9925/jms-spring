package com.jms.rpc;

import javax.jms.ConnectionFactory;
import javax.jms.Queue;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.remoting.JmsInvokerProxyFactoryBean;

import com.jms.main.service.AlertService;

@Configuration
public class RPCConfig {
	@Bean
	public JmsInvokerProxyFactoryBean alertService(ConnectionFactory connectionFactory,Queue queue){
		JmsInvokerProxyFactoryBean proxy=new JmsInvokerProxyFactoryBean();
		proxy.setQueue(queue);
		proxy.setConnectionFactory(connectionFactory);
		proxy.setQueueName("spitter.queue");
		proxy.setServiceInterface(AlertService.class);
		return proxy;
	}
}
