package p2;

class MyThread1 extends Thread {
    public void run() {
        System.out.println("Breakfast making started");
    	for(int i=1; i<=5; i++) {
			System.out.println("number::"+i);
    }
}
}
class MyThread2 extends Thread {
    public void run() {
        System.out.println("Tea making started");
    	for(int i=1; i<=10; i++) {
			System.out.println("number::"+i);
    }
    }
}

public class ParallelExample {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start(); // दोनों साथ शुरू
    }
}
