package Trees;

import java.util.Scanner;

class Node {
	Node left, right;
	int data;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

class TreeHeight {

	public static int getHeight(Node root) {
		return height(root);
	}

	private static int height(Node root) {
		if (root == null)
			return -1;

		if (isLeaf(root))
			return 0;

		return 1 + Math.max(height(root.left), height(root.right));
	}

	private static boolean isLeaf(Node node) {
		return node.left == null && node.right == null;
	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		int height = getHeight(root);
		System.out.println(height);
	}
}
