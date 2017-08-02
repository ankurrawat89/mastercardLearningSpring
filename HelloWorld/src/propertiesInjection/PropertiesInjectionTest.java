package propertiesInjection;

import java.util.Map;
import java.util.Properties;

public class PropertiesInjectionTest {
private Properties driver;
public void setDriver(Properties driver){
	this.driver = driver;
}
public void displayProperties(){
	System.out.println("Propertise values are : ");
	for(Map.Entry<Object, Object> ref : driver.entrySet()){
		System.out.println(ref.getKey()+"=>"+ref.getValue()+" ");
	}
	System.out.println();
}
}
