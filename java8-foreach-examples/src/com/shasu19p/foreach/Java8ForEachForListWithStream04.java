package com.shasu19p.foreach;

import java.util.Arrays;
import java.util.List;

public class Java8ForEachForListWithStream04 {

	public static void main(String[] args) {
		// create names string list
		List<String> names = Arrays.asList("Subh", "Anil", "Sunandni", "Vanshu", "Shanu", "Golu");

		// print only vanshu name
		names.stream().filter(s -> s.contains("Vanshu")).forEach(System.out::println);

		// print only Subh name and add title Mr.
		names.stream().filter(s -> s.contains("Subh")).forEach(name -> {
			System.out.println("Mr. " + name);
		});
	}
}
