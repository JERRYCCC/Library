package sorting;
/**
 * this method sorts the elements by one digit to one digit
 * we put all the first digit of the elements into an list, and sorted it,
 * then get the second digit of the elements and sorted it
 * keep going until the largest digit
 * 
 * @author Jerry
 *
 */


public class RadixSort {
	
	
	/*
	 * here we find the largest element and find out how many digits it has
	 */
	public int[] sort(int[] newList){
		int[] list = newList;
		int d;
		int max=list[0];
		
		for(int i=0; i<list.length; i++){
			if(list[i]>max){
				max = list[i];
			}
		}
		
		d = Integer.toString(max).length();
		
		radixSort(list, d);
		
		return list;
	}
	
	/*
	 * we get the first digit, and sort the list based on first digit, 
	 * then we sort the list based on second digit
	 * ......
	 */
	public void radixSort(int[] list, int d){
		
		int[][] A = new int[list.length][d];
		for(int i=0; i<list.length; i++){
			for(int j=0; j<d; j++){
				int key = list[i]%(int)(Math.pow(10, j+1));
				key = key/(int)(Math.pow(10, j));
				A[i][j]=key;	
			}
		}
				
		for(int j=0; j<d; j++){
			
			for(int i=0; i<list.length; i++){
				
				for(int k=list.length-1; k>i; k--){
					
					if(A[k][j]<A[k-1][j]){					
						
						int temp = list[k];
						list[k] = list[k-1];
						list[k-1]= temp;
												
						for(int index=0; index<d; index++){
							int tmp = A[k][index];
							A[k][index] = A[k-1][index];
							A[k-1][index] = tmp;
						}							
					}					
				}	 
			}
		}
	}
}
