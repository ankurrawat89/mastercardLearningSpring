package pNameSpace;

import secondaryDataInjection.Engine;

public class PNameSpaceTest {
private String carName;
private Engine engine;
public void setCarName(String carName) {
	this.carName = carName;
}
public void setEngine(Engine engine) {
	this.engine = engine;
}
public void displayInfo(){
	System.out.println("CAr Name is : "+carName+" and engine model year is :"+engine.getModelYear());
}

}
