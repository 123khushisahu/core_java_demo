package codeChallengePractice;

public class Constructor {
	Constructor(){
		System.out.println("hii!!");
		this(10);
	}
	
	Constructor(int x){
		System.out.println("hello!!");
		this(10,20);
	}
	
	Constructor(int x,int y){
		System.out.println("bye!!");
	}
	
public static void main(String[] args) {
	Constructor obj=new Constructor();
	
	
	
	
}

}
