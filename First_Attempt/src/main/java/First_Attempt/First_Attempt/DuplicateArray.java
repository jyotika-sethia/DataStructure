package First_Attempt.First_Attempt;

import java.util.ArrayList;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,1,2,3,2,4,8,2,3};
		int len=arr.length;

		findDup(arr,len);
	}

	 private static void findDup(int[] arr, int len) {
		// TODO Auto-generated method stub
		 boolean ifPresent=false;
			
			ArrayList<Integer> a1 =new ArrayList<Integer>();
			
			
			for(int i =0;i<len-1;i++) {
				for(int j=i+1;i<len;i++) {
					if(arr[i]==arr[j])
					{
						if(a1.contains(arr[i]))
						{
							break;
						}
						else
							a1.add(arr[i]);
						{
							ifPresent=true;
						}
					}
				}
			  }
			
			if(ifPresent==true)
			{
				System.out.println(a1+" ");
			}	
				else
			{
					System.out.println("There is no duplicate in array");
			}	
			}
}


