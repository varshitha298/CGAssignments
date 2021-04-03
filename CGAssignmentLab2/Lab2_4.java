package lab2;

import java.util.Arrays;

public class Lab2_4 {
    public static int modifyArray(int[] arr,int n)
    {
    	if(n==0 || n==1)
    	{
    		return n;
    	}
    	int[] temp = new int[n];
    	int j=0;
    	for(int i=0;i<n-1;i++)
    	{
    		if(arr[i]!=arr[i+1])
    		{
    			temp[j++]=arr[i];
    		}
    	}
    	temp[j++]=arr[n-1];
    	for(int i=0;i<j;i++)
    	{
    		arr[i]=temp[i];
    	}
    	return j;
    }
	public static void main(String[] args) {
		int arr[]= {1,2,5,1,6,2};
		Arrays.sort(arr);
		int length=arr.length;
		length = modifyArray(arr,length);
		for(int i=0;i<length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}