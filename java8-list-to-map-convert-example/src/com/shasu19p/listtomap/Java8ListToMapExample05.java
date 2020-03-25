package com.shasu19p.listtomap;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

/**
 *  - Create Employee's list
 *  - list having employee key as duplicate
 *  - COnvert to map using method reference
 * */
public class Java8ListToMapExample05 {

	public static void main(String[] args) {

		List<Employee> emps = Arrays.asList(
				new Employee("Subh", "Ahmedabad"), 
				new Employee("Golu", "Bhopal"),
				new Employee("Anil", "Raisen"), 
				new Employee("Anil", "Sirsoda"), 
				new Employee("Sarvagya", "Hyderabad"));

		// createDupicateKeyIssue
		// uncomment and try issue 
		// createDupicateKeyIssue(emps);
		
		//with anonymous duplicate resolver
		createDupicateKeyIssueFix1(emps);
		
		//with lambda duplicate resolver
		createDupicateKeyIssueFix2(emps);

	}
	
	private static void createDupicateKeyIssue(List<Employee> emps) {
		// create stream
		emps.stream()
				// create map
				.collect(Collectors.toMap(Employee::getName, Employee::getAddress))
				// iterate and print key and value
				.forEach((k, v) -> {
					System.out.println("Key: " + k + ",Value: " + v);
				});
	}
	
	private static void createDupicateKeyIssueFix1(List<Employee> emps) {

		// Binary operator extends BiFunction (apply R,T)
		BinaryOperator<String> duplicateResolver = new BinaryOperator<String>() {

			public String apply(String oldValue, String newValue) {
				return oldValue;
			}
		};

		// create stream
		emps.stream()
				// create map
				.collect(Collectors.toMap(Employee::getName, Employee::getAddress, duplicateResolver))
				// iterate and print key and value
				.forEach((k, v) -> {
					System.out.println("Key: " + k + ",Value: " + v);
				});
	}
	
	private static void createDupicateKeyIssueFix2(List<Employee> emps) {
		
		// create stream
		emps.stream()
		// create map
		.collect(Collectors.toMap(Employee::getName, Employee::getAddress, (oldValue, newValue) -> oldValue))
		// iterate and print key and value
		.forEach((k, v) -> {
			System.out.println("Key: " + k + ",Value: " + v);
		});
	}

}