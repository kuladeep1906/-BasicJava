package BConditionalStatements_And_Loops;

import java.util.Scanner;

public class EMultiplicationTable {

	public static void main(String[] args) {
	System.out.println("Enter table u want to print:");
	Scanner sc= new Scanner(System.in);
	int a= sc.nextInt();	
    for (int i=1;i<=10;i++)
    {
    	System.out.println(a + " x " + i + " = " + (a*i));
    }
	}

}
