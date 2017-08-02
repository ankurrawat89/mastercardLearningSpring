package beanLifeCycle.programmaticApproach;

import javax.xml.ws.Dispatch;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Test implements InitializingBean,DisposableBean{
	private String testerName;
	public void setTesterName(String testerName) {
		System.out.println("inside setTesterName");
		this.testerName = testerName;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy()--> called on call of close() method from ConfigurableApplicationContext class");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside afterPropertySet()--> called while loading--> by ConfigurableApplicationContext container");
	}

}
