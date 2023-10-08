package com.itq.userService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.itq.userService.business.UserService;
import com.itq.userService.dto.AckUserInfo;
import com.itq.userService.dto.AckValidation;
import com.itq.userService.dto.IdUsuario;
import com.itq.userService.dto.User;


@Endpoint
public class UsersEndpoint {
	
	private static final String NAMESPACE_URI = "http://com.userSchema";
	@Autowired UserService userService;
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "user")
	@ResponsePayload
	
	public AckValidation userRegistration(@RequestPayload User request) {
		
		AckValidation response = userService.insertUser(request); 
		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "idUsuario")
	@ResponsePayload
	
	public AckUserInfo userConsult(@RequestPayload IdUsuario request) {
		
		AckUserInfo response = userService.consultUser(request); 
		return response;
	}
}