package java8Features;

public class Employee {

	private int id;
	private String name;
	private String location;
	private double salary;
	private String email;
	private int age;

	public Employee(int id, String name, String location, double salary, String email, int age) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.salary = salary;
		this.email = email;
		this.age = age;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", location=" + location + ", salary=" + salary + ", email="
				+ email + ", age=" + age + "]";
	}

}
