package methodReplacer;

public class EmployeeInfo {
private String name;
private int age;
private int weight;
public void setAge(int age) {
	this.age = age;
}
public void setName(String name) {
	this.name = name;
}
public void setWeight(int weight) {
	this.weight = weight;
}

public void printInfo(){
	System.out.println("Name is : "+name+", Age is : "+age+" and weight is : "+weight);
}
}
