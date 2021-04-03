package lab2;
import java.util.Arrays;
public class Lab2_2 {
    public static String[] sortString(String[] arr)
    {
    	Arrays.sort(arr);
    	return arr;
    }
	public static void main(String[] args) {
		String[] arr1 = {"varshitha","sagar","priya"};
		System.out.println(Arrays.toString(sortString(arr1)));
	}

}
