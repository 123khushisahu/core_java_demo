package oops;

class Animal1 {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog1 extends Animal1 {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Test2 {
    public static void main(String[] args) {
        
        Animal1 a = new Dog1();  // Upcasting
        a.sound();
       // a.bark();
        
        Dog1 d = (Dog1) a;       // Downcasting
        
        d.sound();  // ✔
        d.bark();   // ✔
    }
}