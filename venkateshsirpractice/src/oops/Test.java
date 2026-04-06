package oops;

public class Test {

}
 class Demo extends Test{
	 
 }
 
 class Sample extends Demo{
	 
 }
 
 class A1{
	 public Test get() {
		 return new Test();
	 }
 }
 class B extends A1{
	 public Demo get() {
		 return new Demo();
	 } 
 }
