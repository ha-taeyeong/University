package linkedlist;

class Node {
	String data;
	Node link;
	public Node(String data, Node link) {
		this.data = data;
		this.link = link;
	}
}
class List {
	Node head; // 리스트의 첫 번째 노드를 가리키는 포인터. 리스트가 비어있으면 null.
	
	public void addLastNode(String data) {
		
		Node tmp;	// 새로 만들 노드
		Node p;		// 리스트를 순회할 포인터
		
		tmp=new Node(data, null); // 새 노드 생성 (link는 일단 null)
		
		// 1. 리스트가 비어있는 경우
		if (head == null) {
			head = tmp; // head가 새 노드를 가리키게 함.
			return;
		}
		
		// 2. 리스트에 노드가 있는 경우, 끝까지 이동
		p=head;
		
		while(p.link!=null) { // p가 마지막 노드가 될 때까지 이동
			p=p.link;
		}
		p.link=tmp; // 마지막 노드의 link가 새 노드를 가리키게 연결
		return;
	}
	
	public void addFirst(String x) {
		Node tmp; // 새로 만들 노드
		tmp = new Node(x, null); // 새 노드 생성
		tmp.link=head; // 새 노드의 link가 현재 head(기존 첫 노드)를 가리키게 함
		head=tmp; // head 포인터를 새 노드로 업데이트
	}
	
	public void printList() {
		Node p; // 리스트를 순회활 포인터
		p=head;
		
		while(p!=null) { // p가 null이 될 때까지 (리스트 끝까지)
			System.out.print(" "+p.data); // 현재 노드의 데이터 출력
			p = p.link; // 다음 노드로 이동
		}
		System.out.println();
		// for문 사용
//		for(p=head; p!=null; p=p.link) {
//			System.out.print(" "+p.data);
//		}
//		System.out.println();
	}
	
	public int countNode() {
		int count=0;
		Node p;
		p=head;
		while(p!=null) { // 리스트 끝까지 순회
			p=p.link; // 다음 노드로 이동
			count++; // 개수 증가
		}
		return count;
	}
	
	// 특정원소의 몇번쨰가 원소인지 위치계산
	public int countName(String name) {
		Node p = head; // 탐색을 시작할 포인터 p를 head에 둡니다.
		int position = 1; // 위치는 1부터 시작
		
		// 리스트의 끝까지 반복
		while (p != null) {
			// 현재 노드의 데이터가 찾으려는 name과 같으면
			if (p.data.equals(name)) { // 문자열 비교는 .equals() 사용
				return position; // 현재 위치 반환
			}
			// 다음 노드로 이동
			p = p.link;
			// 위치를 1증가
			position++;
		}
		return -1;
	}
	
	// k번째원소출력
	public String kthElement(int k) {
		// k가 1보다 작으면 유효하지 않은 위치이므로 null을 반환합니다.
		if (k < 1) {
			return null;
		}
		
		Node p = head; // 탐색을 시작할 포인터 p를 head에 둡니다.
		int count = 1; // 현재 위치를 셀 카운터를 1로 초기화합니다.
		
		// 리스트의 끝까지 반복
		while (p != null) {
			// 현재 위치(count)가 찾으려는 위치(k)와 같으면
			if (count == k) {
				return p.data; // 현재 노드의 데이터를 반환
			}
			p = p.link; // 다음 노드로 이동
			count++;
		}
		return null;
	}
	
	// 원소 x를 원소 y로 교체
	public boolean replaceNode(String x, String y) {
		Node p = head;
		while (p != null) {
			if (p.data.equals(x)) {
				p.data = y;
				return true; // 교체 성공
			}
			p = p.link;
		}
		return false;
	}
	
	public String deleteLastNode() {
		Node p, q;
		String tmpData;
		if (head==null) { return  "nothing"; }
		p=head; q=null;
		while(p.link!=null) {
			q=p;
			p=p.link;
		}
		tmpData = p.data;
		q.link = null;
		return tmpData;
	}
	
	public String deleteFirst() {
		String tmpData;
		if (head==null) { return "nothing"; }
		tmpData = head.data;
		head = head.link;
		return tmpData;
	}
	
	public void reverseList() {
		Node p, q, r;
		p=head;
		q=null; r=null;
		while(p!=null) {
			r=q;
			q=p;
			p=p.link;
			q.link=r;
		}
		head=q;
	}
}

public class LinkedListMain {
	public static void main(String[] args) {
		// 1. list1 = ("Kim", "Lee", "Park", "Choi") 생성 및 전체 원소 출력
		System.out.println("--- 1. 리스트 생성 및 초기화 ---");
		List list1 = new List();
		list1.addLastNode("Kim");
		list1.addLastNode("Lee");
		list1.addLastNode("Park");
		list1.addLastNode("Choi");
		System.out.print("초기 리스트:");
		list1.printList();
		System.out.println("=======================================\n");
		
		// 2. 새로 구현한 메소드 테스트
		System.out.println("--- 2. 새로 추가된 메소드 테스트 ---");
		
		// countName() 테스트
		System.out.println("'Park'의 위치는? " + list1.countName("Park"));
		System.out.println("'Yoo'의 위치는? " + list1.countName("Yoo"));
		System.out.println();
		
		// kthElement() 테스트
		System.out.println("3번째 원소는? " + list1.kthElement(3));
		System.out.println("5번째 원소 " + list1.kthElement(5));
		System.out.println();
		
		// replaceNode() 테스트
		System.out.println("'Lee'를 'Yoo'로 교체: " + (list1.replaceNode("Lee", "Yoo") ? "성공" : "실패"));
		System.out.println("교체 후 리스트:");
		list1.printList();
		System.out.println("=======================================\n");
		
		// 3. 기존 메소드 테스트 (main 함수 예시)
		System.out.println("--- 3. 기존 메소드 동작 테스트 ---");
		System.out.println("마지막 원소 삭제: " + list1.deleteLastNode());
		System.out.println("삭제 후 리스트:");
		list1.printList();
		
		System.out.println("\n'Moon'을 맨 앞에 추가");
		list1.addFirst("Moon");
		System.out.print("추가 후 리스트:");
		list1.printList();
		
		System.out.println("\n첫 번째 원소 삭제: " + list1.deleteFirst());
		System.out.print("삭제 후 리스트:");
		list1.printList();
		
		System.out.println("\n현재 원소의 개수: " + list1.countNode());
		
		System.out.println("\n리스트 뒤집기");
		list1.reverseList();
		System.out.print("뒤집은 후 리스트:");
		list1.printList();
		System.out.println("========================================");
	}
}
