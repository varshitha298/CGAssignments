package lab2;

import java.util.Arrays;

public class Lab2_1 {
    public static int getSecondSmallest(int[] arr)
    {
    	Arrays.sort(arr);
    	return arr[1];
    }
	public static void main(String[] args) {
		int[] arr1 = {2,3,4,5,6,7,1};
		int b = getSecondSmallest(arr1);
		
		int[] arr2 = {13,33,42,57,26,69,71};
		int a = getSecondSmallest(arr2);
		
		System.out.println("second smallest element:" +a);
		System.out.println("second smallest element:" +b); 
	}
}
