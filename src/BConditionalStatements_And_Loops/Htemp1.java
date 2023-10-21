package BConditionalStatements_And_Loops;

import java.util.Scanner;
import java.lang.Math;  

public class Htemp1 {

	public static void main(String[] args) {
		System.out.println("enter a number:");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int count=0, digits=0;
	     int temp;
		temp=n;
		while (temp>0)
		{ 
			temp=temp/10;
			count++;
		}
		temp=n;
		while (temp>0)
		{
			int rem= temp%10;
			digits= digits+ (int)(Math.pow(rem,count));	
			temp=temp/10;		
			
		}
		
        if(digits==n)
        {
        	System.out.println("armstrong");
        }
        else
        {
        	System.out.println("not armstrong");
        }
		}
}

//---------------------------- ************************* ------------------------------------------

// digits of a number
/*
 * package BConditionalStatements_And_Loops;
 * 
 * import java.util.Scanner;
 * 
 * public class temp {
 * 
 * public static void main(String[] args) {
 * System.out.println("Enter a number:"); Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt(); while(n>0) { int k = n % 10; n = n / 10;
 * 
 * 
 * System.out.println(k);
 * 
 * }
 * 
 * }
 * 
 * }
 * 
 */

//---------------------------- ************************* ------------------------------------------
// count of digits

/*
 * package BConditionalStatements_And_Loops;
 * 
 * public class temp { public static void main(String[] args) { int n=12345; int
 * count=0; while(n>0) { n=n/10; count = count +1; } System.out.println(count);
 * } }
 * 
 */