package autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Bus {
private String busName;
@Autowired
@Qualifier("busEngine1")
private BusEngine busEngine;
public String getBusName() {
	return busName;
}
public void setBusName(String busName) {
	this.busName = busName;
}
public BusEngine getBusEngine() {
	return busEngine;
}
public void setBusEngine(BusEngine busEngine) {
	this.busEngine = busEngine;
}
public void displayInfo(){
	System.out.println("BUS Name is :"+busName+" and BUS ENGIN NAME IS : "+busEngine.getBusEngineName());
}
}
