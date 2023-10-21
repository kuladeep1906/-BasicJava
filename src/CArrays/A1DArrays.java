package CArrays;

public class A1DArrays {

	public static void main(String[] args) {
     int a[]= new int[5];                        //declaration type- 1
     int b[]= {1,2,3,4,5};						 //declaration type- 2       
     int c[];									 //declaration type- 3
     c = new int[5];
     a[1]= 3;
     System.out.print("reverse order for a[]: ");
     for (int i=a.length-1;i>=0;i--)
     {
    	 System.out.print(+ a[i]+ " ");
     }
     System.out.println();
     
     for (int i:b)
     {
    	 System.out.print(i+" ");
     }
	}

}
