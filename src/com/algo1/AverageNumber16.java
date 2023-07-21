package com.algo1;

import java.util.Scanner;

public class AverageNumber16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int sum = 0, c;
		float avg;
		for (int i = 1; i <= n; i++) {
			System.out.print("Enter the " + i + " Number: ");
			c = sc.nextInt();
			sum = sum + c;
		}
		avg = sum / n;
		System.out.println("Average number : " + avg);

	}

}
