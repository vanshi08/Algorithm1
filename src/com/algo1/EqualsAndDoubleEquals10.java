package com.algo1;

public class EqualsAndDoubleEquals10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "String";
        String str2 = "String";
        String str3 = new String("String");

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

	}

}
