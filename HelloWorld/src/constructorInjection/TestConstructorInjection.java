package constructorInjection;

public class TestConstructorInjection {
	private String gender;
	private String email;
	private int age;
public TestConstructorInjection(String gender,String email){
	this.gender = gender;
	this.email = email;
}
public TestConstructorInjection(String gender,int age){
	this.gender = gender;
	this.age = age;
}
public TestConstructorInjection(String gender,int age,String email){
	this.gender = gender;
	this.age = age;
	this.email = email;
}
public void hello(String name){
	System.out.println("Hello..."+gender+" "+name+" : email is : "+email+" : Age is :"+age);
}
}
