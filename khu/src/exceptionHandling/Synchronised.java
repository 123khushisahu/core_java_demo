package exceptionHandling;

public class Synchronised {
	
	    int balance = 1000;

	    void withdraw(int amount) {
	        if (balance >= amount) {
	            System.out.println(Thread.currentThread().getName() + " withdrawing...");
	            balance = balance - amount;
	            System.out.println("Remaining balance: " + balance);
	        } else {
	            System.out.println("Insufficient balance");
	        }
	    }
	}

	 class Test {
	    public static void main(String[] args) {
	    	Synchronised a = new Synchronised();

	        Runnable r = () -> {
	            a.withdraw(700);
	        };

	        Thread t1 = new Thread(r, "User1");
	        Thread t2 = new Thread(r, "User2");

	        t1.start();
	        t2.start();
	    }
	}



