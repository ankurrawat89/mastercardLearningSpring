package singeltonBeanCreation;

public class SingeltonTest {
private static SingeltonTest singeltonRef;
private SingeltonTest(){
	System.out.println("Creating Singelton");
}
public static SingeltonTest getInstance(){
	System.out.println("inside factory method of SingletonTest");
	if(singeltonRef==null){
		return  singeltonRef = new SingeltonTest();
	}
	return singeltonRef;
}
}
