package FatherChild;

public class Main {
	

	public static void main(String[] args) {
		
		Child a = new Child();
		Father b = new Child();
		
		a.method();   //child method
		System.out.println(a.name);   //child
		
		b.method();   //child method
		System.out.println(b.name);   //father

	}
	
}

