package stereotypeAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person{
private String personName;
@Autowired
private Address personAddress;
public Person(){
	this.personName = "Ankur";
	System.out.println("Creating person Object using @COMPONENT ANNOTATION");
}
public String getPersonName() {
	return personName;
}
public void setPersonName(String personName) {
	this.personName = personName;
}
public Address getPersonAddress() {
	return personAddress;
}
public void setPersonAddress(Address personAddress) {
	this.personAddress = personAddress;
}
public void displayInfo(){
	System.out.println("Person Name is :"+personName+" and Address is :"+personAddress.getAddress());
}

}
