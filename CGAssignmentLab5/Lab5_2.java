package lab5;

import java.util.Scanner;

public class Lab5_2 {
	String firstname;
	String lastname;
	public Lab5_2(String firstname, String lastname) {
		this.firstname=firstname;
		this.lastname=lastname;
	{
      if (firstname.length()==0 || lastname.length()==0)
      {
    	 try {
    		 throw new NameException(" first name and last name shouldn't be blank");
    		 
    	 }catch(NameException e) {
    		 e.printStackTrace();
    	 }
      }
    	  
	}
	
	}
	void display() {
		System.out.println("Employee name:"+this.firstname+" "+this.lastname);
	}
	public static void main(String[] args) {
		String firstname=null;
		String lastname=null;
		Scanner sc= new Scanner(System.in);
		System.out.println("firstname");
		String str1=sc.nextLine();
		System.out.println("lastname");
		String str2=sc.nextLine();
		Lab5_2 a= new Lab5_2(str1,str2);
		a.display();
		

	}

}
