package com.java.example;

public class BubbleSort {
	
	public static void main(String[]args) {
		
		int intArray[] = {10, -15, 55, 35, -22, 1, 105};
		
		int arrayLength = intArray.length;
		for(int j = 0; j < arrayLength; j++) {
			for(int i = 0; i < arrayLength; i++) {
				if(i != arrayLength) {
					swap(intArray, i);
				} else {
					arrayLength --;
				}
			}
		}
		for(int j = 0; j < arrayLength; j++) {
			System.out.println(intArray[j]);
		}
	}
	
	public static void swap(int[]intArray, int i) {
		
		if(i == intArray.length-1) {
			return;
		}
		int temp = intArray[i+1];
		if(intArray[i] > temp) {
			intArray[i+1] = intArray[i];
			intArray[i] = temp;
		}
	}
}
