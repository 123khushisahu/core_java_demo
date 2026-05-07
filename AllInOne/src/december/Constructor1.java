package december;

class Constructor1
{
	private int x;
	private int y;

	Constructor1(int x, int y) {
		System.out.println("param constructor");
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args) {
		System.out.println("main ");

		Constructor1 e1 = new Constructor1(10, 20);

		Constructor1 e2 = new Constructor1(30, 40);

		System.out.println(e1.x + " " + e1.y);
		System.out.println(e2.x + " " + e2.y);
	}
}
