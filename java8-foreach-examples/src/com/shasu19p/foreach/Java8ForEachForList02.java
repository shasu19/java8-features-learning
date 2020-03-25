package com.shasu19p.foreach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Java8ForEachForList02 {

	public static void main(String[] args) {
		// create names string list
		List<String> names = Arrays.asList("Subh", "Anil", "Sunandni", "Vanshu", "Shanu", "Golu");

		// Using anonymous class style
		Consumer<? super String> action = new Consumer<String>() {

			public void accept(String name) {
				System.out.println(name);
			};
		};
		System.out.println("==== Anonymous style =====");
		names.forEach(action);

		// Anonymous + lambda style
		System.out.println("==== Anonymous + Lambda style =====");
		Consumer<? super String> consumer2 = (name) -> System.out.println(name);
		names.forEach(consumer2);

		// Using lambda expression to do the same thing
		System.out.println("==== Only Lambda style =====");
		names.forEach(name -> System.out.println(name));

		// short hand way to do same as above, function referencing
		System.out.println("==== Lambda shorthand style =====");
		names.forEach(System.out::println);

		// short hand way to do same as above, function referencing
		System.out.println("==== Lambda shorthand style =====");
		names.forEach(System.out::println);

		// short hand way to do same as above, function referencing
		System.out.println("==== Lambda passing own static method reference =====");
		names.forEach(Java8ForEachForList02::printUsingStatic);

		// short hand way to do same as above, function referencing
		System.out.println("==== Lambda passing own non-static method reference =====");
		names.forEach(new Java8ForEachForList02()::printUsingNonStatic);
	}

	private static void printUsingStatic(String name) {
		System.out.println(name);
	}

	private void printUsingNonStatic(String name) {
		System.out.println(name);
	}
}
