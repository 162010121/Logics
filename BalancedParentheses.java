package com.test.logics;

import java.util.Scanner;
import java.util.Stack;


public class BalancedParentheses {

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false; // Unmatched closing parenthesis
            }
        }

        return stack.isEmpty(); // If s{tack is empty, all parentheses are balanced
    }

    public static void main(String[] args) {
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Expressions");
    	String expression=sc.nextLine();
    	
        
        System.out.println(expression + " is balanced: " + isBalanced(expression));
        
        sc.close();
    }
	
	
}
