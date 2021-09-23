package com.greatlearning.utility;

public class BinarySearch extends MergeSort{
    // public void searching(double array[], int searchKey){
	// 	sortArray (array, 0, array.length-1, 1);
	// 	searchValues(array, searchKey);
    // }
    public void searchValues(double array[], double searchKey){
		int firstIndex = 0;
		int lastIndex = array.length-1;
		int mid = (firstIndex+lastIndex)/2;
		boolean bool=false;
	
		while (firstIndex<=lastIndex){
			if (array[mid]==searchKey){
				System.out.println("Stock of value "+searchKey+" is present.");
				bool=true;
				break;
			}
			else if (array[mid]<searchKey){
				firstIndex = mid +1;
			}
            else 
                lastIndex = mid-1;
            mid = (firstIndex+lastIndex)/2;
		}
		if (bool == false)
			System.out.println("Value not found");
	}
}
