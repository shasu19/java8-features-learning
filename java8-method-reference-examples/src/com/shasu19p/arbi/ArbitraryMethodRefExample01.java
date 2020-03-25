package com.shasu19p.arbi;

import java.util.Arrays;
import java.util.Comparator;

/**
 * mkyong site learning example
 * 
 * arg0 is the first argument (arg0, rest_of_args) ->
 * arg0.methodName(rest_of_args)
 * 
 * example, assume a and b are String (a, b) -> a.compareToIgnoreCase(b)
 */
public class ArbitraryMethodRefExample01 {

	public static void main(String[] args) {

		String[] stringArray = { "Subh", "Anil", "Vanshu", "Bandhu", "Kuber", "Manish", "David", "Navin" };

		System.out.println("===== anonymous way =====");
		Comparator<String> comp = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		};
		Arrays.sort(stringArray, comp);
		System.out.println(stringArray);
		
		System.out.println("===== lambda expression way =====");
		Arrays.sort(stringArray, (s1, s2) -> s1.compareTo(s2));
		System.out.println(stringArray);

		Arrays.sort(stringArray, String::compareToIgnoreCase);
		System.out.println("===== method reference way =====");
		System.out.println(stringArray);

	}
}