package encapsulations;

public class SettterGetter2 {

	public static void main(String[] args) {
		SetterGetter s1=new SetterGetter();
		s1.display();
		s1.setsal(1000000);
		s1.setsno(11);
		s1.setsname("khushi");
		s1.display();
		s1.setsal(s1.getsal()+s1.getsal()*20/100);
		System.out.println(s1.getsal());		
	}

}
