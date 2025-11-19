package linkedlist3;

class Node {
	int coef;
	int exp;
	Node link;
	public Node(int coef, int exp) {
		this.coef=coef;
		this.exp=exp;
		link=null;
	}
}
class Link {
	Node head, tail;
	public Link() {
		head=null; tail=null;
	}
	public void addNode(int coef, int exp) {
		Node tmp;
		tmp=new Node(coef, exp);
		if(head==null) {
			head=tmp;
			tail=tmp;
		}else {
			tail.link=tmp;
			tail=tmp;
		}
	}
	public void printList() {
		Node p;
		p=head;
		while(p!=null) {
			System.out.print(" ("+p.coef+", "+p.exp+ " ) ");
			p=p.link;
		}
		System.out.println();
	}
	public static Link listAdd(Link list1, Link list2) {
		Link list3;
		list3 = new Link();
		Node tmp1, tmp2;
		for(tmp1=list1.head,tmp2=list2.head; tmp1!=null&&tmp2!=null;) {
	//		System.out.println(tmp1+" "+tmp1.exp+" "+tmp2+" "+tmp2.exp);
			if (tmp1.exp==tmp2.exp) {
				list3.addNode(tmp1.coef+tmp2.coef, tmp1.exp);
				tmp1=tmp1.link;
				tmp2=tmp2.link;
			}else if (tmp1.exp>tmp2.exp) {
				list3.addNode(tmp1.coef, tmp1.exp);
				tmp1=tmp1.link;
			}else {
				list3.addNode(tmp2.coef, tmp2.exp);
				tmp2=tmp2.link;
			}
		}
		//코드추가필요
		if( tmp1!=null) {
			while(tmp1!=null) {
				list3.addNode(tmp1.coef, tmp1.exp);
				tmp1=tmp1.link;
			}
		}
		if( tmp2!=null) {
			while(tmp2!=null) {
				list3.addNode(tmp2.coef, tmp2.exp);
				tmp2=tmp2.link;
			}
		}
		return list3;
	}
}
public class PolyAdd {

	public static void main(String[] args) {
		System.out.println("Hello Java");
		Link list1 = new Link();
		list1.addNode(3, 14);
		list1.addNode(2, 8);
		list1.addNode(1, 0);
		list1.printList();
		Link list2 = new Link();
		list2.addNode(8, 14);
		list2.addNode(-3, 10);
		list2.addNode(10 ,6);
		list2.printList();
		Link list3=Link.listAdd(list1, list2);
		list3.printList();
	}
}
