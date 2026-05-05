package com.java.fundamentals;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMap_Example {

	public static void main(String[] args) {
		/* Types of Map in Java

		Java provides different types of Map implementations.  */
		
		
		
		// Interview Comparison Table

		// Feature              HashMap        LinkedHashMap      TreeMap        Hashtable        ConcurrentHashMap
		// ------------------------------------------------------------------------------------------------------
		// Order                No Order       Insertion Order    Sorted Order   No Order         No Order
		// Thread Safe          No             No                 No             Yes              Yes
		// Null Key             Yes            Yes                No             No               No
		// Null Values          Yes            Yes                Yes            No               No
		// Speed                Fast           Medium             Slow           Slow             Fast
		
		/*One-Line Definitions for Interview
		 * 
		HashMap →       Unordered key-value pair collection.
		LinkedHashMap → Maintains insertion order.
		TreeMap →       Maintains sorted order.
		Hashtable →     Synchronized Map.
		ConcurrentHashMap → High-performance thread-safe Map. 
		
		
		
		
		
		  // Map Definition

          // Map is an interface in Java that stores data
          // in key-value pair format where keys are unique. and values can be duplicate 
		
		// If duplicate key is added in HashMap,
         // old value gets replaced by new value.
		*/
		
		
		
		// Important HashMap Methods List

		// 1. put()
		// 2. get()
		// 3. remove()
		// 4. replace()
		// 5. clear()
		// 6. size()
		// 7. isEmpty()
		// 8. containsKey()
		// 9. containsValue()
		// 10. keySet()
		// 11. values()
		// 12. entrySet()
		// 13. putIfAbsent()
		// 14. forEach()
		// 15. getOrDefault()
		// 16. replaceAll()
		// 17. clone()
		// 18. equals()
		// 19. hashCode()
		// 20. compute()
		// 21. computeIfAbsent()
		// 22. computeIfPresent()
		// 23. merge()
		
		System.out.println("---------------------HashMap---------------------------------");
		
		
		HashMap<Integer,String> obj=new HashMap<>();
		obj.put(101, "Vijay");
		obj.put(102, "sonu1");
		obj.put(103, "dinesh");
		obj.put(104, "manoj");
		obj.put(1040, "manoj");
		obj.put(105, "mohan1");
		obj.put(106, "shyamxvxcvxcvxcvxvxcvx");
		obj.put(107, "denny1");
		obj.put(10876, "denny1");
		
		
		
		System.out.println(obj);
		
		System.out.println("---------------------LinkedHashMap---------------------------------");
		
		LinkedHashMap<Integer,String> linkedhashmap=new LinkedHashMap<>();
		linkedhashmap.put(101, "Vijay");
		linkedhashmap.put(102, "sonu1");
		linkedhashmap.put(103, "dinesh");
		linkedhashmap.put(104, "manoj");
		linkedhashmap.put(1040, "manoj");
		linkedhashmap.put(105, "mohan1");
		linkedhashmap.put(106, "shyam");
		linkedhashmap.put(107, "denny1");
		linkedhashmap.put(10876, "denny2");
		
		//System.out.println(linkedhashmap);
		
		System.out.println(linkedhashmap.get(107));
		
		System.out.println(linkedhashmap.remove(104));
		
		System.out.println(linkedhashmap);
		
		System.out.println(linkedhashmap.replace(1040, "Akhilesh"));
		
		System.out.println(linkedhashmap);
		
		
		System.out.println("---------------------TREEMap---------------------------------");
		// TreeMap Definition

		// TreeMap is a class in Java that stores
		// data in key-value pair format
		// in sorted order based on keys.
		
		TreeMap<String, String> ti=new TreeMap<>();
		
		ti.put("BZXPB1", "VIJAY");
		ti.put("BZXPB2", "AMAN");
		ti.put("BZXPB3", "SURESH");
		ti.put("BZXPB4", "PRANJAL");
		ti.put("BZXPB5", "KHUSHI");
		ti.put("BZXPB64", "KOMAL");
		ti.put("BZXPB40", "KOMAL");
		ti.put("BZXPB15", "KOMAL");
		
		System.out.println(ti);
		
		
		
		
		
		
		
	}

}
