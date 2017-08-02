package beanLifeCycle.annotationApproach;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Test {
	@PostConstruct
	public void myInit(){
		System.out.println("Inside myInit() --> annotation based");
	}
	@PreDestroy
	public void myDestroy(){
		System.out.println("Inside myDestroy() --> annotation based");
	}
}
