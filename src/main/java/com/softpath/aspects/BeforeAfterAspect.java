package com.softpath.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAfterAspect {
	
	@Pointcut("execution(public * com.softpath.modelo.BeforeAfter.*(..))")
	public void AllMethodsInBeforeAfter()
	{
		
	}
	
	
	/*@Before("AllMethodsInBeforeAfter()")
	public void before(JoinPoint join){
		System.out.println("This method is executed BEFORE the call is completed");
		System.out.println("This is the method : " +join.getSignature().getName()+ " BEFORE");
	}*/
	
	/*@After("AllMethodsInBeforeAfter()")// este tipo de after se ejecuta se lanze o no se lanze una excepcion
	public void after(JoinPoint join){
		System.out.println("This method is executed AFTER the target method");
		System.out.println("This is the method : " +join.getSignature().getName()+ " AFTER");
	}*/
	
	/*@AfterReturning("AllMethodsInBeforeAfter()")//este tipo de after se ejecuta siempre que NO se lanzen excepciones
	public void afterReturning(JoinPoint join){
		System.out.println("This method is executed using AFTERRETURNING the target method");
		System.out.println("This is the method : " +join.getSignature().getName()+ " AFTER");
	}*/
	
	/*@AfterThrowing("AllMethodsInBeforeAfter()")//este tipo de after se ejecuta siempre que HAYA una excepcion
	public void afterReturning(JoinPoint join){
		System.out.println("This method is executed using AFTERRETURNING the target method");
		System.out.println("This is the method : " +join.getSignature().getName()+ " AFTER");
	}*/
	
	/*@Around("AllMethodsInBeforeAfter()")
	public void myAroundAdvice(ProceedingJoinPoint join)
	{
		System.out.println("Executing before advice");
		try {
			join.proceed();
		} catch (Throwable e) {
			System.out.println("Lanzo una excepcion " + e.getMessage());
		}
		System.out.println("Executing after advice");
	}*/
	
	//Usando nuestra notacion
	@Before("@annotation(com.softpath.aspects.JesusAnnotation)")
	public void myAnnotationConfiguration(JoinPoint join){
		System.out.println("Metodo : " + join.getSignature().getName() + " Estas usando la anotacion de Jesus");
	}
	
	
	
	//Tambien se puede atrapar el retorno de una funcion
	@AfterReturning(pointcut = "AllMethodsInBeforeAfter()", returning = "algo")
	public void gettingReturningValue(int algo){
		System.out.println(algo);
	}
	//Tambien se puede atrapar las excepciones
	@AfterThrowing(pointcut = "AllMethodsInBeforeAfter()", throwing = "e")
	public void gettingThrowingValue(RuntimeException e){
		System.out.println(e.getMessage());
	}
	
}
