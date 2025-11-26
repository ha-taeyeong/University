package queue;

import java.util.LinkedList;
import java.util.Queue;

public class FibQ {
	public static void main(String[] args) {
		System.out.println("Hello Java");
		int N=10;
		int f0=0, f1=0, f2=0;
		Queue<Integer> fibq = new LinkedList<Integer>();
		fibq.add(1);
		fibq.add(1);
		for(int i=2;i<=N;i++) {
			f0=fibq.remove();
			f1=fibq.peek();
			f2=f1+f0;
			fibq.add(f2);
			System.out.println(i+"="+f2);
		}
		System.out.println("= "+f2);
	}
}
