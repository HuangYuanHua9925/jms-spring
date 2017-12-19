package com.jms.main.service.impl;

import org.springframework.stereotype.Component;

import com.jms.main.service.AlertService;

@Component("alertService")
public class AlertServiceImpl implements AlertService {

	@Override
	public String show() {
		return "123456789";
	}

}
