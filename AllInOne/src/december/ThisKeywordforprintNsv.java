package december;
public class ThisKeywordforprintNsv {
	int x=100;           //here also i can print  like to m nmethod method 
	void m() {
		int x=50;
		System.out.println(x);
		System.out.println(this.x);   //here x=100,x=50 vari name is same thats why here use  this key if i change x channge y then no need this keyword //these for inside class  assign value k Liye
	}

	public static void main(String[] args) {
		ThisKeywordforprintNsv n=new ThisKeywordforprintNsv();
		n.m();
		//System.out.println(n.y);

	}

}
