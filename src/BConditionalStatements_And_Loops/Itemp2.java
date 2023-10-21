//reverse of a number
/*
package BConditionalStatements_And_Loops;

import java.util.Scanner;

public class Itemp2 {

	public static void main(String[] args) {
		System.out.println("enter a number:");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int rev=0;
		while(n>0)
		{
			int rem= n%10;
			n=n/10;
			rev= rev*10+ rem ;
		}
		System.out.println(rev);
		
	}

}

*/

// ---------------------------- ************************** -------------------------------------
// palindrome number


package BConditionalStatements_And_Loops;

import java.util.Scanner;

public class Itemp2 {

	public static void main(String[] args) {
		System.out.println("enter a number:");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int rev=0;
		int temp=n;
		while(temp>0)
		{
			int rem= temp%10;
			temp=temp/10;
			rev= rev*10+ rem ;
		}
		if (n==rev)
		{
		System.out.println("palindrome");
		}
		else
		{
		System.out.println("not palindrome");	
		}
		
	}

}



