package multithreading;

 class MyThread extends Thread{
	public void run() {
		for (int i=1;i<=50;i++) {
			System.out.println("run:"+i);
		}
	}
//it is executed in main thread
	public static void main(String[] args) {
		MyThread mt=new MyThread();
		//mt.start();   //not serial wise //par do start nahi le sakate
		//mt.start();
		mt.run();    //serial wise print     //do bar run method le sakte hai
		mt.run();    //serial wise
		for(int i=1;i<=2;i++){
			System.out.println("main:"+i);
			
		}
	}

}
