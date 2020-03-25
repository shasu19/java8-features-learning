package com.shasu19p.listtomap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  - Create Employee's list
 *  - COnvert to map using method reference
 * */
public class Java8ListToMapExample04 {

	public static void main(String[] args) {

		List<Employee> emps = Arrays.asList(
				new Employee("Subh", "Ahmedabad"), 
				new Employee("Golu", "Bhopal"),
				new Employee("Anil", "Raisen"), 
				new Employee("Sarvagya", "Hyderabad"));

		// create stream
		emps.stream()
				// create map
				.collect(Collectors.toMap(Employee::getName, Employee::getAddress))
				// iterate and print key and value
				.forEach((k, v) -> {
					System.out.println("Key: " + k + ",Value: " + v);
				});

	}

}