package com.shasu19p.objectref;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.shasu19p.Employee;

public class MethodReferenceWithObjectReference01 {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Subh", "Hyderabad"));
		employees.add(new Employee("Anil", "Sirsoda"));
		employees.add(new Employee("Sunandni", "Hyderabad"));
		employees.add(new Employee("Vanshu", "Vidisha"));

		// anonymous way
		employees.sort(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		System.out.println("==== anonymous way =====");
		System.out.println(employees);

		// lambda way
		employees.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
		System.out.println("==== lambda way =====");
		System.out.println(employees);

		// method reference way : object reference
		employees.sort(new EmployeeComparator()::compareByName);
		System.out.println("==== object method reference way : by name =====");
		System.out.println(employees);

		employees.sort(new EmployeeComparator()::compareByAddress);
		System.out.println("==== object method reference way : by address =====");
		System.out.println(employees);

		EmployeeComparator comparator = new EmployeeComparator();
		employees.sort(comparator::compareByAddress);
		System.out.println("==== object method reference way : create object and then pass =====");
		System.out.println(employees);

	}
}