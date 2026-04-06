package oops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Collectionm {

	

	public static void main(String[] args) {
		List<String> cart = new ArrayList<>();
		cart.add("Shirt");
		cart.add("Shoes");

		HashSet<String> coupons = new HashSet<>();
		coupons.add("DISCOUNT10");
		coupons.add("DISCOUNT10"); // duplicate ignored

		HashMap<String, Integer> price = new HashMap<>();
		price.put("Shirt", 1000);
		price.put("Shoes", 2000);
	}

}
