package com.shasu19p.listtomap;

import java.util.Arrays;
import java.util.List;

/**
 *  - Create Employee's list
 *  - Iterate each why use here map? Think.
 * */
public class Java8ListToMapExample03 {

	public static void main(String[] args) {

		List<Employee> emps = Arrays.asList(new Employee("Subh", "Ahmedabad"), new Employee("Golu", "Bhopal"),
				new Employee("Anil", "Raisen"), new Employee("Sarvagya", "Hyderabad"));

		emps.stream().map(Employee::getName).forEach((value) -> {
			System.out.println("Value: " + value);
		});

	}

}