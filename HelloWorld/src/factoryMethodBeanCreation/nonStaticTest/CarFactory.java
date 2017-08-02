package factoryMethodBeanCreation.nonStaticTest;

public class CarFactory{
private String carName;

public Car getCar() throws Exception {
	return (Car)Class.forName(carName).newInstance();
}

public void setCarName(String carName) {
	this.carName = carName;
}

}
