package SimpleLinkedList15;

class Node {
	String data;
	Node link;
	public Node(String data) {
		this.data = data;
		this.link = null;
	}
}

public class SimpleLinkedList {

	Node L5;
	
	public void createList() {
		Node n1 = new Node("Kim");
		Node n2 = new Node("Lee");
		Node n3 = new Node("Park");
		Node n4 = new Node("Yoo");
		
		this.L5 = n1;
		n1.link = n2;
		n2.link = n3;
		n3.link = n4;
	}
	
	public void moveTailToHead() {
		if (L5 == null || L5.link == null) {
			return;
		}
		
		Node current = L5;
		Node preTail = null;
		
		while (current.link != null) {
			preTail = current;
			current = current.link;
		}
		
		Node tail = current;
		
		preTail.link = null;
		
		tail.link = L5;
		
		L5 = tail;
		
	}
	
	public void printList() {
		Node current = L5;
		System.out.print("L5=(");
		while(current != null) {
			System.out.print(current.data);
			if (current.link != null) {
				System.out.print(", ");
			}
			current = current.link;
		}
		System.out.println(")");
	}
	
	public static void main(String[] args) {
		SimpleLinkedList list = new SimpleLinkedList();
		
		list.createList();
		System.out.print("초기 리스트:");
		list.printList();
		
		list.moveTailToHead();
		System.out.print("이동 후 리스트: ");
		list.printList();
	}
}
