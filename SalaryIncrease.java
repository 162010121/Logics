 package com.test.logics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SalaryIncrease {

	public static void main(String[] args) {
		
		
		List<Double> salaries = Arrays.asList(18000.0, 22000.0, 25000.0, 30000.0);

        // Use Streams to increase the salary by 10% if it's above 20,000
//        List<Double> updatedSalaries = salaries.stream()
//                .map(salary -> salary < 20000.0 ? salary * 1.10 : salary)
//                .collect(Collectors.toList());
		
		List<Double> updateSalary=salaries.stream()
				.map(salary -> salary < 20000.0 ? salary * 1.10: salary)
				.collect(Collectors.toList());
		
		System.out.println(updateSalary);
	}

}
