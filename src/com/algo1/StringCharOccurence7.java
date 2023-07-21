package com.algo1;

import java.util.HashMap;
import java.util.Map;

public class StringCharOccurence7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Capgemini";
        Map<Character, Integer> map = new HashMap<>();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                count = map.get(c);
                map.put(c, count + 1);
            } else {
                map.put(c, count);
            }
        }
        System.out.println(map);

	}

}
