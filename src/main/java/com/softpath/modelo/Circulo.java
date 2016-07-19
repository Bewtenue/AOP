package com.softpath.modelo;


public class Circulo {
	private String name;

	public String getName() {
		//System.out.println("Desde el getName");
		return name;
	}

	public void setName(String name) {
		//System.out.println("Desde el setName");
		this.name = name;
	}
	//ejemplificando el uso del wildcard para que sean todos los gets
	public void getValue(){
		System.out.println("Getting value from Circulo");
	}
	
	
}
