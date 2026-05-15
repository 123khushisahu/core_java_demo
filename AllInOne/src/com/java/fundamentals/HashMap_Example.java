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
		
		System.out.println(linkedhashmap+"\n");
//		System.out.println("before clear method"+linkedhashmap);
//		linkedhashmap.clear();
//		System.out.println("after clear method"+linkedhashmap);
		
		System.out.println(" size method"+linkedhashmap.size());
		System.out.println(" empty method"+linkedhashmap.isEmpty());
		System.out.println(" containsKey available method "+linkedhashmap.containsKey(101));
		System.out.println(" containsKey not method "+linkedhashmap.containsKey(1001));
		
		System.out.println(" containsvalue available method "+linkedhashmap.containsValue("Vijay"));
		System.out.println(" containsvalue not method "+linkedhashmap.containsValue("khushi"));
		
		System.out.println(linkedhashmap.hashCode());
		
		System.out.println(linkedhashmap);
	//	linkedhashmap.replaceAll();
		
		System.out.println("=================================================================================");

				// Creating HashMap
				HashMap<Integer, String> map = new HashMap<>();


				// 1. put()
				map.put(1, "Java");
				map.put(2, "Python");
				map.put(3, "C++");

				System.out.println("put(): " + map);


				// 2. get()
				System.out.println("get(): " + map.get(1));


				// 3. remove()
				map.remove(3);

				System.out.println("remove(): " + map);


				// 4. replace()
				map.replace(2, "SpringBoot");

				System.out.println("replace(): " + map);


				// 5. size()
				System.out.println("size(): " + map.size());


				// 6. isEmpty()
				System.out.println("isEmpty(): " + map.isEmpty());


				// 7. containsKey()
				System.out.println("containsKey(): " + map.containsKey(1));


				// 8. containsValue()
				System.out.println("containsValue(): " + map.containsValue("Java"));


				// 9. keySet()
				System.out.println("keySet(): " + map.keySet());


				// 10. values()
				System.out.println("values(): " + map.values());


				// 11. entrySet()
				System.out.println("entrySet(): " + map.entrySet());


				// 12. putIfAbsent()
				map.putIfAbsent(4, "Hibernate");

				System.out.println("putIfAbsent(): " + map);


				// 13. forEach()
				map.forEach((k,v) -> System.out.println(k + " : " + v));


				// 14. getOrDefault()
				System.out.println("getOrDefault(): "
						+ map.getOrDefault(5, "Not Found"));


				// 15. replaceAll()
				map.replaceAll((k,v) -> v.toUpperCase());

				System.out.println("replaceAll(): " + map);


				// 16. clone()
				HashMap<Integer, String> map2 =
						(HashMap<Integer, String>) map.clone();

				System.out.println("clone(): " + map2);


				// 17. equals()
				System.out.println("equals(): " + map.equals(map2));


				// 18. hashCode()
				System.out.println("hashCode(): " + map.hashCode());


				// 19. compute()
				map.compute(1, (k,v) -> v + " Developer");

				System.out.println("compute(): " + map);


				// 20. computeIfAbsent()
				map.computeIfAbsent(5, k -> "Microservices");

				System.out.println("computeIfAbsent(): " + map);


				// 21. computeIfPresent()
				map.computeIfPresent(2,
						(k,v) -> v + " Framework");

				System.out.println("computeIfPresent(): " + map);


				// 22. merge()
				map.merge(1, " Expert",
						(oldValue,newValue)
						-> oldValue + newValue);

				System.out.println("merge(): " + map);


				// 23. clear()
				map.clear();

				System.out.println("clear(): " + map);
			
				
				System.out.println("===============================================================================");

		
		 
		 



		
		System.out.println("---------------------TreeMap---------------------------------");
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
		System.out.println("hc"+ti.hashCode());   
		
		//integer number
		
		
		HashMap<Integer,String> map1=new HashMap<>();
		map.put(1,"rani");
		map.put(2, "janvi");
		map.put(1, "riya");
		
		System.out.println(map);
	}

}
