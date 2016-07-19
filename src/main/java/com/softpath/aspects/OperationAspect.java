package com.softpath.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OperationAspect {
	
	//especificando el paquete
	@Pointcut("within(com.softpath.modelo.*)")
	public void OnlyModeloClass(){
	}
	
	@Pointcut("within(com.softpath.service.OperationService)")
	public void OnlyOperationServiceClass(){
		
	}
	
	//Especificando la operacion
	@Pointcut("execution(public * com.softpath.modelo.*.operacion*())")
	public void AllOperation() {
	}
	
	
	//Haciendo el advise
	@Before("AllOperation() && OnlyModeloClass()")
	public void beforeOperations(JoinPoint join){
		System.out.println("Haciendo la operacion : " + join.getSignature().getName());
	}
	
	@AfterReturning(pointcut="AllOperation() && OnlyModeloClass()" ,returning = "resultado")
	public void afterOperations(double resultado){
		System.out.println("El resultado es : " + resultado);
		
	}
	
	/*@Before("execution(public * com.softpath.modelo.*.operacion*())")
	public void voidMethodsArguments(){
		System.out.println("A method that takes a void has been called");
	}*/
	
}
