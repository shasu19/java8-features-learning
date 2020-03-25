package com.shasu19p.constructor;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import com.shasu19p.Employee;

/**
 * (args) -> new ClassName(args)
 * 
 * Example:
 * ClassName::new
 */
public class ConstructorNewRefExample01 {

	public static void main(String[] args) {

		 // lambda - supplier get method
        Supplier<Map<String,String>> obj1 = () -> new HashMap<>();   // default HashMap() constructor
        Map<String, String> map1 = obj1.get();
        
        // method reference
        //Supplier<Map<String,String>> obj2 = HashMap<String, String>::new; fine
        Supplier<Map<String,String>> obj2 = HashMap::new;
        Map<String, String> map2 = obj2.get();

        // lambda
		Supplier<Employee> obj3 = () -> new Employee("Sunil", "Hyderabad"); // default Invoice() constructor
        Employee employee = obj3.get();
        
        // method reference
        // Supplier<Employee> obj4 = Employee::new; // if default constructor exists
        
		EmployeeWithArgs empWithArgs = Employee::new;
		Employee obj4 = empWithArgs.createEmployee("Sunil", "Hyderabad");
		
		// another way
		Employee obj5 = ((EmployeeWithArgs) Employee::new).createEmployee("Sunil", "Hyderabad");
	}
	
	private static interface EmployeeWithArgs {
		public Employee createEmployee(String name, String address);
	}
}