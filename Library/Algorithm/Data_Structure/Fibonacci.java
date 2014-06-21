package Data_Structure;

public class Fibonacci {
	
	//1, 1, 2, 3, 5, 8, 13, 21

	public static void main(String[] args) {
		
		System.out.println(fib(8)); // print out the sixth fibonacci number 

	}
	
	public static int fib(int n){
		if(n<=1){
			return n;
		}else{
			return fib(n-1)+fib(n-2);
		}
	}
}
