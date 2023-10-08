package com.itq.autoService.business;

import org.springframework.stereotype.Component;

import com.itq.autoService.dto.Ack;
import com.itq.autoService.dto.Auto;

@Component
public class AutoService {
	
	public Ack insertCar(Auto auto) {
		Ack ack = new Ack();
		System.out.println("Color recibido: '" + auto.getColor() + "'");
		
		if (auto.getColor().equals("rojo")) {
			ack.setDescription("Bonito color");
		} else if (auto.getColor().equals("")) {
			ack.setDescription("¿Invisible?");
		} else {
			ack.setDescription("Bueno, por lo menos tiene color.");
		}
		
		ack.setCode(0);
		
		return ack;
	}
}
