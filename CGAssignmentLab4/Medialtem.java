package lab4;
import java.util.*;
public class Medialtem extends Item{
	private int runtime;
	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	Scanner sc=new Scanner(System.in);
	public Medialtem()
	{
		super();
		System.out.println("Enter runtime:");
		setRuntime(sc.nextInt());
	}
	void print()
	{
		super.print();
		System.out.println("Runtime is:"+getRuntime());
	}
}
