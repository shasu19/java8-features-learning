package com.shasu19p.listtomap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8ListToMapExample02 {

	public static void main(String[] args) {

		List<Employee> emps = Arrays.asList(new Employee("Subh", "Ahmedabad"), new Employee("Golu", "Bhopal"),
				new Employee("Anil", "Raisen"), new Employee("Sarvagya", "Hyderabad"));

		Map<String, String> empsMap = emps.stream()
				.collect(Collectors.toMap((Employee e) -> e.getName(), (Employee e) -> e.getAddress()));
		empsMap.forEach((key, value) -> {
			System.out.println("Key:" + key + ", Value: " + value);
		});

	}

}