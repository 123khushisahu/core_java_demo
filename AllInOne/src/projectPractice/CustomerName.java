package projectPractice;
public class CustomerName {
public static void main(String[] args) {
BankAccount h1=new BankAccount();
BankAccount h2=new BankAccount();
//initializing instance with ks value
h1.bankName="SBI";
h1.branchName="gopiganj";
h1.ifsc="123qwe";
h1.accNum=123456L;
h1.accHName="kamalashankar";
h1.balance=45678.0;
//initializing instance with md value

h2.bankName="SBI";
h2.branchName="gopiganj";
h2.ifsc="123qwe";
h2.accNum=123456L;
h2.accHName="kamalashankar";
h2.balance=45678.0;
System.out.println("H1 object value");
System.out.println("h1.bankname\t:" +h1.bankName);
System.out.println("h1.branchname\t:" +h1.branchName);
System.out.println("h1.ifsc:\t" +h1.ifsc);
System.out.println("h1.accountnum\t:" +h1.accNum);
System.out.println("h1.accountholdername:" +h1.accHName);
System.out.println("h1.balance:" +h1.balance);

System.out.println("H2 object value");
System.out.println("h2.bankname\t:" +h2.bankName);
System.out.println("h2.branchname\t:" +h2.branchName);
System.out.println("h2.ifsc:\t" +h2.ifsc);
System.out.println("h2.accountnum\t:" +h2.accNum);
System.out.println("h2.accountholdername:" +h2.accHName);
System.out.println("h2.balance:" +h2.balance);


	}
}
	
