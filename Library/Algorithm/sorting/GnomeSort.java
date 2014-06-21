package sorting;
/**
 * 
 * from the top to bottom, we compare the adjacent elements.
 * if list[i] <list[i-1], we swap them and check one step back, compare (original)list[i] and list[i-2]
 * sort the list from the top to end, move each element to the top until it meets a element that is smaller than it
 * @author Jerry
 *
 */
public class GnomeSort {
	
	public int[] sort(int[] list){
		
		int index=1;
		
		while(index<list.length){
			if(list[index]>=list[index-1]){
				index++;
			}else{
				int temp=list[index];
				list[index]=list[index-1];
				list[index-1]=temp;
				
				if(index>1)
					index--;
			}
		}
		return list;
	}
}
