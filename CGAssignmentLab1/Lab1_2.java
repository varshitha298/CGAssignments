package lab1;

public class Lab1_2 {
    public static int calculateDifference(int n)
    {
    	int diff = 0;
		int squareSum = 0;
		int sumSq = 0;
		for (int i = 1; i <= n; i++) {
			squareSum += i * i;
			sumSq += i;
		}
		sumSq = sumSq * sumSq;
		diff = Math.abs(squareSum - sumSq);
		return diff;
    }
	public static void main(String[] args) {
		System.out.println(calculateDifference(5));
	}

}
