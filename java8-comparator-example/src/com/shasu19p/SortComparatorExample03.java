package com.shasu19p;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortComparatorExample03 {

	public static void main(String[] args) {

		List<Employee> emps = Arrays.asList(
				new Employee("Subh", "Ahmedabad"), 
				new Employee("Golu", "Bhopal"),
				new Employee("Anil", "Raisen"),
				new Employee("Sarvagya", "Hyderabad"));
		
		Comparator<Employee> comparator1 = (o1, o2) -> {
			return o1.getName().compareTo(o2.getName());
		};
		Collections.sort(emps, comparator1);
		
		System.out.println(emps);
	}
}