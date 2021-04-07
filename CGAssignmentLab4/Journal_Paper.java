package lab4;
import java.util.*;
public class Journal_Paper extends WrittenItem{
	private int year;

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	Scanner sc=new Scanner(System.in);
	public Journal_Paper()
	{
		super();
		System.out.println("Enter the year:");
		setYear(sc.nextInt());
	}
	public void print()
	{
		super.print();
	System.out.println("Year is:"+getYear());	
	}
}
