package factoryMethodBeanCreation.nonStaticTest;

public class AmazeCar implements Car{

	@Override
	public void drive() {
		System.out.println("AmazeCar is great, drive at 160 km/hr");
		
	}

}
