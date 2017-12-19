package com.jms.main.mvc;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTempTopic;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {
	@Autowired
	private JmsTemplate jmsTemplate;

	@Autowired
	private ActiveMQQueue queue;
	
	@Autowired
	private ActiveMQTopic topic;

	@RequestMapping("/")
	public String home() {
		jmsTemplate.setDefaultDestination(queue);
		jmsTemplate.send(new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				TextMessage textMessage = session.createTextMessage();
				textMessage.setText("hello world1");
				return textMessage;
			}
		});
		return "index";
	}
	@RequestMapping(value="/topic",produces={"application/json;charset=utf-8"})
	@ResponseBody
	public String topic(){
		jmsTemplate.setDefaultDestination(topic);
		jmsTemplate.send(new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				TextMessage textMessage = session.createTextMessage();
				textMessage.setText("hello world2");
				return textMessage;
			}
		});
		return "OK";
	}
}
