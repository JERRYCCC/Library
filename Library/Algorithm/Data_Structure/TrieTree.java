package Data_Structure;


public class TrieTree {

	public static void main(String[] args) {

		Node root = new Node(" ".toCharArray()[0]);
		insertWord(root, "hello");
		insertWord(root, "hoo");
		insertWord(root, "heldam");
		
		char[] b = new char[100];
		displayTree(root, 0, b);
		
		System.out.println(searchWord(root, "hi"));
		System.out.println(searchWord(root, "heldam"));
		
	}
	
	static void displayTree(Node current, int level, char[] branch){
		
		if(current==null){
			return;
		}
		
		for(int i=0; i<current.links.length; i++){
			//System.out.println(current.letter);
			branch[level] = current.letter;
			displayTree(current.links[i], level+1, branch);
		}
		
		if(current.fullWord==true){
			for(int i=0; i<=level; i++){
				System.out.print(branch[i]);
			}
			System.out.println();	
		}
	}
	
	static boolean searchWord(Node root, String word){
		
		int wordSize = word.length();
		char[] letterList = word.toCharArray();
		Node current = root;
		
		for(int i=0; i<wordSize; i++){
			char letter = letterList[i];
			
			int j=0;
			if(contain(current,letter)==false){
				return false;
			}else{
				while(current.links[j].letter!=letter){
					j++;
				}
			}
			current = current.links[j];	
		}
		
		if(current.fullWord==true){
			return true;
		}
		return false;
		
	}

	static void insertWord(Node root, String word){

		int wordSize = word.length();
		char[] letterList = word.toCharArray();
		Node current = root;

		for(int i=0; i<wordSize; i++){	
			char letter = letterList[i];
			Node element = new Node(letter);

			int j=0;
			if(contain(current, letter)==false){
				while(current.links[j]!=null){
					j++;
				}
				current.links[j]=element;
			}else{
				while(current.links[j].letter!=letter){
					j++;
				}
			}
			current = current.links[j];	
		}
		current.fullWord = true;
	}

	static boolean contain(Node node, char letter){

		for(int i=0; i<node.links.length; i++){
			if(node.links[i]!=null){
				if(node.links[i].letter==letter){
					return true;
				}
			}
		}
		return false;
	}

	public static class Node{
		char letter;
		Node[] links;
		boolean fullWord;

		Node(char letter){
			this.letter = letter;
			links = new Node[26];
			this.fullWord = false;
		}
	}
}
