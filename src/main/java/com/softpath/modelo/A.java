package com.softpath.modelo;

public class A {
	public double operacionSumatoria(){
		double num = 5;
		double sumatoria = 0;
		System.out.println("Haciendo la sumatoria del : " + num);
		for(double i = 0; i <=num; i++){
			sumatoria = sumatoria + i;
		}
		return sumatoria;
	}
}
