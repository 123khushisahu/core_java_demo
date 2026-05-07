package inheritances;

public class Dog extends Animal{
	int leg=2;
	int hands=20;
//	public void m1() {
//		System.out.println("HI I AM DOG");
//	}

	public static void main(String[] args) {
		Dog s=new Dog();
		System.out.println("S.LEG\t"+s.leg);
		System.out.println("S.hands\t"+s.hands);
		System.out.println("S.pHAND\t"+s.hand);
		System.out.println("S.pmouth\t"+s.mouth);
		s.m1();
		

	}

}
