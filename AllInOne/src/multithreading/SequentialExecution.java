package multithreading;

public class SequentialExecution {
	     void task1() {
	        System.out.println("Room cleaning started");
	        System.out.println("Room cleaning finished");
	    }

	    static void task2() {
	        System.out.println("Clothes washing started");
	        System.out.println("Clothes washing finished");
	    }

	    public static void main(String[] args) {
	    	SequentialExecution ob=new SequentialExecution();
	      ob.task1(); // पहले पूरा चलेगा
	        task2(); // बाद में चलेगा
	    }
	}



