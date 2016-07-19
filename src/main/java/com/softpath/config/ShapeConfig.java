package com.softpath.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.softpath.aspects.BeforeAfterAspect;
import com.softpath.aspects.LogginAspect;
import com.softpath.modelo.BeforeAfter;
import com.softpath.modelo.Circulo;
import com.softpath.modelo.Triangulo;
import com.softpath.service.ShapeService;

@Configuration
@EnableAspectJAutoProxy
public class ShapeConfig {
	
	
	@Bean
	public ShapeService shapeService(){
		return new ShapeService();
	}
	
	@Bean
	public Triangulo triangulo(){
		return new Triangulo("Isoceles");
	}
	
	@Bean
	public Circulo circulo(){
		Circulo circulo = new Circulo();
		circulo.setName("Circulo Grande usando setter");
		return circulo;
	}
	
	@Bean
	public LogginAspect logginAspect(){
		return new LogginAspect();
	}
	
	@Bean
	public BeforeAfter beforeAfter(){
		return new BeforeAfter();
	}
	
	@Bean
	public BeforeAfterAspect beforeAfterAspect(){
		return new BeforeAfterAspect();
	}
	
	
	
}
