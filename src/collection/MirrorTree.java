package collection;

public class MirrorTree {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("Binary tree input :");
		tree.inOrder();
		System.out.println("");

		tree.miror();

		System.out.println("Mirror Tree:");
		tree.inOrder();
	}

}
class Node {

	int data;
	Node left, right;

	public Node(int item) {
		data = item;
		left = right = null;
	}
}

class BinaryTree {
	Node root;

	void miror() {
		root = mirror(root);
	}

	Node mirror(Node node) {
		if (node == null) {
			return node;
		}

		Node left = mirror(node.left);
		Node right = mirror(node.right);

		node.left = right;
		node.right = left;

		return node;
	}

	void inOrder() {
		inOrder(root);
	}

	void inOrder(Node node) {
		if (node == null) {
			return;
		}

		inOrder(node.left);
		System.out.print(node.data + " ");

		inOrder(node.right);
	}
}
