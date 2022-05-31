package First_Attempt.First_Attempt;

import java.util.Scanner;

public class ReccursionNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int n;
//		int n=10;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		System.out.println("The recurrion function of n is");
		series(n);
		if(n<=0)
			System.out.println("We have reached max");
		
	}	
		static void series(int a)
		{
			if(a<=0)
				return;
//				System.out.println("We have reached max");
			
				System.out.print(" "+a);
				
			series(a-1);
		}

	

}
