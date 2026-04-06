package novemberprogram;
public class Testtt {
static int a=100;
int x=20;

void change() {
	a=a+x+10;//101+20+10=131   //131+20+10=161
	x=a+x+20;//131+20+20=171  //161+20+20=201
}

	public static void main(String[] args) {
		a=a+1;//100+1=101
		Testtt t1=new Testtt();
		Testtt t2=new Testtt();
		t1.change();
		t2.change();
		System.out.println(a +" "  + t1.x);
		System.out.println(a+" " +t2.x);

	}

}
