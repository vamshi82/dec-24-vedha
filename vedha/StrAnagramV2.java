package vedha;
import java.util.Scanner;
public class StrAnagramV2 {
	public static void main(String[] args) {
		//Java Program To Check Whether Two Strings Are Anagram
		// listen
		// silent
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 2 strings");
		String str1 = sc.next();
		String str2 = sc.next();
		sc.close();
		
		char eachCh = ' ';
		boolean isAnagram = true;
		if(str1.length() == str2.length()) {
			for(int i=0;i<str1.length();i++) {
				eachCh = str1.charAt(i);
				if(isCharThere(str2,eachCh) == false) {
					isAnagram = false;
					break;
				}// if
				
			}// for
				
		}//if
		else {
			isAnagram = false;
		}
		
		if(isAnagram == true) System.out.println("Yes it is Anagram");
		else System.out.println("Not Anagram");
	}

	private static boolean isCharThere(String str2, char eachCh) {
		
		char localCh = ' ';
		for(int i=0;i<str2.length();i++) {
			localCh = str2.charAt(i);
			if(localCh == eachCh) {
				return true;
			}
		}
		
		
		return false;
	}

}
