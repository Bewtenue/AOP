package com.softpath.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.softpath.config.ShapeConfig;
import com.softpath.modelo.BeforeAfter;

public class MainBeforeAfter {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ShapeConfig.class);
		BeforeAfter bf = context.getBean("beforeAfter",BeforeAfter.class);
		//bf.imprime();
		bf.suma();
	}
}
