package com.shasu19p;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortComparatorExample05 {

	public static void main(String[] args) {

		List<Employee> emps = Arrays.asList(
				new Employee("Subh", "Ahmedabad"), 
				new Employee("Golu", "Bhopal"),
				new Employee("Anil", "Raisen"),
				new Employee("Sarvagya", "Hyderabad"));
		
		//inline comparator
		Collections.sort(emps, (Comparator<Employee>) (o1, o2) -> o1.getName().compareTo(o2.getName()));
		
		System.out.println(emps);
	}
}