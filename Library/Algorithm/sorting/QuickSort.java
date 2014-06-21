package sorting;
/**
 * This method moves all the elements larger than the last element to the front, and the less to the back
 * then it put the "last" element into the middle
 * Then it re-do the above progress again on front part and back part separately again until the list sorted
 *  
 * @author Jerry
 *
 */
public class QuickSort {
	
	public int[] sort(int[] newList){
		int[] list = newList;
		quickSort(list, 0, list.length-1);
		
		return list;
	}
	
	/*
	 * divide the list and redo the front part and back part again and again
	 */
	public void quickSort(int[] list, int p, int r){
		if(p<r){
			int q = partition(list, p, r);
			quickSort(list, p, q-1);
			quickSort(list, q+1, r); 
		}
	}
	
	/*
	 * compare every element in the list to the last element
	 * if it is larger, no change, and include it into the back part
	 * if it is less, then swap it with the first element of the back part, and include it into the front part
	 */
	public int partition(int[] list, int p, int r){
		int x=list[r];
		int i=p-1;
		for(int j=p; j<=r-1; j++){
			if(list[j]<=x){
				i++;
				int temp = list[j];
				list[j]=list[i];
				list[i]=temp;
			}
		}
		int temp = list[r];
		list[r] = list[i+1];
		list[i+1] = temp;
		return i+1;
	}
}
