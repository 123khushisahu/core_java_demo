package encapsulations;

public class BankAccount1 {
	
		private double balance;//5000.0
		
		public void setBalance(double balance) throws IllegalArgumentException {//5000.0
			if(balance <=0 )
				throw new IllegalArgumentException("Do not pass -ve balance or zero");
			
			this.balance = balance;	
		}
		
		public double getBalance() {
			return balance;	
		}
		public static void main(String[] args) {
			BankAccount1 obj=new BankAccount1();//
			obj.setBalance(5000.0);//5000.0
			System.out.println(obj.getBalance());
			System.out.println(obj.balance);
		}

	}




