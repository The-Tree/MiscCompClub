
public class Palindrome {
	public static void main(String[] args) {
		for(int i = 0; i < args.length; i++) {
			System.out.println("1. " + args[i] + " T/F: " + palindromeCheck(0, args[i]));
			
		}
	}
	
	public static boolean palindromeCheck(int n, String str) {
		if( str.charAt(n) == str.charAt(str.length()-n-1) && n == str.length() / 2 ) {
			return true;
		}
		else if( str.charAt(n) != str.charAt(str.length()-n-1) ) {
			return false;
		}
		return palindromeCheck(n+1, str);
	}
}
