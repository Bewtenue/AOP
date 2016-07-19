package com.softpath.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.softpath.aspects.OperationAspect;
import com.softpath.modelo.A;
import com.softpath.modelo.B;
import com.softpath.modelo.C;
import com.softpath.service.OperationService;

@Configuration
@EnableAspectJAutoProxy
public class OperacionesConfig {
	
	@Bean
	public A a(){
		return new A();
	}
	
	@Bean
	public B b(){
		return new B();
	}
	
	@Bean C c(){
		return new C();
	}
	
	@Bean OperationService operationService(){
		return new OperationService();
	}
	
	@Bean OperationAspect operationAspect(){
		return new OperationAspect();
	}
	
	
}
