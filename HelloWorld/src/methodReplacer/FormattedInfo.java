package methodReplacer;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class FormattedInfo implements MethodReplacer {

	@Override
	public Object reimplement(Object arg0, Method arg1, Object[] arg2)
			throws Throwable {
		System.out.println("Inside new implementation for printInfo() method.");
		System.out.println(arg1.getName());
		System.out.println(arg0.getClass());
		//arg1.invoke(null, null);
		return null;
	}

}
