package collectionInjection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class DefaultCollectionInjection {
private List<String> fruits;
private Set<String> cricketers;
private Map<String,String> countryCapital;

public void setFruits(List fruits) {
	this.fruits = fruits;
}

public void setCricketers(Set cricketers) {
	this.cricketers = cricketers;
}

public void setCountryCapital(Map countryCapital) {
	this.countryCapital = countryCapital;
}

public void displayValues(){
	System.out.println("Collection contains following : ");
	System.out.print("Fruits : ");
	for(String fruit : fruits){
		System.out.print(fruit+"  ");
	}
	System.out.println();
	System.out.print("Cricketers : ");
	for(String cricketer : cricketers){
		System.out.print(cricketer+"  ");
	}
	System.out.println();
	System.out.print("Country Capital : ");
	for(Map.Entry<String,String> ref : countryCapital.entrySet()){
		System.out.print(ref.getKey()+":"+ref.getValue()+"  ");
	}
	System.out.println();
}
}
