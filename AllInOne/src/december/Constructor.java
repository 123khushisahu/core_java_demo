package december;

class Constructor
{
	private int x;
	private int y;

	Constructor(int x, int y) {
		System.out.println("param constructor");
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args) {
		System.out.println("main ");

		Constructor e1 = new Constructor(10, 20);

		Constructor e2 = new Constructor(30, 40);

		System.out.println(e1.x + " " + e1.y);
		System.out.println(e2.x + " " + e2.y);
	}
}
