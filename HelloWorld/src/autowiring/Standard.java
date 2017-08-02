package autowiring;

public class Standard {
private String standardName;
private Section section;
public String getStandardName() {
	return standardName;
}
public void setStandardName(String standardName) {
	this.standardName = standardName;
}
public Section getSection() {
	return section;
}
public void setSection(Section section) {
	this.section = section;
}

public void displayStandardInfo(){
	System.out.println("Standard Name is : "+standardName+" and Section name is : "+section.getSectionName());
}
}
