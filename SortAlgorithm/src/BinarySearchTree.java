
public class BinarySearchTree {

	Node root;

	public static void main(String[] str) {

		BinarySearchTree bst = new BinarySearchTree();

		bst.root = bst.insert(new Node(9), bst.root);
		bst.root = bst.insert(new Node(4), bst.root);
		bst.root = bst.insert(new Node(7), bst.root);
		bst.root = bst.insert(new Node(2), bst.root);
		bst.root = bst.insert(new Node(1), bst.root);
		bst.root = bst.insert(new Node(20), bst.root);
		bst.root = bst.insert(new Node(11), bst.root);
		bst.root = bst.insert(new Node(8), bst.root);
		bst.root = bst.insert(new Node(6), bst.root);
		bst.root = bst.insert(new Node(5), bst.root);
		bst.root = bst.insert(new Node(12), bst.root);

		System.out.println(" The rank of the number 11 is " + bst.findRank(bst.root, 11, 0));
		System.out.println(" The rank of the number 3 is " + bst.findRank(bst.root, 3, 0));
	}

	public BinarySearchTree() {
		root = null;
	}

	public int findRank(Node root, int k, int count) {
		if (root == null) {
			return count;
		} else {
			if (root.key > k) {
				return findRank(root.left, k, count);
			} else {
				count = findRank(root.left, k, count + root.count);
				return findRank(root.right, k, count);
			}
		}
	}

	public Node insert(Node n, Node root) {
		if (root == null) {
			root = n;
			return root;
		} else if (n.key == root.key) {
			root.count++;
		} else if (n.key > root.key) {
			root.right = insert(n, root.right);
		} else if (n.key < root.key) {
			root.left = insert(n, root.left);
		}
		return root;
	}

}
