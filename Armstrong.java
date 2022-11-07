package javaprogramms.logics;

import java.util.Scanner;

class Armstrong{  
	
	 public static void main(String args[]){  
	  int r,sum=0,temp; 
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter A Number");
	  
	  int num=sc.nextInt(); 
	  
	  temp=num;    
	  while(num>0){    
	   r=num%10;  //getting remainder  
	   sum=sum+(r*r*r);    
	   num=num/10;    
	  }    
	  if(temp==sum)    
	   System.out.println("Armstrong number ");    
	  else    
	   System.out.println("not Armstrong");    
	}  
	}  