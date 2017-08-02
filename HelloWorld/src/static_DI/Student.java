package static_DI;

public class Student {
private static String studentName;
private int age;

public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public static void setStudentName(String studentName){
	Student.studentName = studentName;
}

public static String getStudentName() {
	return studentName;
}
public  void displayInfo(){
	System.out.println("Hello, "+studentName+", and age is : "+age);
}
}
