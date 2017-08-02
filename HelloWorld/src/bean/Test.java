package bean;

import java.io.Serializable;


public class Test{
	private int a;
	private String b;
	public Test(){
		System.out.println("constructor Test");
	}
public void hello(){
	System.out.println("Hello World ! , "+"a is :"+a+" and b is : "+b);
}
public int getA() {
	return a;
}
public void setA(int a) {
	this.a = a;
}
public String getB() {
	return b;
}
public void setB(String b) {
	this.b = b;
}

}
