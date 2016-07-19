package com.softpath.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.softpath.modelo.Circulo;
import com.softpath.modelo.Triangulo;

public class ShapeService{
	
	@Autowired
	private Circulo circulo;
	@Autowired
	private Triangulo triangulo;
	
	public Circulo getCirculo() {
		return circulo;
	}
	public void setCirculo(Circulo circulo) {
		this.circulo = circulo;
	}
	public Triangulo getTriangulo() {
		return triangulo;
	}
	public void setTriangulo(Triangulo triangulo) {
		this.triangulo = triangulo;
	}
	
	
	
}
