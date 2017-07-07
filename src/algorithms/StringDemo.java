package algorithms;

public class StringDemo {

	public static void main(String[] args) {
		char[] charArray = {'k', 'i', 'r', 'a', 'n'};
		String palindrome = new String("kiran");
		int len = palindrome.length();
		System.out.println(len);
		System.out.println("palindrome is" + palindrome);

		String palindrome2 = new String("KIRAN");
		//int len1 = palindrome2.length();
		System.out.println("palindrome2 is " + palindrome2);
		
		char result = palindrome.charAt(2);
		System.out.println(result);

		int result1 = palindrome.compareTo(palindrome2);
		System.out.println(result1);
		//palindrome = palindrome.concat(palindrome2);
		System.out.println(palindrome); 
		String palindrome3 = " ";
		palindrome3 = palindrome3.copyValueOf(charArray, 1, 3);
		System.out.println(palindrome3); 
		boolean value,value1 ;
		value = palindrome2.endsWith("kiran");
		System.out.println(value);
		value1 = palindrome.equalsIgnoreCase(palindrome2);
		System.out.println(value1);
		System.out.println(palindrome.intern());


		
		 

	}
}
