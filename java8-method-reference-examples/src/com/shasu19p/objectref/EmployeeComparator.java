package com.shasu19p.objectref;

import com.shasu19p.Employee;

// comparator
// 1. based on name
// 2. based on address
public class EmployeeComparator {

	public int compareByName(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}

	public int compareByAddress(Employee o1, Employee o2) {
		return o1.getAddress().compareTo(o2.getAddress());
	}
}