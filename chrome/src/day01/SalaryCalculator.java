package day01;

public class SalaryCalculator {

	public static void main(String[] args) {
		float basicSalary=2500;
		double phone=12 ;
		float bonus=5000;
		float tax=2000;
		
		 String[] cars = {"Volvo", "BMW", "Ford"}; 
		float totalSalary=basicSalary + bonus - tax;
        System.out.println("Final Salary: " + totalSalary);
   SalaryCalculator  cl = new SalaryCalculator();
   System.out.println(cars);
   
	}

}
