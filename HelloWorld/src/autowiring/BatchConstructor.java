package autowiring;

public class BatchConstructor {
	private String batchName;
	private Student student;
	
	public BatchConstructor(Student student){
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
}
