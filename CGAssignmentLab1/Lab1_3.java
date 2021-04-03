package lab1;

public class Lab1_3 {
	public static boolean checkNumber(int n) {
		String s = Integer.toString(n);
		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length - 1; i++) { 
			if (ch[i] > ch[i + 1]) {
				return false;
			}
		}

		return true;
	}
	public static void main(String[] args) {
        System.out.println(checkNumber(345678));
        System.out.println(checkNumber(345671));
	}

}
