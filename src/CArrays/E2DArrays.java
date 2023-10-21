//creating and accessing of 2D array

package CArrays;

public class E2DArrays {

	public static void main(String[] args) {
		int a[][]= {{1,2,3,4},{5,6,7,8},{2,4,6,8},{1,3,5,7}};      //method 1
		int b[][]= new int[3][4];					  	 //method 2
		int[] cd[];										 //method 3
		cd= new int[3][4];
		
		System.out.println("Normal 2D Array:");
	    for (int i=0;i<a.length;i++)						// printing elements of array a
	    {
	    	for (int j=0;j<a[0].length;j++)
	    	{
	    		System.out.print(a[i][j] + " ");
	    	}
	    	System.out.println("");
	    }
	 
/*
													// method 2 for printing elements of array a
    for (int i[]:a)
    {
    	for (int j:i) {
  		System.out.println(j);  	
    }
    	
    System.out.println(""); 
	}
*/
	    System.out.println("-----------------------------------------------");
	    System.out.println("Jagged or Ragged 2D Array:");
	    
	    int k[][]= new int[4][];
	    k[0] = new int[3];
	    k[1] = new int[4];
	    k[2] = new int[3];
	    k[3] = new int[5];
	    int value =0;
	     for(int i=0; i<a.length; i++)
	     {
	    	 for (int j=0;j<k[i].length;j++)
	    	 {
	    		 k[i][j]= value;
	    		 value++;
	    		 System.out.print(k[i][j] + " ");
	    	 }
	    	 System.out.println("");
	     }
	    
	    
	   
	    
	    
	    
	}
}








//----------------------------------- ********************* -------------------------------------------
//
