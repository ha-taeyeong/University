package queue;

import java.util.LinkedList;
import java.util.Queue;

public class UtillQ {
	public static void main(String[] args) {
		System.out.println("Hello Java");
		Queue<Integer> q = new LinkedList<>();
		q.add(10); // enqueue
		q.add(20);
		q.add(30);
		q.add(40);
		System.out.println(q.remove());
		System.out.println(q.size());
	}
}
