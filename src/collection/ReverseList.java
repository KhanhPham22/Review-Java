package collection;

public class ReverseList {
	
	public class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public Node head = null;
	public Node tail = null;
	
	public void add(int data) {
		
		Node newNode = new Node(data);
		
		if (head == null) {
			
			head = newNode;
			tail = newNode;
			newNode.next = head;
		} else {
			
			tail.next = newNode;
			
			tail = newNode;
			
			tail.next = head;
		}
	}
	
	public void display() {
		Node current = head;
		if (head == null) {
			System.out.println("Danh sach nay trong tai");
		}else {
			do {
				System.out.print(" " + current.data);
				current = current.next;
			} while (current != head);
			System.out.println();
		}
	}
	
	public void reverse(Node current) {
		
		if (current.next == head) {
			System.out.print(" " + current.data);
			return;
		}
		
		reverse(current.next);
		System.out.print(" " + current.data);
	}
	
	public static void main(String[] args) {
		ReverseList rl = new ReverseList();
		rl.add(1);
		rl.add(2);
		rl.add(3);
		rl.add(4);
		rl.add(5);
		rl.add(6);
		
		System.out.println("Circular Linked List ban dau:");
		rl.display();
		System.out.println("Circular Linked List da duoc xu li");
		
		rl.reverse(rl.head);
		System.out.println("");
	}
}
