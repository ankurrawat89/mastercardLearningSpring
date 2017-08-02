package test;

import methodReplacer.EmployeeInfo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import collectionInjection.DefaultCollectionInjection;
import pNameSpace.PNameSpaceTest;
import primitiveArrayInjection.ArrayInjectionTest;
import propertiesInjection.PropertiesInjectionInPrimitives;
import propertiesInjection.PropertiesInjectionTest;
import propertyFileDataDependencyInjection.StudentInfo;
import constructorInjection.TestConstructorInjection;
import dependencyChecking.RequiredAnnotationDependencyCheck;
import secondaryArrayInjection.SecArrayInjectonTest;
import secondaryDataInjection.Car;
import setterInjection.TestSetterInjection;
import singeltonBeanCreation.SingeltonTest;
import static_DI.Student;
import stereotypeAnnotation.Person;
import autowiring.Batch;
import autowiring.BatchAutoDetect;
import autowiring.BatchConstructor;
import autowiring.Bus;
import autowiring.Standard;
import bean.Test;

public class ClientAppCtx {
	public static void main(String args[]){
	ApplicationContext factory = new ClassPathXmlApplicationContext(new String[]{"resources/spring.xml","resources/springSchemaBased.xml"});
	Test ref1 = (Test)factory.getBean("t");
	Test ref2 = (Test)factory.getBean("t");
	Test ref3 = (Test)factory.getBean("t");
	ref1.hello();
	ref2.hello();
	ref3.hello();
	System.out.println(ref1==ref2);
	System.out.println(ref2==ref3);
	System.out.println(ref1==ref3);
	
	TestSetterInjection ref = (TestSetterInjection)factory.getBean("si");
	ref.hello("Ankur");
	
	TestConstructorInjection refCon = (TestConstructorInjection)factory.getBean("ci");
	refCon.hello("Ankur");
	
	TestConstructorInjection refCon1 = (TestConstructorInjection)factory.getBean("ci1");
	refCon1.hello("Ankur");

	TestConstructorInjection refCon2 = (TestConstructorInjection)factory.getBean("ci2");
	refCon2.hello("Ankur");
	
	TestConstructorInjection refCon3 = (TestConstructorInjection)factory.getBean("ci3");
	refCon3.hello("Ankur");
	
	TestConstructorInjection refCon4 = (TestConstructorInjection)factory.getBean("ci4");
	refCon4.hello("Ankur");
	
	Car car = (Car)factory.getBean("car");
	car.carDetails();
	
	ArrayInjectionTest ait = (ArrayInjectionTest)factory.getBean("pai");
	ait.printNames();
	
	SecArrayInjectonTest sit = (SecArrayInjectonTest)factory.getBean("sai");
	sit.displayInfo();
	
	DefaultCollectionInjection dci =(DefaultCollectionInjection)factory.getBean("dci");
	dci.displayValues();
	
	DefaultCollectionInjection sci =(DefaultCollectionInjection)factory.getBean("sci");
	sci.displayValues();
	
	PropertiesInjectionTest pit = (PropertiesInjectionTest)factory.getBean("pi");
	pit.displayProperties();
	
	PropertiesInjectionTest spit = (PropertiesInjectionTest)factory.getBean("spi");
	spit.displayProperties();
	
	Car carDependencyCheck = (Car)factory.getBean("dc");
	carDependencyCheck.carDetails();
	
	RequiredAnnotationDependencyCheck requiredAnnotationDependencyCheck = (RequiredAnnotationDependencyCheck)factory.getBean("radc");
	requiredAnnotationDependencyCheck.displayInfo();
	
	PNameSpaceTest pNameSpaceTest = (PNameSpaceTest)factory.getBean("pCar");
	pNameSpaceTest.displayInfo();
	
	Batch batch = (Batch)factory.getBean("batch");
	batch.displayBatchInfo();
	
	Standard standard = (Standard)factory.getBean("standard");
	standard.displayStandardInfo();
	
	BatchConstructor batchCOnstructor = (BatchConstructor)factory.getBean("batchConstructor");
	batchCOnstructor.displayBatchInfo();
	
	BatchAutoDetect batchAutoDetect = (BatchAutoDetect)factory.getBean("batchAutoDetect");
	batchAutoDetect.displayBatchInfo();
	
	Bus bus = (Bus)factory.getBean("bus");
	bus.displayInfo();
	
	//As here object is created by spring(#case of stereotype annotation) so id by default is taken as packageName.Classname if it doesn't work use classname.class as id
	Person person = (Person)factory.getBean(Person.class);
	person.displayInfo();
	
	Student student = (Student)factory.getBean("staticStudent");
	student.displayInfo();
	
	SingeltonTest singeltonRef = (SingeltonTest)factory.getBean("singeltonRef");
	SingeltonTest singeltonRef1 = (SingeltonTest)factory.getBean("singeltonRef");
	System.out.print("Two ref of singelton are same:");
	System.out.println(singeltonRef==singeltonRef1);
	
	factoryMethodBeanCreation.staticTest.Car carObj = (factoryMethodBeanCreation.staticTest.Car)factory.getBean("carFactory");
	carObj.drive();
	
	factoryMethodBeanCreation.nonStaticTest.Car carRef = (factoryMethodBeanCreation.nonStaticTest.Car)factory.getBean("c");
	carRef.drive();
	
	 factoryCraetionByUsingFactoryBeanInterface.Car carUsingFactoryBean = ( factoryCraetionByUsingFactoryBeanInterface.Car)factory.getBean("carFac");
	 carUsingFactoryBean.drive();
	 
	 //you need to load ConfigurableApplicationContext for this
	 ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("resources/springBeanLifeCycle.xml");
	 beanLifeCycle.programmaticApproach.Test pblcTest = (beanLifeCycle.programmaticApproach.Test)ctx.getBean("pblc");//programmatic approach
	 
	 beanLifeCycle.declarativeApproach.Test dblcTest = (beanLifeCycle.declarativeApproach.Test)ctx.getBean("dblc");//declarative approach
	 
	 beanLifeCycle.annotationApproach.Test ablcTest = (beanLifeCycle.annotationApproach.Test)ctx.getBean("ablc");//annotation approach
	 ctx.close();//to call destroy method of bean life cycle
	 
	 //lookup method dependency injection
	 lookupMethodDependencyInjection.Car lookupCar = (lookupMethodDependencyInjection.Car)factory.getBean("abstractCar");
	 lookupCar.myEngine().printname();
	 
	 //method replacer example
	 EmployeeInfo empInfo = (EmployeeInfo)factory.getBean("empInfo"); //here getBean will always return proxy class
	 empInfo.printInfo();
	 
	 //propertyfile data injection in class
	 StudentInfo stuInfo = (StudentInfo)factory.getBean("studentInfo");
	 stuInfo.printInfo();
	 
	}
}
