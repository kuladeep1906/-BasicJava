//----------------------------------- ********************* -------------------------------------------
//Rotating an array (right rotation)  .........for left rotation see abdul beri video

/*
package CArrays;

public class C1DArrayPractice2 {

	public static void main(String[] args) {
		int a[] = {100,42,36,4,54};
		int temp=a[a.length-1];
		for (int i=a.length-2;i>1;i--)
		{
			a[i+1]=a[i];
		}
		a[0]= temp;
		
		for (int i=0;i<a.length;i++)
	     	System.out.print(a[i] +" ");
}
}

*/
//----------------------------------- ********************* -------------------------------------------
//Inserting an element at specific position

/*

package CArrays;

public class C1DArrayPractice2 {

	public static void main(String[] args) {
		int a[] =new int[10]; 
		a[0]=1;a[1]=2;a[2]=3;a[3]=4;a[4]=5;
		
		int k=3; int n=5;
		for (int i=a.length-1;i>1;i--)
        {
	       
	    	a[i]=a[i-1];
        }
		a[k-1]= 7;
		for (int i=0;i<n+1;i++) {
		System.out.print(a[i] + " ");
		}
	}
}

*/

//----------------------------------- ********************* -------------------------------------------
//Deleting an element at specific position

package CArrays;

public class C1DArrayPractice2 {

	public static void main(String[] args) {
		int a[] =new int[10]; 
		a[0]=1;a[1]=2;a[2]=3;a[3]=4;a[4]=5;
		int n=5, d=3;
		for (int i=0;i<n;i++)
		{	
		if(d==a[i]) {
			for (int j=i;j<n;j++) {
			   a[j]=a[j+1];
			  }
		}
		}
		for (int i=0;i<n-1;i++) {
			System.out.print(a[i] + " ");
			}	
	}
}
