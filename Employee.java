package com.test.logics;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import lombok.Data;

@Data
public class Employee {
	private String name;
	private double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	 public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee("John Doe", 50000), 
				new Employee("Jane Doe", 60000),
				new Employee("Jim Smith", 70000), 
				new Employee("Jill Johnson", 80000));

		// Find the Employee with the Employee salary
		Optional<Employee> employee = employees.stream()
				.max((emp1, emp2) -> Double.compare(emp1.getSalary(), emp2.getSalary()));
		System.out.println(employee);

		 employees.stream().filter(num -> num.salary > 50000).forEach(System.out::println);

		Double secondHighestSalary = 
				employees.stream()
				.map(Employee::getSalary)
				.distinct()
				.sorted((e1, e2) -> 
				Double.compare(e1, e2)).skip(3).findFirst().orElseThrow(null);

		System.out.println(secondHighestSalary);

	}

}
