package lab3;

import java.util.Scanner;

public class Lab3_4 {

	public static int modifyNumber(int number1) {
		StringBuffer sb = new StringBuffer();
		String str = Integer.toString(number1);
		for (int i = 0; i < str.length() - 1; i++) 
		{
			int x = (int) (str.charAt(i) - str.charAt(i + 1));
			sb.append(Math.abs(x));
		}
		sb.append((int) Math.abs(str.charAt(str.length() - 1) - str.charAt(0)));
		return Integer.parseInt(sb.toString());

	}

	public static void main(String[] args) {

		 Lab3_4 p = new Lab3_4();
		 Scanner s = new Scanner(System.in);
	        System.out.println("Enter number");
	        int a = s.nextInt();
	        System.out.println(p.modifyNumber(a));

}
}