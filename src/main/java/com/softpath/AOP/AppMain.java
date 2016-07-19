package com.softpath.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softpath.config.ShapeConfig;
import com.softpath.modelo.Circulo;
import com.softpath.modelo.Triangulo;
import com.softpath.service.ShapeService;

public class AppMain{
	public static void main(String[] args) {
		//usando XML
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService = context.getBean("shapeServices",ShapeService.class);
		System.out.println(shapeService.getCirculo().getName());
		
		//usando anotaciones en la clase ShapeConfig
		ApplicationContext context2 = new AnnotationConfigApplicationContext(ShapeConfig.class);
		Triangulo triangulo = context2.getBean(Triangulo.class);
		Circulo circulo = context2.getBean(Circulo.class);
		ShapeService shape = context2.getBean(ShapeService.class);
		//System.out.println(triangulo.getName());
		//System.out.println(circulo.getName());
		//System.out.println(shape.getCirculo().getName());
		//shape.getCirculo().getValue();
		/////otro ejemplo para todos los que reciben String como parametro
		//shape.getCirculo().setName("Seteaendo el circulo grande");
		//System.out.println(shape.getCirculo().getName());
		shapeService.getCirculo().setName("Circulo normal");
	}
}
