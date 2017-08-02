package setterInjection;

public class TestSetterInjection {
private String gender;
private String email;
public void setGender(String gender){
	this.gender = gender;
}
public void setEmail(String email){
	this.email = email;
}
public void hello(String name){
	System.out.println("Hello..."+gender+" "+name+" : email is : "+email);
}
}
