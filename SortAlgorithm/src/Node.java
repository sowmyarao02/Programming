
public class Node {
	
	public int key;
	public Node right;
	public Node left;
	public int count;

	public Node(int key)
	{
		this.key=key;
		this.left=null;
		this.right=null;
		count=1;
	}
		
}
