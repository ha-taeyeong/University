package deque;

import java.util.Deque;
import java.util.LinkedList;

class Student {
	int id;
	String name;
	int score;
	
	public Student(int id, String name, int score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}
	
	@Override
	public String toString( ) {
		return "ID:" + id + ", 이름:" + name + ", 성적:" + score;
	}
}

public class DequeTest2 {
	public static void main(String[] args) {
		Deque<Student> dq = new LinkedList<>();
		
		dq.addFirst(new Student(1, "Kim", 88));
		dq.addFirst(new Student(2, "Lee", 92));
		dq.addFirst(new Student(3, "Park", 70));
		dq.addFirst(new Student(4, "Choi", 85));
		dq.addFirst(new Student(5, "Jung", 95));
		dq.addFirst(new Student(6, "Kang", 80));
		dq.addFirst(new Student(7, "Jo", 65));
		dq.addFirst(new Student(8, "Yoon", 90));
		dq.addFirst(new Student(9, "Jang", 77));
		dq.addFirst(new Student(10, "Lim", 82));
		
		for(Student s : dq) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("removeFirst() : " + dq.removeFirst());
		System.out.println("removeLast() : " + dq.removeLast());
		System.out.println();
		System.out.println("peekFirst() : " + dq.peekFirst());
		System.out.println("peekLast() : " + dq.peekLast());
		System.out.println();
		
		System.out.println("데크의 크기: " + dq.size());
		System.out.println();
		
		int sum = 0;
		int count = 0;
		
		while (!dq.isEmpty()) {
			Student s = dq.removeLast();
			
			System.out.println(s);
			
			sum += s.score;
			count++;
		}
		System.out.println();
		if (count > 0) {
			double avg = (double) sum / count;
			System.out.println("남은 학생들의 성적 평균 :" + avg);
		} else {
			System.out.println("학생이 없습니다.");
		}
	}
	
}
