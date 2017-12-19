package com.jms.main.mvc;

import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping
@Controller
public class ReceiveController {
	@Autowired
	private JmsTemplate jmsTemplate;

	@RequestMapping(value = "/receive", method = RequestMethod.POST,produces={"application/json;charset=utf-8"})
	@ResponseBody
	public String receive() throws JMSException {
		TextMessage receive = (TextMessage) jmsTemplate.receive();
		System.out.println(receive.getText());
		
		return receive.getText();
	}
}
