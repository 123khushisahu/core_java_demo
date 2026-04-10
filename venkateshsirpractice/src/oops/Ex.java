package oops;

public class Ex {

	

		private int x;
		private int y;
		
		public Ex(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}		

		public void setY(int y) {
			this.y = y;
		}
		void display() {
			System.out.println(x+"   "+y);
		}
		public static void main(String[] args) {
Ex obj=new Ex(11,22);
obj.display();
//obj.x=11;
//obj.y=22;
	
		}
}


