package november;

//package p2;
import novemberprogram.F;
class H extends F {
	public static void main(String[] args) {
		System.out.println("c: "+ F.c);
		System.out.println("c: "+ H.c);

		F f1 = new F();
		System.out.println("c: "+ f1.c);

	}
}