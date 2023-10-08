package com.itq.productService.business;

import org.springframework.stereotype.Component;

import com.itq.productService.dto.Ack;
import com.itq.productService.dto.Product;

@Component
public class ProductService {
	
	public Ack insertProduct(Product product) {
		Ack ack = new Ack();
		
		System.out.println("Nombre recibido: '" + product.getProductName() + "'");
		/*
		
		if (user.getName().equals("") || user.getLastname().equals("")) {
			ack.setDescription("ERROR: Ingrese un valor valido");
			ack.setCode(1);
			return ack;
		}
		
		if (user.getName() != "") {
			ack.setDescription("Usuario registrado correctamente!!");
		}
		*/
		ack.setCode(0);
		
		return ack;
	}

}
