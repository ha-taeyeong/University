package deque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeTest1 {
	public static void main(String[] args) {
		Deque<Integer> d1 = new LinkedList<>();
		
		// 1. insertFirst(3)
		d1.addFirst(3);
		System.out.print("Output: -");
		System.out.println("	Deque:" + d1); // Deque 상태 출력
		
		// 2. insertFirst(5)
		d1.addFirst(5);
		System.out.print("Output: -");
		System.out.println("	Deque:" + d1); // Deque 상태 출력
		
		// [요구사항 추가] peekFirst, peekLast 확인 (삭제하지 않고 값만 확인)
		System.out.print("peekFirst: " + d1.peekFirst()); // 5
		System.out.println("	peekLast: " + d1.peekLast());   // 3
		
		// 3. deleteFirst() -> Output: 5
		if(!d1.isEmpty()) {
			int removed = d1.removeFirst(); // 삭제된 값을 받아서
			System.out.print("Output: " + removed); // 출력! (표의 Output 부분)
			System.out.println("	Deque:" + d1); // Deque 상태 출력
		} else {
			System.out.println("error");
		}
		
		// 4. insertLast(7)
		d1.addLast(7);
		System.out.print("Output: -");
		System.out.println("	Deque:" + d1); // Deque 상태 출력
		
		// 5. deleteFirst() -> Output: 3
		if(!d1.isEmpty()) {
			int removed = d1.removeFirst();
			System.out.print("Output: " + removed);
			System.out.println("	Deque:" + d1); // Deque 상태 출력
		} else {
			System.out.println("error");
		}
		
		// 6. deleteLast() -> Output: 7
		if(!d1.isEmpty()) {
			int removed = d1.removeLast();
			System.out.print("Output: " + removed);
			System.out.println("	Deque:" + d1); // Deque 상태 출력
		} else {
			System.out.println("error");
		}
		
		// 7. deleteFirst() -> Output: "error" (현재 비어있음)
		if(!d1.isEmpty()) {
			int removed = d1.removeFirst();
			System.out.print("Output: " + removed);
			System.out.println("	Deque:" + d1); // Deque 상태 출력
		} else {
			System.out.print("error"); // 큐가 비어서 여기로 들어옴
			System.out.println("		Deque:" + d1); // Deque 상태 출력
		}
		
		// 8. isEmpty() -> Output: true
		System.out.print(d1.isEmpty());
		System.out.println("		Deque:" + d1); // Deque 상태 출력
	}
}