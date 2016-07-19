package com.softpath.modelo;

import com.softpath.aspects.JesusAnnotation;

public class BeforeAfter {
	public int suma()
	{
		return 12 + 213;
	}
	
	public int resta()
	{
		return 3-1;
	}
	
	@JesusAnnotation
	public void imprime()
	{
		System.out.println("Desde metodo imprime()");
		//throw (new RuntimeException());// el primer tipo de after se ejecuta se lanze o no se lanze una excepcion
	}
	
}
