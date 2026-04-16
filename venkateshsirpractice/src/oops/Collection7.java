package oops;

import java.util.ArrayList;
import java.util.Comparator;

public class Collection7 {
	int empNo;
	String name;
	float salary;
	void Emp(int empNo,String name,float salary){
	this.empNo=empNo;	
	this.name=name;	
	this.salary=salary;	
	}
	public String toString() {
		return empNo+" "+name+" "+salary;
	}
}
class EmpNoComparator implements Comparator<Emp>{
	public int compara(Emp e1,Emp e2){
		if(e1.empNo>e2.empNo)
			return -1;
		else 
			return 0;
	}

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
class NameComparator implements Comparator<Emp>
	{
	public int compare(Emp e1,Emp e2) {
		if(e1.salar>e2.salary)
			return 1;
		else if(e1.salary<e2.salary)
			return -1;
		else
			return 0;
		
	}
		
}
class Demo{
	public static void main(String[] args) {
		Emp e1=new Emp(101,"bbb",56000.00f);
		Emp e1=new Emp(103,"aaa",65000.00f);
		Emp e1=new Emp(102,"ccc",55000.00f);
		ArrayList<Emp> a1=new ArrayList<>();
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		System.out.println(a1);
		Collection.sort(a1,new EmpNoComparator());
		System.out.println(a1);
		Collection.sort(a1,new NameComparator());
		System.out.println(a1);
		Collection.sort(a1,new salaryComparator());
		System.out.println(a1);


	}

}
