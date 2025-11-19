package linkedlist2;

class Node {
	int data;
	Node link;
	public Node(int data) { // 생성자
		this.data = data;
	}
}
class Link {
	Node head;
	Node tail;
	public void addNode(int x) { // return 값이 없으므로 void
		Node tmp;
		tmp=new Node(x);
		if (head==null) {
			head=tmp; tail=tmp;
			return;
		}
		tail.link=tmp; tail=tmp;
	}
	public void printList() {
		Node p;
		p=head;
		while(p!=null) {
			System.out.print(" "+p.data);
			p=p.link;
		}
		System.out.println();
	}
	public int printMiddle() {
		Node p1, p2;
		p1=head;
		p2=head;
		if(head!=null) {
			while((p2!=null)&&(p2.link!=null)) {
				p2=p2.link; p2=p2.link; // 2칸 전진
				p1=p1.link; // 1칸 전진
			}
			return p1.data;
		}
		return 0;
	}
	public int printNthFromList(int n) {
		Node p1, p2;
		p1=head; p2=head;
		int count=0;
		if(head!=null) {
			while(count<n) {
				p1=p1.link; // 1칸 전진
				count++;
			}
		}
		while(p1!=null) {
			p1=p1.link;
			p2=p2.link;
		}
		return p2.data;
	}
}

public class LinkedListTest1 {
	public static void main(String[] args) {
		System.out.println("Hello Java");
		Link list1 = new Link();
		for(int i=1; i<=21; i++) {
			list1.addNode(i*10);
		}
		list1.printList();
		System.out.println(list1.printMiddle());
		System.out.println(list1.printNthFromList(5));
	}
}
