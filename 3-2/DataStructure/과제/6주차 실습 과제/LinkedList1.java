package ArrayList;

import java.util.LinkedList;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<Integer> score = new LinkedList<Integer>();
		score.add(80);
		score.add(95);
		score.add(72);
		score.add(83);
		score.add(57);
		
		System.out.print("List1 (For Loop): [");
		for(int i=0; i<score.size(); i++) {
			if (i!=score.size()-1) {
				System.out.print(score.get(i) + ", "); 
			} else {
				System.out.println(score.get(i) + "]");
			}
		}
		
		System.out.print("List1 (While Loop): [");
		int k = 0;
		while(k < score.size()) {
			System.out.print(score.get(k));
			if (k != score.size()-1) {
				System.out.print(", ");
			}
			k++;
		}
		System.out.println("]");
		
		int sum = 0;
		float avg = 0;
		
		for(int i=0; i<score.size(); i++) {
			sum += score.get(i);
		}
		avg = (float) sum / score.size();
		System.out.printf("Avg: %.2f%n", avg);
	}
}
