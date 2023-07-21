package com.algo1;

public class Power3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4;
        int pow = 3;
        int result = 1;

 

        while (pow > 0) {
            result *= num;
            pow--;
        }

 

        System.out.println(result);

	}

}
