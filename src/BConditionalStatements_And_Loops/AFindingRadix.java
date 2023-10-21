package BConditionalStatements_And_Loops;

import java.util.Scanner;

public class AFindingRadix {

	public static void main(String[] args) {
	    System.out.println("Enter String:");
	    Scanner sc= new Scanner(System.in);
	    String str= sc.nextLine();
	    if (str.matches("[01]+")) 
	    {
	    	System.out.println("binary");
	    }
	    else if (str.matches("[0-7]+"))
	    {
	    	System.out.println("octal");
	    }
	    else if (str.matches("[0-9]+"))
	    {
	    	System.out.println("decimal");
	    }
	    else if (str.matches("[0-9A-F]+"))
	    {
	    	System.out.println("hex");
	    }
	    else
	    {
	    	System.out.println("error");
	    }
	    
	}

}
