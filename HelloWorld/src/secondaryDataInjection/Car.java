package secondaryDataInjection;

public class Car {
private String name;
private Engine engine;

public void setName(String name){
	this.name = name;
}

public void setEngine(Engine engine){
	this.engine = engine;
}
public void carDetails(){
	System.out.println("Car Name is : "+name+" and Engine Model Year is : "+engine.getModelYear());
}
}
