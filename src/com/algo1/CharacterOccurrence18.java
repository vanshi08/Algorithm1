package com.algo1;

public class CharacterOccurrence18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabbbdsak";
        char ch = 'a'; 
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("The character '" + ch + "' appears " + count + " times in the given string '" + str + "'.");

	}

}
