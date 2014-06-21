package sorting;
/**
 * The method divide the list and bubble the largest element to the top of the tree
 * then, it switch the top element(largest) with the bottom elements.
 * get rid of the bottom elements(largest)
 * and divide the list again and bubble the largest element to the top of the tree 
 * until all elements are sorted
 * 
 * @author Jerry
 *
 */

public class HeapSort {
	
	public int[] sort(int[] newlist){
		
		int[] list = this.BuildMaxHeap(newlist); //move the largest element to the list top
		int[] outList = new int[list.length];
		for(int i=list.length-1; i>=0; i--){
			outList[i]=list[0];  // save the largest number the outcome list
			list[0] = list[i];	// switch the top element and bottom element of the list	
			int[] tempList = new int[i]; //build a new list which is one spot less than the original list
			
			//copy all the elements from the original list
			for(int j=0; j<i; j++){
				tempList[j] = list[j];
			}		
			tempList = this.MaxHeapify(tempList, 0); //move the largest element to the top
			
			//copy all elements back to the original list, which the largest element is on the top
			for(int j=0; j<i; j++){
				list[j] = tempList[j];
			}			
		}		
		return outList;
	}
	
	/*
	 * build a maxHeap Tree in which, in all nodes, all parents are larger than their children
	 */
	public int[] BuildMaxHeap(int[] list){
		
		for(int i=list.length/2-1; i>=0; i--){
			list = MaxHeapify(list, i); 
		}	
		return list;
	}
	
	/*
	 *check and make sure the parent are larger than their kids.
	 *if not, pick the larger kid and swap with the parent, then check if the kid node(down from parent) is larger than its kids
	 *if not, repeat above 
	 */
	public int[] MaxHeapify(int[] list, int i){
		int left = 2*i+1;
		int right = 2*i+2;
		int largest = i;
			
		if(left<list.length && list[left]>list[i]){
			largest = left;
		}
	
		if(right<list.length && list[right]>list[largest]){
			largest = right;
		}
		
		if(largest!=i){
			int temp = list[i];
			list[i]=list[largest];
			list[largest]= temp;
			this.MaxHeapify(list, largest);	
		}	
		return list;
	}	
}
