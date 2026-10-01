package p1;
//if i create object for parent class then by object reference i can access both class data.
//but if i create child class object then i access only child class data not parent class
public class MainClass {

	public static void main(String[] args) {
		//Child obj=new Child();
		
		Parent p1=new Parent();
		p1.show();
		p1.show();
		p1.show(10,20);
		p1.show(1,2,3);
	}

}
