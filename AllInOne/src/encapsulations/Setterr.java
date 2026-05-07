package encapsulations;

public class Setterr {
public static void main(String[]args) {
	Test01 e1=new Test01();
	Test01 e2=new Test01();
	e1.setx();
	e1.displayset();
	
	e2.gety();
	e2.displayget();
	
//	System.out.println("e1.setx"+e1.setx);
//	System.out.println("e1.sety"+e1.sety);
//	System.out.println("e2.setx"+e2.setx);
//	System.out.println("e2.sety"+e2.sety);
//		
	}
	
}	
class Test01{
	int x;
	int y;
	void setx(){
		 x=10;
		 y=20;		
	}
	void gety() {
		 x=30;
		 y=40;
	}
  void displayset(){
	System.out.println(x);
	System.out.println(y);
}
 void displayget(){
		System.out.println(x);
		System.out.println(y);
	}
	

}



	
	

