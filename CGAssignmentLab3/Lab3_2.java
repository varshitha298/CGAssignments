package lab3;
import java.util.Scanner;
public class Lab3_2 {
    public static String getimage(String str)
    {
    	StringBuffer sb = new StringBuffer(str);
    	sb.append("|");
    	StringBuffer s = new StringBuffer(str);
    	s.reverse();
    	sb.append(s);
    	return sb.toString();
    }
	public static void main(String[] args) {
		Lab3_2 res = new Lab3_2();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
        String str=sc.next();
        System.out.println(res.getimage(str));
	}

}
