package java8Features;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {

		ArrayList<Employee> emplist = new ArrayList<>();

		emplist.add(new Employee(101, "john", "hyd", 8000.0, "john@gmail.com", 21));
		emplist.add(new Employee(102, "jay", "hyd", 98767.0, "jay@gmail.com", 25));
		emplist.add(new Employee(103, "lokesh", "hyd", 3333.0, "lokesh@gmail.com", 26));
		emplist.add(new Employee(104, "khusi", "hyd", 2222.0, "khusi@gmail.com", 28));
		emplist.add(new Employee(105, "anjali", "hyd", 8888.0, "manish@gmail.com", 29));

		
		// emplist.forEach(System.out::println);

		emplist.stream().map(name -> name.getName().toUpperCase()).forEach(System.out::println);

	}
}
