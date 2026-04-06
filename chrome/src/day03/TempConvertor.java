package day03;

public class TempConvertor {
public static void main(String[] args) {
	
	int  celsius=30;
	float result=(celsius*9/5)+32;
	System.out.println("Result= "+result);
	int convertedValue=(int)result;
	System.out.println("converted Value= "+convertedValue);
}
}


/*
 * 1️⃣ Class: TemperatureConverter
 * 
 * Scenario: A weather app stores temperatures in Celsius but must show them in
 * Fahrenheit for U.S. users.
 * 
 * Task: Create a class TemperatureConverter with:
 * 
 * Variable: float celsius
 * 
 * Method: convertToFahrenheit() → returns (celsius * 9/5) + 32
 * 
 * Example: Input → celsius = 30 Output → Fahrenheit = 86.0
 * 
 * 🧠 Concepts: type conversion between int and float; operator usage.
 */