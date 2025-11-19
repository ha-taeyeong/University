
class ListNode{
	String data;
	ListNode link;
}

public class FirstList {
	
	public static void main(String[] args) {
		System.out.println("Hello Java");
		// list1=(Choi, Kim, Lee, Park, Yoo)
		ListNode list1;
		list1=new ListNode();
		list1.data = "Choi";
		list1.link = null;
		list1.link = new ListNode();
		list1.link.data = "Kim";
		list1.link.link = null;
		list1.link.link = new ListNode();
		list1.link.link.data = "Lee";
		list1.link.link.link.link = null;
		
	}
}
