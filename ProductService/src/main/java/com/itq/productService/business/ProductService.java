package com.itq.productService.business;

import java.math.BigDecimal;
import java.util.Arrays;

import org.springframework.stereotype.Component;
import com.itq.productService.dto.Product.Characteristics;

import com.itq.productService.dto.Ack;
import com.itq.productService.dto.Product;

@Component
public class ProductService {
	String msg;
	public boolean isValid(Product product) {

	    // Validación de productProductName 
	    if (product.getProductName().isEmpty()) {
	        msg = "ERROR: El nombre del producto no puede estar vacío";
	        return false;
	    }

	    // Validación de productPrice 
	    if (product.getProductPrice().compareTo(BigDecimal.ZERO) < 0) {
	        msg = "ERROR: El precio del producto no puede ser negativo";
	        return false;
	    }

	    // Validación de productQuantity 
	    if (product.getProductQuantity() < 0) {
	        msg = "ERROR: La cantidad del producto no puede ser negativa";
	        return false;
	    }

	    // Validación de category 
	    String[] validCategories = {
	        "Hogar", "Electronica", "Ropa", "Juguetes", "Deportes",
	        "Libros", "Electrodomesticos", "Musica", "Calzado", "Mascotas",
	        "Jardineria", "Salud", "Belleza", "Herramientas", "Vehiculos", "Otros"
	    };
	    if (!Arrays.asList(validCategories).contains(product.getCategory())) {
	        msg = "ERROR: La categoría del producto no es válida";
	        return false;
	    }
	    // Validación de characteristics (nombre y valor)
	    Characteristics characteristics = product.getCharacteristics();
	    if (characteristics == null) {
	        msg = "ERROR: La sección de características no puede estar vacía";
	        return false;
	    }
	    if (characteristics.getName().isEmpty()) {
	        msg = "ERROR: El nombre de la característica no puede estar vacío";
	        return false;
	    }
	    if (characteristics.getValue().isEmpty()) {
	        msg = "ERROR: El valor de la característica no puede estar vacío";
	        return false;
	    }
		return true;
	}

	public Ack createProduct(Product product) {
		Ack ack = new Ack();

		System.out.println("Creating product...");
	
		if (isValid(product)) {
			ack.setDescription("Producto creado correctamente");
			ack.setCode(1);
		} else {
			ack.setDescription(msg);
			ack.setCode(0);
		}
		return ack;

	}

}
