package method;

public class Ex3 {

	public static void main(String[] args) {
		Company c1 = new Company(101,"Khushi");
		c1.displayEmployee();
		
		Company c2 = new Company(102,"Raghini");
		c1.displayEmployee();
		
		
	
	}
}

class Company{
	
	static String CompanyName="Wipro";
	int EmployeeId;
	String EmployeeName;
	
	public Company(int EmployeeId, String EmployeeName) {
		this.EmployeeId=EmployeeId;
		this.EmployeeName=EmployeeName;
		
	}
	
	void displayEmployee() {
		System.out.println("Employee company:"+CompanyName);
		System.out.println("Employee Id:"+EmployeeId);
		System.out.println("Employee name:"+EmployeeName);
		
	}
}