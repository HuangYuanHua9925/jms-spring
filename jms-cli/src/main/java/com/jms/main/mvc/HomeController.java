package com.jms.main.mvc;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jms.main.service.AlertService;
import com.jms.main.service.SpitterAlertHandler;

@Controller
public class HomeController {
	@Autowired
	private JmsTemplate jmsTemplate;

	@Autowired
	private ActiveMQQueue queue;

	@Autowired
	SpitterAlertHandler spitterAlertHandler;

	@Autowired
	private AlertService alertService;

	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping(value="/show",produces={"application/json;charset=utf-8"})
	@ResponseBody
	public String show() {
		System.out.println(alertService.show());
		return alertService.show();
	}
}
