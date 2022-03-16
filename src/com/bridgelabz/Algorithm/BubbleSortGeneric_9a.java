package com.bridgelabz.Algorithm;
import java.util.Arrays;

public class BubbleSortGeneric_9a<T extends Comparable<? super T>> {
	T[] array;
		BubbleSortGeneric_9a(T[] array){
			this.array = array;
		}
	  private T[] bubbleSort(){
	    for(int i = array.length; i > 1; i--){
	      for(int j = 0; j < i - 1; j++){    
	        if(array[j].compareTo(array[j+1]) > 0){					//if greater swap elements
	          swapElements(j, array);
	        	}
	      	  }            
    		}
	    	return array;
	  	}
	  private void swapElements(int index, T[] arr){
	    T temp = arr[index];
		    arr[index] = arr[index+1];
		    arr[index+1] = temp;        
	  	}
	  public static void main(String[] args) {
	    Integer[] intArr = {47, 85, 62, 34, 7, 10, 92, 106, 2, 54};
	    	BubbleSortGeneric_9a<Integer> bsg1 = new BubbleSortGeneric_9a<Integer>(intArr);
	    Integer[] sa1 = bsg1.bubbleSort();
	    		System.out.println("Sorted array- " + Arrays.toString(sa1));     
	    String[] strArr = {"Earl", "Robert", "Asha", "Arthur"};
	    	BubbleSortGeneric_9a<String> bsg2 = new BubbleSortGeneric_9a<>(strArr);
	    String[] sa2 = bsg2.bubbleSort();
	    		System.out.println("Sorted array- " + Arrays.toString(sa2));
	  }
}
