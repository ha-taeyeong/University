class Node {
	String name ;
	Node link;
	
	public Node(String name) {
		this.name = name;
		this.link = null;
	}
}

public class SimpleLinkedList14 {
	
	Node L;
	
	public void createList() {
		Node nodeKim = new Node("Kim");
		Node nodeLee = new Node("Lee");
		Node nodePark = new Node("Park");
		
		this.L = nodeKim;
		nodeKim.link = nodeLee;
		nodeLee.link = nodePark;
	}
	
	public void printList() {
		Node p = L;
		System.out.print("단순 연결 리스트 L: (");
		while(p != null) {
			System.out.print(p.name);
			if (p.link != null) {
				System.out.print(", ");
			}
			p = p.link;
		}
		System.out.println(")");
	}
	
	public static void main(String[] args) {
		SimpleLinkedList14 list = new SimpleLinkedList14();
		list.createList();
		list.printList();
		
	}

}
