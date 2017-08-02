package lookupMethodDependencyInjection;

public class Engine {
private String engineName;
public void setEngineName(String engineName) {
	this.engineName = engineName;
}
public void printname(){
	System.out.println("Engine Name is by lookup method dependeny injection :"+engineName);
}
}
