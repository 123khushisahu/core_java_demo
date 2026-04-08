package oops;

import java.util.PriorityQueue;
//output we can not predict;
public class Demo18 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.offer(54);
		pq.offer(53);
		pq.offer(52);
		pq.offer(51);
		pq.offer(50);
		System.out.println(pq); 
		System.out.println(pq.poll()); 
		System.out.println(pq); 
		System.out.println(pq.poll()); 
		System.out.println(pq); 
		System.out.println(pq.poll()); 
		System.out.println(pq); 


	}

}
