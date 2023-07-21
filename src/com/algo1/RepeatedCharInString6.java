package com.algo1;

public class RepeatedCharInString6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "eminem";
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                    s = s.substring(0, j) + '.' + s.substring(j + 1);
                }
            }
            if (count > 1 && s.charAt(i) != '.') {
                System.out.println(s.charAt(i));
            }
        }

	}

}
