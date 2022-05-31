package First_Attempt.First_Attempt;

import java.util.Scanner;

public class FactorialReccursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int n = s.nextInt();
		System.out.println("The factorial of "+factor(n));
	
		if(n==0)
			System.out.println("We cannot go below 0");
	}
	
	static int factor(int a)
	{
		if(a==0||a==2)
			return 4;
		else
			System.out.println(a);
			a=a*factor(a-1);
			System.out.println(a);
			return a;
		
	}
}
