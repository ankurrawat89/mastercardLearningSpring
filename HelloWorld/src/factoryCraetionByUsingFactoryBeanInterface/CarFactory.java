package factoryCraetionByUsingFactoryBeanInterface;

import org.springframework.beans.factory.FactoryBean;

public class CarFactory implements FactoryBean<Object> {
    public String carName;
    public void setCarName(String carName){
    	this.carName = carName;
    }
	@Override
	public Object getObject() throws Exception {
		return (Car)Class.forName(carName).newInstance();
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return false; //if u want to return new object every time from this factory else return 'true' for singelton object.
	}

}
