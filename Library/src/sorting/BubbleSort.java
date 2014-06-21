package sorting;
/**
 * The Bubble Sort method
 * 
 * For every number, from the bottom to the top
 * It moves the small number to the top, until it meets a number larger than it.     
 * 
 * @author Jerry
 *
 */

public class BubbleSort {
	

	public int[] sort(int[] list){
		
		for(int i=0;i<list.length; i++){			
			for(int j=list.length-1; j>i; j--){
				if(list[j]<list[j-1]){
					int temp = list[j];
					list[j] = list[j-1];
					list[j-1] = temp;
				}
			}
		}
		return list;
	}
}


