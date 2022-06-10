package week9;

public class BSTTest {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.insertBST('G');
		bst.insertBST('H');
		bst.insertBST('B');
		bst.insertBST('N');
		bst.insertBST('J');
		bst.insertBST('Q');
		bst.insertBST('I');
		bst.insertBST('D');
		bst.insertBST('M');
		bst.insertBST('A');
		bst.insertBST('E');
		System.out.printf("\nBinary Search Tree");
		bst.printBST();
		System.out.print("Is There \"A\"? >>>");
		TreeNode p1 = bst.searchBST('A');
		if(p1 != null)
			System.out.printf("Search success!!! Searched key : %c\n", p1.data);
		else
			System.out.printf("Search fail!! There is no : %c\n", p1.data);
		
		TreeNode p2 = bst.searchBST('A');
		if(p1 != null)
			System.out.printf("Search success!!! Searched key : %c\n", p2.data);
		else
			System.out.printf("Search fail!! There is no : %c\n", p2.data);
	}

}
