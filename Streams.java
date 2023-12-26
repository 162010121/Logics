package com.test.logics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {

		/*
		 * List<Integer> number=Arrays.asList(1,2,3,4,5,6); number.stream().filter(n ->
		 * n %2 == 0).forEach(System.out::println);
		 * 
		 * List<Integer> num=Arrays.asList(1,2,3,4,5,6,7); num.stream().filter(n -> n
		 * %2!=0).forEach(System.out::println);
		 */

//		List<String> list1=Arrays.asList("Praveen","Mahesh");
//		list1.stream().filter(s ->s .contains("e")).forEach(System.out::println);

		/*
		 * List<String> list=new ArrayList<>(); Collections.addAll(list, "Praveen",
		 * "Mahesh", "Sugunavathi", "Yesu", "Smile"); List<String>
		 * fil=list.stream().filter(str ->
		 * str.contains("M")).sorted().collect(Collectors.toList());
		 * System.out.println(fil);
		 */

		/*
		 * String[] names1 = { "Praveen", "Mahesh", "Sugunavathi", "Yesu", "Smile" };
		 * Stream.of(names1).sorted().forEach(System.out::println);
		 */

//		List<Integer> list = new ArrayList<>();
//		Collections.addAll(list, 1, 2, 3, 4, 5, 6, 1, 2, 4, 4, 6, 4, 7);
//		Set<Integer> set = new HashSet<>();
//		List<Integer> duplicate = list.stream().filter(num -> set.add(num)).collect(Collectors.toList());
//		System.out.println("List With Duplicates Values" + list);
//		System.out.println("List Without Duplicates Values" + duplicate);
		
		
		List<Integer> list=new ArrayList<>();
		Collections.addAll(list, 1, 2, 3, 4, 5, 6, 1, 2, 4, 4, 6, 4, 7);
		Set<Integer> set=new HashSet<>();
		List<Integer> duplicate=list.stream().filter(num -> set.add(num))
				.collect(Collectors.toList());
		System.out.println("List With Duplicate"+list);
		System.out.println("List Without Duplicate"+duplicate);
		
		

		
//		  String str = "Praveen Praveen Madhu Sugunavathi Smile";
//		  
//		  Map<String, Long>
//		  result=Arrays.stream(str.split("")).map(String::toUpperCase)
//		  .collect(Collectorss.groupingBy(s ->
//		  s,LinkedHashMap::new,Collectors.counting() )); System.out.println(result);
//		 

//		  List<Integer> list=new ArrayList<>();
//		  Collections.addAll(list, 1,2,3,4,5,1,3,4,2);
//		  Set<Integer> set=new HashSet<>();
//		  
//		List<Integer>  withDuplicate=list.stream().filter(num -> set.add(num)).collect(Collectors.toList());
//		System.out.println("List With Duplicate"+list);
//		System.out.println("List Without Duplicate"+withDuplicate);

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		
		String str=sc.nextLine();
		
		  
//		Map<String, Long> result=Arrays.stream(str.split(""))
//				.map(String::toUpperCase)
//				.collect(Collectors.groupingBy(s -> s,LinkedHashMap::new,Collectors.counting()));
//		System.out.println(result);
		
		Map<String, Long> result=Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(dup -> dup, LinkedHashMap::new,Collectors.counting()));
			System.out.println(result);
		  

	}
}
