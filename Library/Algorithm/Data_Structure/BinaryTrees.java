package Data_Structure;

public class BinaryTrees {

	public static Node root;

	public static void main(String[] args) {

		root = null;
		root = insertNode(root, 9);
		root = insertNode(root, 7);
		root = insertNode(root, 11);
		root = insertNode(root, 4);
		root = insertNode(root, 8);
		root = insertNode(root, 5);
		root = insertNode(root, 2);
		root = insertNode(root, 1);
		root = insertNode(root, 3);
		root = insertNode(root, 10);
		root = insertNode(root, 14);
		root = insertNode(root, 13);
		Node result = searchNode(root, 3);
		System.out.println(result.getValue());
		System.out.println("===========================");
		Display(root);
	}


	public static class Node{

		private Node left;
		private Node right;
		public int value;

		public Node (int newValue){
			left = null;
			right = null;
			value = newValue;
		}
		public Node getLeft(){
			return left;
		}
		public Node getRight(){
			return right;
		}
		public int getValue(){
			return value;
		}
	}

	public static void Display(Node current){
		if(current==null){
			return;
		}
		//System.out.println(current.getValue());	//pre-order; printout when first time meet
		Display(current.getLeft());
		//System.out.println(current.getValue());	//in-order; printout when go to a number larger(switch from left to right)
		Display(current.getRight());
		//System.out.println(current.getValue());	//post-order; printout finish printing all its children nodes, leaving this branch
	}
	public static Node insertNode(Node current, int newNumber){

		Node newNode = new Node(newNumber);

		if(current == null){
			current = newNode;   //if empty, put the newNode into this spot
			return current;  		
		}else{ 					   // if the spot is not empty, then we compare the newNode value and the spot value
			if(newNumber<current.getValue()){
				current.left = insertNode(current.getLeft(), newNumber);  //if smaller, go to the spot's left child (compare first)
			}else{
				current.right = insertNode(current.getRight(), newNumber);  //if higher, go to the spot's right child
			}
			return current;
		}
	}

	public static Node searchNode(Node current, int key){

		if(current.getValue() == key){
			System.out.println("Found");
			return current;	
		}else if(current.getValue()>key){
			System.out.println("Search:" + current.getValue() + " Go Left");
			current = searchNode(current.getLeft(), key);
		}else if(current.getValue()<key){
			System.out.println("Search: " + current.getValue() + " Go Right");
			current = searchNode(current.getRight(), key);
		}else{
			System.out.println("Cannot find");
			return null;
		}
		return current;	
	}
	
}




