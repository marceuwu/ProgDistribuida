package com.itq.autoService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.itq.autoService.business.AutoService;
import com.itq.autoService.dto.Ack;
import com.itq.autoService.dto.Auto;

@Endpoint
public class AutosEndpoint {
	
	private static final String NAMESPACE_URI = "http://com.taller";
	@Autowired AutoService autoService;
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "auto")
	@ResponsePayload
	public Ack carRegistration(@RequestPayload Auto request) {
		Ack response = autoService.insertCar(request); 
		return response;
	}
}
