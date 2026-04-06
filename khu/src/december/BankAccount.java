package december;
public class BankAccount {
private static String bankname;
private long accno;
private boolean active;
public static void setbankname(String bankname) {
	BankAccount.bankname=bankname;
}
public static String getbankname() {
	return bankname;
}
public void setaccno(long accno) {
this.accno=accno;
}
public long getaccno() {
	return accno;
}
public void setactive(boolean active) {
	this.active=active;
	
}
public boolean getactive() {
	return active;
}
public void display() {
	System.out.println("bankname" +bankname);
	System.out.println("accno" +accno);
	System.out.println("active" +active);
}
}
