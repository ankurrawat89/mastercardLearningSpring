package factoryMethodBeanCreation.staticTest;

public class CarFactory{
private static String carName;

public static Car getCar() throws Exception {
	return (Car)Class.forName(carName).newInstance();
}

public static void setCarName(String carName) {
	CarFactory.carName = carName;
}

}
 