package lab3;

public class Lab3_5 {

	public static void main(String[] args) {
		String string = "varshitha";    
        int count = 0;    
            
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) != ' ')    
                count++;    
        }    
            
        System.out.println("characters in a string are: " + count);

	}

}
