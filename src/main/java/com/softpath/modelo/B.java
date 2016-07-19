package com.softpath.modelo;

public class B {
	public double operacionFactorial(){
		double num = 4;
		double factorial = 1;
		System.out.println("Haciendo el factorial del : " + num);
		for(double i = 1; i <=num; i++){
			factorial = factorial * i;
		}
		return factorial;
	}
}
