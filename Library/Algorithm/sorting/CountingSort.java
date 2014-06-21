package sorting;
/**
 * The method count how many times that every same elements appear in the list.
 * Then move them to a new list in orders
 * 
 * @author Jerry
 *
 */

public class CountingSort {

		public int[] sort(int[] newList){
			int[] list = newList;
			int[] outList = new int[list.length];
			int max = list[0];

			//find out the largest element in the list
			for(int i=0; i<list.length; i++){
				if(list[i]>max){
					max = list[i];
				}
			}	
			countingSort(list, outList, max);		
			return outList;
		}
			
		public void countingSort(int[] list, int[] outList, int max) {
			
			
			int[] countList = new int[max+1];
			
			//initial the countList
			for(int i=0; i<=max; i++){
				countList[i]=0;
			}
			
			//count the times of each elements appear in the list
			//put the "times" into element's index spot of the countList
			for(int j=0; j<=list.length-1; j++){
				countList[list[j]] = countList[list[j]]+1;
			}
			
			//sum the total elements before a certain spot in the list
			for(int i=1; i<=max; i++){
				countList[i] = countList[i]+countList[i-1];
			}
			
			//sorting; put the result in to the right spot of outList
			for(int j=list.length-1; j>=0; j--){
				outList[countList[list[j]]-1] = list[j];
				countList[list[j]] = countList[list[j]] - 1;
			}		
		}
}
