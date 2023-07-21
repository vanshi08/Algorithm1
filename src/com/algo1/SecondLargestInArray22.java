package com.algo1;

public class SecondLargestInArray22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,5,6,3,3,3,2,3,5,0};
        int max = Integer.MIN_VALUE;
        int smax = 0;

 

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            }
        }
        System.out.println(smax);

	}

}
