//Findind sum of elements
/*
package CArrays;

public class B1DArrayPractice {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int sum = 0;
		for (int i=0; i<a.length;i++)
		{
			sum= sum + a[i];
		}
        System.out.println("sum is:" + sum);
	}

}

*/

// ----------------------------------- ********************* -------------------------------------------
// Searching an element

/*

package CArrays;

import java.util.Scanner;

public class B1DArrayPractice {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,3,3,4,5,54,56,56,45,5,4,544};
		System.out.println("enter element to search:");
		Scanner sc = new Scanner(System.in);int count=0;
		int ele= sc.nextInt();		
		for (int i=0;i<a.length;i++)
		{
			if (a[i]==ele)
					{
				       System.out.println("element found at: " +i);
				       count=count+1;
				       break;
				       				       
					}			
		}
		if(count==0) {
		System.out.println("element not found");}
		
	}
}

*/

//----------------------------------- ********************* -------------------------------------------
//Finding max element

/*

package CArrays;

import java.util.Scanner;

public class B1DArrayPractice {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,3,3,4,5,54,56,56,45,5,4,54};
		int max=a[0];
		for (int i=0;i<a.length;i++)
		{
			if (a[i]>max)
			{
				max= a[i];
			}
	
		}
		System.out.println("max element is:" + max);
	}
		
}

*/

//----------------------------------- ********************* -------------------------------------------
//Finding second largest element

package CArrays;

import java.util.Scanner;

public class B1DArrayPractice {

	public static void main(String[] args) {
		int a[] = {100,42,36,4,54};int max2;
		int max1=max2=Integer.MIN_VALUE;
		for (int i=0;i<a.length;i++)
		{
			if (a[i]>max1)
			{				
				max2=max1;
				max1= a[i];
			}
			else if(a[i]>max2 && a[i] != max1)
			{
				max2= a[i];
			}
			
		}			
	//	System.out.println("max element is:" + max1);
	//	System.out.println("second max element is:" + max2);	
		
		
		if (max2 == Integer.MIN_VALUE) {
		    System.out.println("\n No second largest element found in the array");
		} else {
		    System.out.println("\nSecond largest element in the array : " + max2);
		}
}
}