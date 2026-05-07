package inheritances;

public class Lion {
	int leg=2;
	int hand=2;
	Animal a=new Animal();
	public void m3() {
		System.out.println("HII I AM LION");
	}

	public static void main(String[] args) {
		Lion s=new Lion();
		System.out.println("S.lionLEG"+s.leg);
		System.out.println("S.lionhand"+s.hand);
		System.out.println("S.lionhand"+s.a.hand);
		
	}

}
