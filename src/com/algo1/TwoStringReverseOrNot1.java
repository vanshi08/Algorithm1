package com.algo1;

public class TwoStringReverseOrNot1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "capgemini";
        String s2 = "inimegpac";

 

        boolean flag = true;

 

        if (s1.length() != s2.length()) {
            flag = false;
        } else {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(s2.length() - i - 1)) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("reverse of each other");
        } else {
            System.out.println("not reverse of each other");
        }

	}

}
