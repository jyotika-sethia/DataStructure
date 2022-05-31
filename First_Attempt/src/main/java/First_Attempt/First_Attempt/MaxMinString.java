package First_Attempt.First_Attempt;

public class MaxMinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,87,9,143,50,1};
		int n =arr.length;
		System.out.println("The maximum number of array is"+MaxString(arr,n));
		System.out.println("The maximum number of array is"+MinString(arr,n));
		
	}

	 static int MinString(int[] arr, int n) {
		// TODO Auto-generated method stub
		int res =arr[0];
		for(int i=1;i<n;i++)
		
			res=Math.min(res,arr[i]);
			return res;
		
		
	}

	 static int MaxString(int[] arr, int n) {
		// TODO Auto-generated method stub
		int res =arr[0];
		for(int i =1;i<n;i++)
		
			res=Math.max(res,arr[i]);
			return res;
		
	}

}
