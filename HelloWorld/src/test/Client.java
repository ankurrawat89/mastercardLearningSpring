package test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import bean.Test;


public class Client {
public static void main(String args[]){
	Resource resource = new ClassPathResource("resources/spring.xml");
	BeanFactory factory = new XmlBeanFactory(resource);
	Test ref1 = (Test)factory.getBean("t");
	Test ref2 = (Test)factory.getBean("t");
	Test ref3 = (Test)factory.getBean("t");
	ref1.hello();
	ref2.hello();
	ref3.hello();
	System.out.println(ref1==ref2);
	System.out.println(ref2==ref3);
	System.out.println(ref1==ref3);
}
}
