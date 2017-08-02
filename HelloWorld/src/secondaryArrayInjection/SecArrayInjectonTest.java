package secondaryArrayInjection;

import secondaryDataInjection.Car;

public class SecArrayInjectonTest {
private Car[] carsInfo;
public void setCarsInfo(Car[] carsInfo){
	this.carsInfo = carsInfo;
}
public void displayInfo(){
	System.out.println("Car info : ");
	for(Car car : carsInfo){
		car.carDetails();
	}
}
}
