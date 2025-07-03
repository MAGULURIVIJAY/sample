package com.collectionsexce;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] s1 = s.split(" ");
		Map<String, Integer> m = new HashMap<>();
		for (String word : s1) {
			if (m.containsKey(word)) {
				m.put(word, m.get(word) + 1);
			} else {
				m.put(word, 1);
			}
		}
		System.out.println(m);
		sc.close();
	}

	
}
