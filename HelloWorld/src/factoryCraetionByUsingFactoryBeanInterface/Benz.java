package factoryCraetionByUsingFactoryBeanInterface;

public class Benz implements Car{

	@Override
	public void drive() {
		System.out.println("This is Benz Car created from CarFactory which is created by using FactoryBean Interface.");
	}

}
