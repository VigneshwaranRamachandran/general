package com.basics;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = { 3, 60, 35, 2, 45, 320, 5 };
		int arr2[] = { 3, 60, 35, 2, 45, 320, 5 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {

			 for(int j=1; j < (arr.length-i); j++){  
                 if(arr[j-1] > arr[j]){  
                        //swap elements  
                        temp = arr[j-1];  
                        arr[j-1] = arr[j];  
                        arr[j] = temp;  
                } 
                 for (int k = 0; k < arr.length; k++) {
 					System.out.print(arr[k] + " ");
 				}
			}
			 
			 System.out.println();
		}

//last highest
		int high = 0;
		for (int i = 0; i < arr2.length; i++) {
			if (high < arr2[i]) {
				high = arr2[i];
			}
		}
		System.out.println();
		System.out.println(high);
		//second highest
		int high1 = 0;
		int high2 =0;
		for (int i = 0; i < arr2.length; i++) {
			if (high1 < arr2[i]) {
				high2=high1;
				high1 = arr2[i];
				
				
			}
			else if(high2<arr2[i]){
				high2=arr2[i];
				
			}
		}
		System.out.println(high1);
		System.out.println(high2);
		
		

	}
}
