package inheritances;
//its USE-A
public class Office {
	
	public void printing(Printer p) {
//		System.out.println(p);
		p.print();
	}

	public static void main(String[] args) {
		Office o=new Office();
		Printer p=new Printer();
//		o.printing(10);
		
//		o.printing(new Printer());
		o.printing(p);

	}

}
