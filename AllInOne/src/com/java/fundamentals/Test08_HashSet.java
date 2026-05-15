package com.java.fundamentals;
import java.util.HashSet;

public class Test08_HashSet {
	public static void main(String[] args) {
		
		HashSet<Object> hs = new HashSet<Object>();
		
		hs.add("a");
			//k1.hashCode(); -> 97
			     //bucket is not found
		
		hs.add("b");
			//k2.hashCode(); -> 98
				//bucket is not found
		
		hs.add(new Ex(5,6));
			//k3.hashCode(); -> !ovr -> ref(333)
				//bucket is not found
		
		hs.add(new Sa(5,6));
			//k4.hashCode(); -> ovr -> state(5+6=11)
				//bucket is not found
		
		hs.add(new Ex(5,6));
			//k5.hashCode(); -> !ovr -> ref(555)
				//bucket is not found
		
		hs.add(new Sa(5,6));
			//k6.hashCode(); -> ovr -> state(5+6=11)
				//bucket is found
					//k6==k4 		-> false (ref are diff)
					//k6.equals(k4)	-> over-> state compared -> true
						//k6 is duplicate based on state -> not stored
		
		hs.add(97);
			//k7.hashCode(); -> 97 -> bucket is found(k1="a" is available)
				//k7==k1  -> false -> unique based on reference
				//k7.equals(k1); -> false -> diff type objects
					//I(97) object is stored in the same 97 bucket after "a"
		
		hs.add(98);
			//k8.hashCode(); -> 98 -> bucket is found (k2="b" is available)
				//k8==k2  		-> false (different ref object) unique
				//k8.equals(k2) -> false (different type) totally unique 
					//I(98) is stored in the same 98 bucket after "b"
		
		hs.add(11);
			//k9.hashCode(); -> 11 -> bucket is found(k4=Sa(5,6) is available)
				//k9==k4   		-> false
				//k9.equals(k4) -> false
					//I(11) is stored in 11 hash code bucket after Sa(5,6) object
		
		hs.add(97);
			//k10.hashCode(); -> 97 -> bucket is found with 2 objects [k1="a", k7=97]
				//k10==k1			-> false  (diff ref)
				//k10.equals(k1)	-> false  (diff type)
		
				//k10==k7			-> true	  (same ref obj)
					//not stored
		
		
		hs.add(new Integer(97));
				//k11.hashCode(); -> 97 -> bucket is found with 2 objects [k1="a", k7=97]
					//k11==k1			-> false  (diff ref)
					//k11.equals(k1)	-> false  (diff type)
				
					//k11==k7			-> false  (diff ref obj)
					//k11.equals(k7)	-> true   (same type and state)
						//not stored
		
		System.out.println(hs);

	}
}