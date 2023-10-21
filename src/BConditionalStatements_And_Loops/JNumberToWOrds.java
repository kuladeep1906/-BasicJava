//Display numbers in words even with tailing zeroes


package BConditionalStatements_And_Loops;

import java.util.Scanner;

public class JNumberToWOrds {

	public static void main(String[] args) {
		System.out.println("enter a number:");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int temp=n,rem=0; String str="";
		for (int i=0;temp>=1;i++)
		{			
			rem= temp%10;
			temp=temp/10;
			str= str+ rem;
		}
		System.out.println(str);
		for (int i=str.length()-1;i>=0;i--)
		{
		  char j=str.charAt(i);
		//  System.out.println(j);
		  
		  switch(j)
		  {
		  case '1': System.out.print("one ");
		  break;
		  case '2': System.out.print("two ");
		  break;
		  case '3': System.out.print("three ");
		  break;
		  case '4': System.out.print("four ");
		  break;
		  case '5': System.out.print("five ");
		  break;
		  case '6': System.out.print("six ");
		  break;
		  case '7': System.out.print("seven ");
		  break;
		  case '8': System.out.print("eight ");
		  break;
		  case '9': System.out.print("nine ");
		  break;
		  case '0': System.out.print("zero ");
		  break;		  
		  
		  }
		}
	}

}
