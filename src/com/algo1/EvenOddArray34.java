package com.algo1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddArray34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List<Integer> list = Arrays.asList(11,44,2,6,4,7,9);
	        System.out.println(list);
	        System.out.println("Even number:");
	        list.stream().filter(n -> n%2 ==0).collect(Collectors.toList()).forEach(System.out::println);
	        System.out.println("Odd number:");

	        list.stream().filter(o -> o%2 !=0).collect(Collectors.toList()).forEach(System.out::println);

	}

}
