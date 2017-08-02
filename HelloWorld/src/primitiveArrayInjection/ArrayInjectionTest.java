package primitiveArrayInjection;

public class ArrayInjectionTest {
private String[] names;
public void setNames(String[] names){
	this.names = names;
}
public void printNames(){
	System.out.println("Names are : ");
	int i=0;
	for(String name : names){
		System.out.println(++i+". "+name);
	}
}
}
