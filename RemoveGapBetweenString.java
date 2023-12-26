package com.test.logics;

public class RemoveGapBetweenString {

	public static int removeSpace(char[] str) {
		int count = 0;

		for (int i = 0; i < str.length; i++) {
			if (str[i] != ' ') {
				str[count++] = str[i];
			}

		}
		return count;

	}
     public static void main(String[] args) {

		char str[] = "P r a v een Pustera123".toCharArray();
		int i = removeSpace(str);
		System.out.println(String.valueOf(str).subSequence(0, i));

//			String str="Praveen Kumar";
//			String result="";
//			for(int i=0;i<str.length();i++)
//			{
//				char ch=str.charAt(i);
//				if(!Character.isWhitespace(ch))
//				{
//					result+=ch;
//				}
//				
//			}
//			System.out.println(result);
//		}

//		String str = "Sharanya As Smile";
//		String result = "";
//
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			if (!Character.isWhitespace(ch)) {
//				result += ch;
//
//			}
//
//		}
//
//		System.out.println(result);
	}

}