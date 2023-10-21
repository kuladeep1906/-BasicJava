package BConditionalStatements_And_Loops;

import java.util.Scanner;

public class CLeapyear2 {
    public static void main(String[] args) {
    	System.out.println("Enter year:");
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
       if (a%4==0)
       {
          if (a%100==0)
          {
              if (a%400==0){
                  System.out.println("leap year");
              }
              else{
                   System.out.println("non leap year");
              }
          }
           else
           {
               System.out.println("leap year");
           }
       }
          else
          {
              System.out.println("non leap year");
          }
       }
    }
