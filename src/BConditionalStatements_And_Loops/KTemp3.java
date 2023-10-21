//Arithmetic progression
/*
package BConditionalStatements_And_Loops;

import java.util.Scanner;

public class KTemp3 {

	public static void main(String[] args) {
		System.out.println("enter starting number:");
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		System.out.println("enter till progressions:");
		int n= sc.nextInt();
		System.out.println("enter difference:");
		int diff= sc.nextInt();
		int pro=a;
		for(int i=0;i<n;i++)
		{	
			System.out.printf("%d ",pro);
			pro= pro+diff;			
		}
	}

}

*/
// ------------------------------------------ ******************* ---------------------------------------
//Fibonocci Series

package BConditionalStatements_And_Loops;

import java.util.Scanner;

public class KTemp3 {

	public static void main(String[] args) {
		System.out.println("enter numbers of terms to display:");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int a=0,b=1;int c;int temp;
		System.out.print(a+ " "+ b+ " ");
		 
		for (int i=0;i<n-2;i++)
		{			
			c=a+b;
			temp=b;
			b=c;
			a=temp;									
			System.out.printf("%d ",c);			
		}
}
}