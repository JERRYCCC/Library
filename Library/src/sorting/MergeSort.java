package sorting;
/**
 * 1. Divide the list and then conquer
 * 2. sorted every two elements into a list
 * 3. sorted every two sorted list of two elements
 * 4. sorted every two sorted list of four elements
 * ......
 * n. sorted two sorted lists into a list 
 * @author Jerry
 *
 */
public class MergeSort {
	
	public int[] sort(int[] list){
		
		int[] newList = this.mergeSort(list, 0, list.length-1);
		
		return newList;
		
	}

	/*
	 * input the begin and end of a list
	 * dived input list into two part and sort separately
	 */
	public int[] mergeSort(int[] list, int left, int right){
		
		if(list.length==1){
			return list;
		}
		if(left<right){
			int mid=(left+right)/2;		
			this.mergeSort(list, left, mid);		
			this.mergeSort(list, mid+1, right);
			this.merge(list, left, mid, right);
		}
		return list;
	}

	/*
	 * merge two sorted lists together
	 * compare the top elements of the two lists(top is the largest elements)
	 * pop the larger element into an output list
	 * then, compare again
	 * 
	 */
	public void merge(int[] list, int left, int mid, int right){

		int x=mid-left+1;
		int y=right-mid;
		int[] L = new int[x+1];
		int[] R = new int[y+1];


		for(int i=0; i<x; i++){
			L[i] = list[left+i];
		}
		for(int j=0; j<y; j++){
			R[j] = list[mid+1+j];
		}

		L[x]= Integer.MAX_VALUE;
		R[y]= Integer.MAX_VALUE;

		int i=0;
		int j=0;

		for(int k=left; k<right+1; k++){
			if(L[i]<=R[j]){
				list[k]=L[i];
				i++;
			}else{
				list[k]=R[j];
				j++;
			}
		}	
	}
}
