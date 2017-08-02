package lookupMethodDependencyInjection;

public abstract class Car {
abstract public Engine myEngine();//lookup method-->Spring will provide the implementation for this method
}
