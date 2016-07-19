package com.softpath.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.softpath.modelo.A;
import com.softpath.modelo.B;
import com.softpath.modelo.C;

public class OperationService {
	
	@Autowired
	private A a;
	@Autowired
	private B b;
	@Autowired
	private C c;
	
	
	public A getA() {
		return a;
	}
	public void setA(A a) {
		this.a = a;
	}
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
	public C getC() {
		return c;
	}
	public void setC(C c) {
		this.c = c;
	}
	
	
	
	
}
