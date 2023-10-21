//copying an array

/*

package CArrays;

public class D1DArrayPractice3 {

	public static void main(String[] args) {
    int a[]= {1,2,3,4,5,6,53,3,4,5,5,4,5,6,6};
    int b[] = new int[a.length];
    for (int i=0;i<a.length;i++)
    {
    	b[i]= a[i];    
	}
    for (int i=0;i<a.length;i++)
    {
    	System.out.print(b[i] + " ");
    }
}
}

*/

//----------------------------------- ********************* -------------------------------------------
// Reverse copying an array

/*

package CArrays;

public class D1DArrayPractice3 {

	public static void main(String[] args) {
    int a[]= {1,2,3,4,5};
    int b[] = new int[a.length];
    for(int i=0;i<a.length;i++)
    {
    	b[i]= a[(a.length-i)-1];
    	System.out.print(b[i] + " ");
    }     
}
}

*/

//----------------------------------- ********************* -------------------------------------------
//Increasing size of an array


package CArrays;

public class D1DArrayPractice3 {

	public static void main(String[] args) {
    int a[]= {1,2,3,4,5};
    int b[] = new int[a.length*2];
    System.out.println("array a length before: " + a.length);
    for(int i=0;i<a.length;i++)
    {
    	b[i]=a[i];
    }
    a=b; 
    b=null;
    System.out.print("array:");
    for(int i=0;i<a.length;i++)
    {
    	System.out.print(a[i] + " ");
    } 
    System.out.println("");
    System.out.println("array a length after: " + a.length); 
    
	}
}
