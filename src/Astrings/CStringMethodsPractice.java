/* 1) Find if the email id is on gmail
   2) Find username and domain name from email.
   
*/
package Astrings;

import java.util.Scanner;

public class CStringMethodsPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter email: ");
		String str1 = sc.nextLine();

		boolean str2 = str1.endsWith("@gmail.com");
		System.out.println(str2);

		int str3 = str1.indexOf("@");

		System.out.println("uname: " + str1.substring(0, str3));
		System.out.println("domain: " + str1.substring(str3 + 1));

	}

}
