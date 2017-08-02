package propertyFileDataDependencyInjection;

public class StudentInfo {
private String name;
private int age;
private int rollNo;

public void setName(String name) {
	this.name = name;
}
public void setAge(int age) {
	this.age = age;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

public void printInfo(){
	System.out.println("Name:"+name+", Age:"+age+" and Roll Number:"+rollNo);
}
}
