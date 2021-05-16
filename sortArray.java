package learnJava;

import java.util.Arrays;

public class sortArray {

	public static void main(String[] args) {
	String[] arr = {"1",	"14",	"100",	"3",	"38",	"425",	"6",	"82"};	
	int size = arr.length;  
	int [] numarr = new int [size];
    for(int i=0; i<size; i++) {
       numarr[i] = Integer.parseInt(arr[i]);
    }
    
	//logic for sorting   
	for(int i = 0; i<size; i++)   
	{  
	for (int j = i+1; j<size; j++)   
	{  
	//compares each elements of the array to all the remaining elements  
	if(numarr[i]>numarr[j])   
	{  
	//swapping array elements  
	int temp = numarr[i];  
	numarr[i] = numarr[j];  
	numarr[j] = temp;  
	}  
	}  
	}  
	//prints the sorted array in ascending order  
	System.out.println(Arrays.toString(numarr));  
	}   
	}