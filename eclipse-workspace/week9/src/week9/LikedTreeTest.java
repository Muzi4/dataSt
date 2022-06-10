package week9;

public class LikedTreeTest {
	public static void main(String[] args) {
		LinkedTree t = new LinkedTree();
		
		//TreeNode n7 = t.makeBT(null, 'D', null);
		//TreeNode n6 = t.makeBT(null, 'C', null);
		//TreeNode n5 = t.makeBT(null, 'B', null);
		//TreeNode n4 = t.makeBT(null, 'A', null);
		//TreeNode n3 = t.makeBT(n6, '/', n7);
		//TreeNode n2 = t.makeBT(n4, '*', n5);
		//TreeNode n1 = t.makeBT(n2, '-', n3);
		
		TreeNode na = t.makeBT(null, 'A', null);
		TreeNode nc = t.makeBT(null, 'C', null);
		TreeNode nd = t.makeBT(null, 'D', null);
		TreeNode rm = t.makeBT(nc, '*', nd);
		TreeNode np = t.makeBT(na, '+', rm);
		
		
		System.out.printf("\nPreOrder : ");
		t.preorder(np);
		System.out.printf("\nInOrder : ");
		t.inorder(np);
		System.out.printf("\nPostOrder : ");
		t.postorder(np);
	}
}
