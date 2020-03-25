package com.shasu19p.foreach;

import java.util.Arrays;
import java.util.List;

/**
 * - Create simple string names list
 * - Print each name using normal for loop
 * */
public class NormalLoopingExample01 {

	public static void main(String[] args) {

		// create names string list
		List<String> names = Arrays.asList("Subh", "Anil", "Sunandni", "Vanshu", "Shanu", "Golu");

		// normal for loop, before java 8
		System.out.println("===== Normal for loop to iterate elements in list =====");
		for (String name : names) {
			System.out.println(name);
		}
		
		// normal for loop, before java 8
		System.out.println("===== Normal for loop to iterate elements in list (for loop with indexing style)=====");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
	}
}