package lab2;

import java.util.Arrays;

public class Lab2_3 {
	 public static int getSorted(int[] arr)
	    {
		    int[] result=new int[arr.length];
	    	for(int i=arr.length-1;i>=0;i--)
	    	{
	    		result[i]=arr[i];
	    	}
	    	Arrays.sort(result);
	    	return result[0];
	    }
	public static void main(String[] args) {
		int[] arr1= {4,5,3,6,2,7};
		System.out.println(getSorted(arr1));
		
		int[] arr2= {7,4,6,9,5};
	    System.out.println(getSorted(arr2));
	}

}
