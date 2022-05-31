package First_Attempt.First_Attempt;

import java.util.Scanner;

public class PalindromeReccursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a name");
		String name= s.next();
				if(isPalindrome(name))
					System.out.println("It is a palindrome");
				else
					System.out.println("It is a palindrome");
					
	}

	 static boolean isPalindrome(String name) {
		// TODO Auto-generated method stub
		int n =name.length();
			if(n==0)
				return true;
			return isPalRec(name,0,n-1);
	}

	 static boolean isPalRec(String name, int i, int j) {
		// TODO Auto-generated method stub
		if(i==j)
			return true;
		
		if((name.charAt(i))!=(name.charAt(j)))
			return false;
		
		if(i>j+1)
			return isPalRec(name,i+1,j-1);
		return true;
	}

}
