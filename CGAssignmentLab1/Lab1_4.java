package lab1;

public class Lab1_4 {
		public static boolean checkNumber(int n) {
			if(n<=0)
				{
				return false;
				}
			while(n%2==0) {
				n=n/2;
			}
			return n==1;
		}
	public static void main(String[] args) {
		System.out.println(checkNumber(16));
	}
}
