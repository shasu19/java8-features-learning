package com.shasu19p;

import java.util.Arrays;
import java.util.List;

public class Java8MethodRefExample01 {

	// (args) -> ClassName.staticMethodName(args)
	public static void main(String[] args) {

		List<String> list = Arrays.asList
				("Subh", "Sunil", "Sunil Sharma");
		
		// static method of console printer
		// calling static method in lambda style
		System.out.println("==== Lambda way to print data =====");
		list.forEach(name -> ConsolePrinter.printMessage(name));
		
		System.out.println("==== method reference =====");
		list.forEach(ConsolePrinter::printMessage);

	}
}