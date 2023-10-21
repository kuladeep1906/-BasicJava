//Max of numbers using varargs

/*

package DMethods;

public class FVariableargumentsPractice {
	
	static int maxi(int ...a)
	{
		
		if(a.length==0)
		{
		  return Integer.MIN_VALUE;
		}
		int max=a[0];
		for (int i=0;i<a.length;i++)
		{
			
			if (a[i]>max)
			{
				max=a[i];
			}
		}		
		return max;
	}

	public static void main(String[] args) {
     int[] a= {};
     System.out.println(maxi(a));
     System.out.println(maxi(10,2,4,4,3,3,2));
	}

}

*/

//----------------------------------- ********************* -------------------------------------------
//calculating Discount


package DMethods;

public class FVariableargumentsPractice {
	
	static int disc(int ...a)
	{
		int sum=0;
		for (int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		if (sum<500) {
		return 10;	}
		if (sum>500 && sum<1000) {
			return 15;}
		else  {
			return 20;}	
		
	}
	
	public static void main(String[] args) {
		int[] a= {222,3,32,4,3,3,2,4,2,4,23};
		System.out.println("Discount = "+ disc(a)+ " percent");
		System.out.println("Discount = "+ disc(222,2,32,3,3,3,323)+ " percent");
		System.out.println("Discount = "+ disc(222,2,32,3,3,3,3233)+ " percent");
		
		
	}
}
