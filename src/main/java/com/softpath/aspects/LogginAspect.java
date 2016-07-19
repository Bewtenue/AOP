package com.softpath.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogginAspect {
	
	//con @Before le decimos que se ejecute antes del metodo mencionado en el execution 
	//@Before("execution(public String getName())")
	//@Before("execution(public String com.softpath.modelo.Circulo.getName())")
	/*@Before("execution(public * com.softpath.modelo.*.get*())")//usando wildcards
	public void HelloAspects(){
		System.out.println("Me estoy ejecutando en todos los getters");
	}*/
	
	/*
	@Before("(AllModelClasses() && AllGettersInModel()) || (AllServicesClasses() && AllGettersInServices())")
	public void beforeMethods(JoinPoint joinPoint){
		//System.out.println("Inside Pointcut advice");
		//System.out.println("Inside Pointcut advice : " + joinPoint.toString());
		//System.out.println("Inside Pointcut advice : " + joinPoint.getKind());
		//System.out.println("Inside Pointcut advice : " + joinPoint.getSignature());
		//System.out.println("Inside Pointcut advice : " + joinPoint.getSourceLocation());
		System.out.println("Inside Pointcut advice : " + joinPoint.toLongString());
		System.out.println("Inside Pointcut advice : " + joinPoint.toShortString());
	}*/
	/*
	@Pointcut("within(com.softpath.modelo.*)")
	public void AllModelClasses(){
	}
	
	@Pointcut("execution(com.softpath.modelo.* get*())")
	public void AllGettersInModel(){
	}
	
	@Pointcut("within(com.softpath.service.*)")
	public void AllServicesClasses(){
	}
	
	@Pointcut("execution(com.softpath.service.* get*())")
	public void AllGettersInServices(){
	}
	*/
	
	
	//No funciona con anotaciones
	/*@Before("args(..)")// @Before("args(..)")///es para cualquier n cantidad de argumentos
	public void stringMethodsArguments(JoinPoint join){
		System.out.println("A method that takes a String value has been called : " +join.toString() );
	}*/
	
	/*@Before("args(String)")
	public void stringMethodsArguments(){
		System.out.println("A method that takes a String value has been called");
	}*/
	
	/*@Before("args(name)")// @Before("args(..)")///es para cualquier n cantidad de argumentos
	public void stringMethodsArguments(String name){
		System.out.println("A method that takes a String value has been called : " + name );
	}*/
	
	
	/*@Before("args(algo)")
	public void stringArgumentsBefore(String algo){
		System.out.println("This method is executed Before the call is completed");
	}
	
	@After("args(algo)")
	public void stringArgumentsAfter(String algo){
		System.out.println("This method is executed after the target method");
	}
	
	@Before("AllPublicGetName()")
	public void stringVoidBefore(){
		System.out.println("This method is executed Before the call is completed");
	}
	
	@After("AllPublicGetName()")
	public void stringVoidAfter(){
		System.out.println("This method is executed after the target method");
	}
	
	@Pointcut("execution(public String getName())")
	public void AllPublicGetName(){
	}*/
	
	
	
	
}
