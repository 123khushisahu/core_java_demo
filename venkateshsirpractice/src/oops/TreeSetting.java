package oops;
import java.util.*;

public class TreeSetting {
	    public static void main(String[] args) {
	        TreeSet<Integer> numbers = new TreeSet<>();

	        numbers.add(5);
	        numbers.add(2);
	        numbers.add(8);
	        numbers.add(2); // duplicate, won't be added

	        System.out.println(numbers);
	    }
	}