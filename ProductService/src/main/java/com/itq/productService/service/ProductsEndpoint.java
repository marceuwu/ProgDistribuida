package com.itq.productService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.itq.productService.business.ProductService;
import com.itq.productService.dto.Ack;
import com.itq.productService.dto.Product;

@Endpoint
public class ProductsEndpoint {

		private static final String NAMESPACE_URI = "http://com.productSchema";
		@Autowired ProductService productService;
		
		@PayloadRoot(namespace = NAMESPACE_URI, localPart = "product")
		@ResponsePayload
		
		public Ack productCreation(@RequestPayload Product request) {
			
			Ack response = productService.createProduct(request); 
			return response;
			
		}

}
