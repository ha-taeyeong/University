package ArrayList;

import java.util.*;

public class ArrayList1 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		int sum = 0;
		float avg = 0;
		list1.add(33);
		list1.add(25);
		list1.add(77);
		list1.add(47);
		list1.add(98);
		System.out.println("List: " + list1);

		for(int i=0; i<list1.size(); i++) {
			sum += list1.get(i);
		}
		avg = (float) sum / list1.size();
		System.out.printf("Avg: %.2f%n", avg);
		
	}
}
