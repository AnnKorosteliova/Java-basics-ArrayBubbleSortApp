package main;

public class ArrayBubbleSortApp {

	public static void main(String[] args) {

		//int[] data = {-20, 0, 20, -50, 50};
		int[] data = {60, 0, 20, -50, 50};
		
		data = sort(data, false);
		
		for (int i : data) {
			System.out.print(i + "; ");
		}
		
	}
	
	public static int[] sort(int[] array, boolean desc) {
		int temp;
		boolean swapped;
		
		for(int j = 0; j < array.length-1; j++) {
			swapped = false;
			
			for(int i = 0; i < array.length-1; i++) {
								
				if(array[i] > array[i+1] && desc == false) {				
					temp = array[i];
					array[i] = array[i+1];					
					array[i+1] = temp;	
					swapped = true;
				} else if(array[i] < array[i+1] && desc == true) {
					temp = array[i];
					array[i] = array[i+1];					
					array[i+1] = temp;	
					swapped = true;				
				}
			}			
			if(!swapped) {
				break;
			}
		}
		return array;
	}

}
