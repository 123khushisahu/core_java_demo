package oops;

import java.util.PriorityQueue;

public class priority {

	public static void main(String[] args) {
		PriorityQueue<Integer> tm=new PriorityQueue<>();
		tm.offer(54);
		tm.offer(82);
		tm.offer(74);
		tm.offer(71);
		tm.offer(55);
		System.out.println(tm);
		System.out.println(tm.poll());
		System.out.println(tm);
		System.out.println(tm.poll());
		System.out.println(tm);
		System.out.println(tm.poll());
		System.out.println(tm);



	}

}
