package encapsulations;

public class Human {
	

	public static void main(String[] args) {
		Demo obj=new Demo();
//		obj.age=11;
//		obj.name="navin";
//System.out.println(obj.age);
		System.out.println(obj.getName());
		obj.setName("khushi");
		System.out.println(obj.getName());
		//System.out.println(obj.age);
	}

}
class Demo{
	private int age=11;
	public int num=10;
	private String name="navin";
	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	 public void setName(String n){
		 name=n;
		System.out.println(n);
	}
}