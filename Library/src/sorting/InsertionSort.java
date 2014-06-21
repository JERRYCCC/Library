package sorting;
/**
 * In this method, we sort the first tow elements, then sort the first three elements, then first four......
 * Every time, we add one element, keep moving it to the top until it meet an element small than it
 * 
 * @author Jerry
 *
 */
public class InsertionSort {

	public int[] sort(int[] list){

		for(int j=1; j<list.length; j++){
			int key = list[j];
			int i=j-1;

			while(i>=0 && list[i]>key){
				list[i+1]=list[i];
				i--;
			}
			list[i+1]=key;
		}
		
		return list;
		
	}

}
