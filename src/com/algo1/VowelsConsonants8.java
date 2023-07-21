package com.algo1;

public class VowelsConsonants8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     String str = "Java is object oriented programming language";

	     

	        str = str.toLowerCase();

	 

	        long vowels = str.chars().filter(ch -> (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')).count();

	 

	        long consonants = str.chars().filter(ch -> (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'))
	                .filter(ch -> (ch >= 'a' && ch <= 'z')).count();

	        System.out.println("Vowel : " + vowels);
	        System.out.println("Consonant : " + consonants);

	}

}
