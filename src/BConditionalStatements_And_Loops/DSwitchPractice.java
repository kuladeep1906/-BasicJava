//Display type of website

package BConditionalStatements_And_Loops;

import java.util.Scanner;

public class DSwitchPractice {

	public static void main(String[] args) {
		System.out.println("Enter website:");
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		
		switch(str.substring(str.lastIndexOf(".")+1))
		{
		case "com": System.out.println("commercial website");
		     break;
		case "org": System.out.println("organizational website");
	     break;
		case "net": System.out.println("network website");
	     break;
		case "in": System.out.println("indian website");
	     break;
		case "ca": System.out.println("canadian website");
	     break;
	     default: System.out.println("enter correct site");
	     break;
	    	 
	     
		 
		
		
		
		
		}
	}

}
