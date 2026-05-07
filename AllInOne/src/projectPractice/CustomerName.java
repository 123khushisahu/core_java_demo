package projectPractice;
public class CustomerName {
public static void main(String[] args) {
BankAccount h1=new BankAccount();
BankAccount h2=new BankAccount();
//initializing instance with ks value
h1.bankname="SBI";
h1.branchname="gopiganj";
h1.ifsc="123qwe";
h1.accountnum=1234566666666666L;
h1.accountholdername="kamalashankar";
h1.balance=45678.00;
//initializing instance with md value

h2.bankname="SBI";
h2.branchname="gopiganj";
h2.ifsc="123qwe";
h2.accountnum=1234566666666666L;
h2.accountholdername="kamalashankar";
h2.balance=45678.00;
System.out.println("H1 object value");
System.out.println("h1.bankname\t:" +h1.bankname);
System.out.println("h1.branchname\t:" +h1.branchname);
System.out.println("h1.ifsc:\t" +h1.ifsc);
System.out.println("h1.accountnum\t:" +h1.accountnum);
System.out.println("h1.accountholdername:" +h1.accountholdername);
System.out.println("h1.balance:" +h1.balance);

System.out.println("H2 object value");
System.out.println("h2.bankname\t:" +h2.bankname);
System.out.println("h2.branchname\t:" +h2.branchname);
System.out.println("h2.ifsc:\t" +h2.ifsc);
System.out.println("h2.accountnum\t:" +h2.accountnum);
System.out.println("h2.accountholdername:" +h2.accountholdername);
System.out.println("h2.balance:" +h2.balance);


	}
}
	
