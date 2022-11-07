package javaprogramms.logics;

public class ReverseString {

	public static void main(String[] args) {

		String s = "Praveen";

		System.out.println(s.length());
		System.out.println(s.charAt(3));
		System.out.println(s.hashCode() );
		System.out.println(s.toString());

		String s1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {

			s1 = s1 + s.charAt(i);

		}

		System.out.println("Original String" + " " + s);
		System.out.println("Reverse String" + " " + s1);

	}

}
