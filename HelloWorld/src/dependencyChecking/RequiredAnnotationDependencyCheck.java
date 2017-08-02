package dependencyChecking;

import org.springframework.beans.factory.annotation.Required;

public class RequiredAnnotationDependencyCheck {
private String driver;
private String url;
private String username;
private String password;
public String getDriver() {
	return driver;
}
@Required
public void setDriver(String driver) {
	this.driver = driver;
}
public String getUrl() {
	return url;
}
@Required
public void setUrl(String url) {
	this.url = url;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public void displayInfo(){
	System.out.println("URL is : "+url+", DRIVER is : "+driver+", USERNAME is : "+username+" and PASSWORD is : "+password);
}
}
