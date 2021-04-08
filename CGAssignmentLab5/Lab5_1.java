package lab5;

import java.util.Scanner;

public class Lab5_1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int a=sc.nextInt();
		
			try {
				if(a<15)
					throw new AgeException("age should be above 15");
				else {
					System.out.println("valid age");
				}
				
			}catch(AgeException e) {
				System.out.println(e);
				e.getStackTrace();
			}
	}

}
