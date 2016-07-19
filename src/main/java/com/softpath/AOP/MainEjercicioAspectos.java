package com.softpath.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.softpath.config.OperacionesConfig;
import com.softpath.modelo.A;
import com.softpath.service.OperationService;

public class MainEjercicioAspectos {
	 
	 public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(OperacionesConfig.class);
		OperationService operationService = context.getBean(OperationService.class);
		operationService.getA().operacionSumatoria();
		operationService.getB().operacionFactorial();
		operationService.getC().operacionDivision();
		
		 
	}
}
