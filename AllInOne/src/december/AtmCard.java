package december;

interface Vehicle {
	abstract void start();
	abstract void move();
	abstract void stop();

}

 abstract class Software {
	abstract void design();
	abstract void develop();
	abstract void test();
	abstract void run();
}
 class Dog{
	
}
class Tata extends  Software implements Vehicle {	
										



@Override
void start() {
	// TODO Auto-generated method stub
	
}

@Override
void move() {
	// TODO Auto-generated method stub
	
}

@Override
void stop() {
	// TODO Auto-generated method stub
	
}

@Override
void design() {
	// TODO Auto-generated method stub
	
}

@Override
void develop() {
	// TODO Auto-generated method stub
	
}

@Override
void test() {
	// TODO Auto-generated method stub
	
}

@Override
void run() {
	// TODO Auto-generated method stub
	
}
//problem with abstract class
	//abstract class does not support  
	//mulitple inheritance             
	
//solution: use interface 