package classTask;

public class Company {

	String comNumber;
	int total;
	double avg;
	String name;
	Department[] arDepartment;
	
	public Company() {;}
	
	public Company(String comNumber, int total, double avg, String name, Department[] arDepartment) {
		this.comNumber = comNumber;
		this.total = total;
		this.avg = avg;
		this.name = name;
		this.arDepartment = arDepartment;
	}
	public Company(Department[] arDepartment) {
		this.arDepartment=arDepartment;
		for (int i = 0; i < arDepartment.length; i++) {
			total+=arDepartment[i].money;
		}
		avg=(double)total/arDepartment.length;
	}
	
}
