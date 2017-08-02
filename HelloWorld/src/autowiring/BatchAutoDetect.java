package autowiring;

public class BatchAutoDetect {
	private String batchName;
	private Student student;
	
	//If default constructor is present then setter DI will be used in case of autodetect
	/*public BatchAutoDetect(){
		System.out.println("INside default non-paramatrized BatchAutoDetect COnstructor ");
	}*/
	//If no default constructor is present then constructor DI will be used in case of autodetect
	public BatchAutoDetect(Student student){
		System.out.println("INside paramatrized BatchAutoDetect COnstructor ");
		this.student = student;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public void displayBatchInfo(){
		System.out.println("BatchName is :"+batchName+" and Student name is :"+student.getStudentName());
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
}
