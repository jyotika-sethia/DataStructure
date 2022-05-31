package First_Attempt.First_Attempt;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String name="Welcome";
		Scanner s= new Scanner(System.in);
		String rev=" ";
		char ch;
		System.out.println("Enter a name");
		String name=s.next();
		System.out.println("the orignal string is :"+name);
		
		for(int i=0;i<name.length();i++)
		{
			ch=name.charAt(i);
			rev=ch+rev;
			
		}
		System.out.println("The reverse is :"+rev);
		int num=name.length();
		for(int j =0;j<num;j++)
		{
		if(name.charAt(0)==name.charAt(num-1))
		{
			System.out.println("the first and last letter is same");
		}
		}
		
	}

}
