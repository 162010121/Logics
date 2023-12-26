package com.test.logics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringDuplicate {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Name");
		String str = sc.nextLine();

		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : str.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);

			} else
				map.put(c, 1);

		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + "Occurs" + entry.getValue() + "Times");

			}

		}
		sc.close();

	}

}
