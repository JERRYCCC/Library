package sorting;
import java.util.Random;


/**
 * First, this method randomly pick an element from the list and swap it with the last element
 * then, it moves all the elements larger than the last element to the front, and the less to the back
 * then it put the "last" element into the middle
 * Then it re-do the above progress again on front part and back part separately again until the list sorted
 *  
 * 
 * @author Jerry
 *
 */

public class RandomizedQuickSort {
	
	public int[] sort(int[] newList){
		int[] list = newList;		
		quickSort(list, 0, list.length-1);
		
		return list;
	}
		
	public void quickSort(int[] list, int p, int r){
		if(p<r){
			
			Random random = new Random();
			int index = random.nextInt(r-p)+p;
			
			int temp = list[r];
			list[r]=list[index];
			list[index]=temp;
			
			int q = partition(list, p, r);
			quickSort(list, p, q-1);
			quickSort(list, q+1, r);
		}
	}
	
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
