package generictest;
class Node<E> {
	E data;
	Node<E> link;
	public Node(E data, Node<E> link) {
		this.data=data;
		this.link=link;
	}
}

class List<E> {
	Node<E> head;
	public void addLastNode(E data) {
		Node<E> tmp;
		Node<E> p;
		tmp=new Node(data, null);
		if (head==null) {
			head=tmp;
			return;
		}
		p=head;
		while(p.link!=null) {
			p=p.link;
		}
		p.link=tmp;
		return;
	}
	public void addFirst(E x) {
		Node<E> tmp;
		tmp=new Node(x,null);
		tmp.link=head;
		head=tmp;
	}
	public void printList() {
		Node<E> p;
		p=head;
		while(p!=null) {
			System.out.print(" " + p.data);
			p=p.link;
		}
		System.out.println();
	}
	public int countNode() {
		int count = 0;
		Node<E> p;
		p=head;
		while(p!=null) {
			p=p.link;
			count++;
		}
		return count;
	}
	public E deleteLastNode() {
		Node<E> p, q;
		E tmpData;
		if (head==null) { return null;}
		p=head; q=null;
		while(p.link!=null) {
			q=p;
			p=p.link;
		}
		tmpData=p.data;
		q.link=null;
		return tmpData;
	}
	public E deleteFirst() {
		E tmpData;
		if (head==null) { return null; }
		tmpData=head.data;
		head=head.link;
		return tmpData;
	}
	public void reverseList() {
		Node<E> p, q, r;
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
		System.out.println("Hello Java");
		List<String> list1 = new List<>();
		list1.addLastNode("Kim");
		list1.addLastNode("Lee");
		list1.addLastNode("Park");
		list1.addLastNode("Choi");
		list1.printList();
		System.out.println(" 삭제된 데이터="+list1.deleteLastNode());
		System.out.println(" 삭제된 데이터="+list1.deleteLastNode());
		list1.addFirst("Yoo");
		list1.addFirst("Moon");
		list1.printList();
		System.out.println(" 삭제된 데이터="+list1.deleteFirst());
		
		List<Integer> list2 = new List<>();
		list2.addLastNode(10);
		list2.addLastNode(30);
		list2.addLastNode(20);
		list2.addLastNode(40);
		list2.printList();
	}
}
