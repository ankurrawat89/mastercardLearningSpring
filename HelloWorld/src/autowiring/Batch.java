package autowiring;

public class Batch {
private String batchName;
private Student student;
public String getBatchName() {
	return batchName;
}
public void setBatchName(String batchName) {
	this.batchName = batchName;
}
public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}

public void displayBatchInfo(){
	System.out.println("BatchName is :"+batchName+" and Student name is :"+student.getStudentName());
}
}
