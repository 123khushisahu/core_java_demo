package december;
//Person.java
class Person {

//HAS-A
String name;
double height;
double weight;

}

//Address.java
class Address{ 
//HAS-A
int strnum; 
String city;
}

//Bike.java
class Bike { 
//HAS-A
String model;
String bikeNum;
}

//Car.java
class Car {
//HAS-A
String model;
String carNum;
}

//Laptop.java
class Laptop {
//HAS-A
String model;
double price;
}

//Student.java //IS-A
class Student extends Person {

//HAS-A
int sno;
String course;
double fee;
Address address;
//USES-A
void goingToCollegeBy(Bike bike) {
System.out.println(name + " is using " + bike.model + " for going to college");
}	
//USES-A
void learnCoding(Laptop laptop) {
System.out.println(name + " is using "+ laptop.model + " for leaning coding");
}
}

/*IS-A relation	-> extends
HAS-A relation	-> instance variable
USES-A relation -> method parameter

Assingment: Develop Faculty object with all 3 relations with other objects8*/


