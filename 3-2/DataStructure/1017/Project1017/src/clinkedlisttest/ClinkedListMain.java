package clinkedlisttest;

class Node<E> {
	E data;
	Node<E> link;
	
	public Node(E data, Node<E> link) {
		this.data = data;
		this.link = link;
	}
}
class ClinkList<E> {
	Node<E> tail;
	int size;
	
	public void addLast(E data) {
		Node<E> newNode = new Node<>(data, null);
		if (tail == null) {
			tail = newNode;
			tail.link = tail;	// 자기 자신을 가리킴 (첫 번쨰 노드이자 마지막 노드)
		} else {
			newNode.link = tail.link; // 새 노드의 link는 head(tail.link)를 가리킴
			tail.link = newNode;	  // 기존 tail의 link는 새 노드를 가리킴
			tail = newNode;			  // tail 포인터를 새 노드로 이동
		}
		size++;
	}
	
	public void addFirst(E data) {
		Node<E> newNode = new Node<>(data, null);
		if (tail == null) {
			tail = newNode;
			tail.link = tail;	// 자기 자신을 가리킴 (첫 번쨰 노드이자 마지막 노드)
		} else {
			newNode.link = tail.link; // 새 노드의 link는 head(tail.link)를 가리킴
			tail.link = newNode;	  // 기존 tail의 link는 새 노드를 가리킴
			// tail 포인터는 그대로 유
		}
		size++;
	}
	
	public void printAll() {
		if (tail == null) {
			System.out.println("리스트가 비어있습니다.");
			return;
		}
		Node<E> p = tail.link; // head 노드부터 시작
		
		System.out.print("리스트: ");
		do {
			System.out.print(p.data + " ");
			p = p.link;
		} while (p != tail.link); // head 노드에 다시 도착할 때까지
		System.out.println();
	}
	
	public int size() {
		return size;
	}
	
	public void delete(E data) {
		if (tail == null) return;
		
		Node<E> p = tail.link; 	// head
		Node<E> q = tail;		// head의 이전 노드
		
		// 리스트를 순회하며 삭제할 노드를 찾음
		do {
			if (p.data.equals(data)) {
				// 노드가 1개인 경우
				if (p == tail) {
					tail = null;
				}
				// 노드가 tail인 경우 (마지막 노드 삭제)
				else if (p == tail) {
					q.link = tail.link;	// 이전 노드가 head를 가리키게 함
					tail = q;			// 이전 노드를 새로운 tail로 설
				}
				// 노드가 head인 경우 (첫 노드 삭제)
				else if (p == tail.link) {
					tail.link = p.link;	// tail이 두 번쨰 노드를 가리키게 
				}
				// 중간 노드 삭제
				else {
					q.link = p.link;
				}
				size--;
				return;
			}
			q = p;
			p = p.link;
		} while (p != tail.link); // head에 다시 도착할 떄까지 순회
	}
	
	public E deleteLast() {
		if (tail == null) { return null; }
		E deletedData = tail.data;
		
		// 노드가 1개인 경우
		if (tail.link == tail) {
			tail = null;
			size = 0;
			return deletedData;
		}
		
		// tail의 이전 노드를 찾음 (q)
		Node<E> p = tail.link;
		Node<E> q = null; // tail의 이전 노
		
		// tail의 이전 노드를 찾을 때가지 순회
		while (p.link != tail) {
			p = p.link;
		}
		q = p;	// q는 새로운 tail이 될 노드
		
		q.link = tail.link;	// 새 tail이 head를 가리키게 함
		tail = q;			// q를 새 tail로 설정
		size--;
		return deletedData;
	}
	
	public E get(int index) {
		if (tail == null || size == 0) { return null; }
		
		// 원형으로 돌아가며 탐색 (index % size)
		int actualIndex = index % size;
		
		Node<E> p = tail.link;	// head부터 시작
		for (int i = 0; i < actualIndex; i++) {
			p = p.link;
		}
		return p.data;
	}
	
	public int getData(E data) {
		if (tail == null) { return -1; }
		
		Node<E> p = tail.link; // head부터 시작
		int index = 0;
		
		do {
			if (p.data.equals(data)) {
				return index;
			}
			p = p.link;
			index++;
		} while (p != tail.link);
		
		return -1; // 데이터를 찾지 못한 경
	}
}

public class ClinkedListMain {
	public static void main(String[] args) {
		ClinkList<Integer> clist1 = new ClinkList<>();
		clist1.addLast(30);
		clist1.addLast(40);
		clist1.addLast(20);
		clist1.addLast(90);
		clist1.addLast(70);
		
		clist1.printAll();
		
		System.out.println("리스트 크기: " + clist1.size());
		
		clist1.addFirst(10);
		clist1.printAll();
		System.out.println("리스트 크기: " + clist1.size());
		
		System.out.println("삭제된 마지막 원소: " + clist1.deleteLast());
		clist1.printAll();
		System.out.println("리스트 크기: " + clist1.size());
		
		System.out.println("인덱스 3의 값: " + clist1.get(3));
		System.out.println("인덱스 8의 값 (8%5=3): " + clist1.get(8));
		
		System.out.println("값 40의 인덱스: " + clist1.get(40));
		System.out.println("값 100의 인덱스: " + clist1.get(100));
		
		clist1.delete(10);
		clist1.delete(90);
		clist1.delete(40);
		clist1.printAll();
	}
}
