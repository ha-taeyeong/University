package ArrayList;

import java.util.*;

public class ArrayList2 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("Choi");
		list1.add("Kim");
		list1.add("Lee");
		list1.add("Park");
		list1.add("Yoo");
		
		System.out.print("List1 (For Loop): [");
		for(int i=0; i<list1.size(); i++) {
			if (i!=list1.size()-1) {
				System.out.print(list1.get(i) + ", "); 
			} else {
				System.out.println(list1.get(i) + "]");
			}
		}
		
		System.out.print("List1 (While Loop): [");
		int k = 0;
		while(k < list1.size()) {
			System.out.print(list1.get(k));
			if (k != list1.size()-1) {
				System.out.print(", ");
			}
			k++;
		}
		System.out.println("]");
		
		System.out.println("First Element:" + list1.get(0));
		System.out.println("Final Element:" + list1.get(list1.size()-1));
		System.out.println("Middle Element:" + list1.get(list1.size()/2));
		System.out.println("List1 size:" + list1.size());
		List<String> list2 = new ArrayList<>();
		list2.add("Moon");
		list2.add("Song");
		list2.add("Seo");
		list2.add("Jeong");
		list1.addAll(list2);
		System.out.println("List1 and List2 Merge: " + list1);
	}
}
