package com.shasu19p;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8MethodRefExample02 {

	// (args) -> ClassName.staticMethodName(args)
	public static void main(String[] args) {

		List<String> list = Arrays.asList("1", "2", "3");

		// anonymous class
		List<Integer> collect1 = list.stream()
					.map(new Function<String, Integer>() {
						@Override
						public Integer apply(String s) {
							return Integer.parseInt(s);
						}
		}).collect(Collectors.toList());
		System.out.println("===== collect 1 System.out::println=====");
		collect1.forEach(System.out::println);
		System.out.println("===== collect 1 ConsolePrinter::printMessage=====");
		collect1.forEach(ConsolePrinter::printMessage);

		// lambda expression
		List<Integer> collect2 = list.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		System.out.println("===== collect 2 System.out::println=====");
		collect2.forEach(System.out::println);
		System.out.println("===== collect 2 ConsolePrinter::printMessage=====");
		collect2.forEach(ConsolePrinter::printMessage);
		

		// method reference
		List<Integer> collect3 = list.stream().map(Integer::parseInt).collect(Collectors.toList());
		System.out.println("===== collect 3 System.out::println=====");
		collect3.forEach(System.out::println);
		System.out.println("===== collect 3 ConsolePrinter::printMessage=====");
		collect3.forEach(ConsolePrinter::printMessage);
	}
}