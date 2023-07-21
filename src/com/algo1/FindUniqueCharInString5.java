package com.algo1;

public class FindUniqueCharInString5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "mirror";
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i), s.indexOf(s.charAt(i)) + 1) == -1) {
                System.out.println(s.charAt(i));
            }
        }

	}

}
