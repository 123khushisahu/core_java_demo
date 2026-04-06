package oops;

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Test1 {
    public static void main(String[] args) {
        
        Animal a = new Dog(); // Upcasting
        
        a.sound();  // ✔ allowed
        // a.bark(); ❌ not allowed (reference is Animal)
        
        //downcasting
        
        Dog b=(Dog)a;
        b.bark();
        
    }
}