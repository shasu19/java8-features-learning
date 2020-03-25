package com.shasu19p.listtomap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8ListToMapExample01 {

	public static void main(String[] args) {

		List<Employee> emps = Arrays.asList(new Employee("Subh", "Ahmedabad"), new Employee("Golu", "Bhopal"),
				new Employee("Anil", "Raisen"), new Employee("Sarvagya", "Hyderabad"));

		Function<Employee, String> keyMapper = new Function<Employee, String>() {

			@Override
			public String apply(Employee t) {
				return t.getName();
			}
		};

		Function<Employee, String> valueMapper = new Function<Employee, String>() {
			@Override
			public String apply(Employee t) {
				return t.getAddress();
			}
		};

		Map<String, String> empsMap = emps.stream().collect(Collectors.toMap(keyMapper, valueMapper));
		empsMap.forEach((key, value) -> {
			System.out.println("Key:" + key + ", Value: " + value);
		});

	}

}