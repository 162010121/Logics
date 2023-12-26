package com.test.logics;

import java.util.*;

public class RemoveDuplicate {
public static void main(String[] args) {
	
	List<Integer> listWithDuplicate=new ArrayList<>();
	
	listWithDuplicate.add(1);
	listWithDuplicate.add(2);
	listWithDuplicate.add(1);
	listWithDuplicate.add(3);
	listWithDuplicate.add(3);
	listWithDuplicate.add(4);

	

	List<Integer> listWithoutDuplicate=new ArrayList<>(new LinkedHashSet<>(listWithDuplicate));
	System.out.println("List With Duplicates:"+listWithDuplicate);
	
	System.out.println("List Without Duplicates:"+listWithoutDuplicate);

	
	
}
}
