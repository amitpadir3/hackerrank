package Trees;

public class Tree {

	static class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

	private void insert(Node node, int i) {

		if (node.data > i) {
			// left
			if (node.left != null) {
				insert(node.left, i);
			} else {
				node.left = new Node(i);
				System.out.println("inserted value " + i + "at left to " + node.data);
			}

		} else {
			// right
			if (node.right != null) {
				insert(node.right, i);
			} else {
				node.right = new Node(i);
				System.out.println("inserted value " + i + "at right to " + node.data);
			}

		}
	}

	private void traverse(Node root) {
		if (root != null) {
			traverse(root.left);
			System.out.println(">>" + root.data);
			traverse(root.right);
		}
	}

	public static void main(String ar[]) {

		Tree tree = new Tree();
		Node root = new Node(5);
		tree.insert(root, 2);
		tree.insert(root, 4);
		tree.insert(root, 8);
		tree.insert(root, 6);
		tree.insert(root, 7);
		tree.insert(root, 3);
		tree.insert(root, 9);
		tree.traverse(root);
	}

}
