package projectPractice;

public class Bank {

	public static void main(String[] args) {   //execute class
		//initializing static fields common all accounts
		BankAccount.bankName="HDFC";
		BankAccount.branchName="ameerpeth";
		BankAccount.ifsc="123khuam";

	//creating two instances from BankAccount class
//	BankAccount acc1=new BankAccount(); // for hk
//	BankAccount acc2=new BankAccount();  //for bk 
		'lk'
		
		System.out.println("++++++++++acc2 details+++++++++++++");
		System.out.println("acc2.bankName\t\t:"+acc2.bankName);
		System.out.println("acc2.branchName\t\t:" +acc2.branchName);
		System.out.println("acc2.ifsc:\t\t" +acc2.ifsc);
		System.out.println("acc2.accNum:\t\t" +acc2.accNum);
		System.out.println("acc2.accHName:\t\t" +acc2.accHName);
		System.out.println("acc2.balance:\t\t" +acc2.balance);
		//initializing acc1 instance with hk values
		acc1.accNum="1234";
		acc1.accHName="hk";
		acc1.balance="100000000";
		System.out.println("\n ***********acc1 detail******");
		System.out.println("acc1.bankName\t\t:" +acc1.bankName);
		System.out.println("acc1.branchName\t\t:" +acc1.branchName);
		System.out.println("acc1.ifsc\t\t:" +acc1.ifsc);
		System.out.println("acc1.accNum\t\t:" +acc1.accNum);
		System.out.println("acc1.accHName\t\t:" +acc1.accHName);
		System.out.println("acc1.balance\t\t:" +acc1.balance);
		
		System.out.println("acc1.accNum\t\t:" +acc1.accNum);
		System.out.println("\n @@@@@@@@@@@acc2 details@@@@@@@@@");
		System.out.println("acc2.bankName\t\t:"+acc2.bankName);
		System.out.println("acc2.branchName\t\t:"+acc2.branchName);
		System.out.println("acc2.ifsc\t\t:"+acc2.ifsc);
		System.out.println("acc2.accHName\t\t:"+acc2.accHName);
		System.out.println("acc2.accNum\t\t:"+acc2.accNum);
		System.out.println("acc2.balance\t\t:" +acc2.balance);
		//initializing acc2 instance with bk values
		acc2.accNum="3245";
		acc2.accHName="bk";
		acc2.balance="9888";
		System.out.println(" \n ::::::::::::acc1 details::::::::::");
		System.out.println("acc1.bankName\t\t:" +acc1.bankName);
		System.out.println("acc1.branchName\t\t:" +acc1.branchName);
		System.out.println("acc1.ifsc\t\t:" +acc1.ifsc);
		System.out.println("acc1.accNum\t\t:" +acc1.accNum);
		System.out.println("acc1.accHName\t\t:" +acc1.accHName);
		System.out.println("acc1.balance\t\t:" +acc1.balance);
		
		
		System.out.println("\n &&&&&&&&&&acc2 details&&&&&&&&&&77");
		System.out.println("acc2.bankName\t\t:" +acc2.bankName);
		System.out.println("acc2.branchName\t\t:" +acc2.branchName);
		System.out.println("acc2.ifsc\t\t:" +acc2.ifsc);
		System.out.println("acc2.accNum\t\t:" +acc2.accNum);
		System.out.println("acc2.accHName\t\t:" +acc2.accHName);
		System.out.println("acc2.balance\t\t:" +acc2.balance);
		
		
		
		
		
	}

}
