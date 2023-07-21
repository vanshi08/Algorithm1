package com.algo1;

import java.util.Scanner;

public class PerfectNumber29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();//28
        int count = 0;
        for (int i = 1; i < num; i++) {
            if(num%i==0) {
                count +=i;
            }

        }
        if(count == num) {
            System.out.println("Perfect number");
        }
        else {
        	System.out.println("Not perfect number");
        }

	}

}
