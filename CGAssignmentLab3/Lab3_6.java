package lab3;
import java.util.Arrays;
public class Lab3_6 {
	 public static boolean AlphabaticOrder(String str) {
		int size = str.length();
		char[] chArray = new char[size];
		for (int i = 0; i < size; i++) {
			chArray[i] = str.charAt(i);
		}
		
		Arrays.sort(chArray);
		for (int i = 0; i < size; i++) {
		if (chArray[i] != str.charAt(i)) {

			return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {

		String str = "varshi";
		if (AlphabaticOrder(str)) {
			System.out.println("String is alphabetical order");
		} else 
		{
			System.out.println("String is not alphabetical order");
		}
	}
}
