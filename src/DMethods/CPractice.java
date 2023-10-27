//Prime number

/*
package DMethods;

public class CPractice {
	static boolean isPrime(int x) {
		for (int i = 2; i < x/2; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {	
		if(isPrime(99)){
		System.out.println("prime number");	}
		else 
		{
			System.out.println("not prime number");
		}
		
	}
}


*/

//----------------------------------- ********************* -------------------------------------------
// Finding GCD



package DMethods;

public class CPractice {
	
	static int gcd(int m,int n)
	{
		for (int i=1;i<=max(m,n);i++)
			if(m>n)
			{
			   m=m-n;
			}
			else if(n>m)
			{
			  n=n-m;
			}
			else
			{
				return m;
			}
			
		return 0;	
}
	 static int max(int m, int n) {
		 if(m>n) {
			 return m;
		 }
		
		return n;
	}
	public static void main(String[] args) {
		int a=30,b=19;
		System.out.println("GCD:" + gcd(a,b));
	}

}



//----------------------------------- ********************* -------------------------------------------
//Finding max element in an array

/*
package DMethods;

public class CPractice {
	
	static int max(int[] s)
	{
		int max=s[0];
		for(int i=0;i<s.length-1;i++)
		{
			if(s[i] > max)
			 	{
				   max= s[i];}			
		}
		return max;
	}
	public static void main(String[] args) {
		int a[]= {1,223,33,4,5,3,43,5,35,45,354,3,6,34,5,34};
		System.out.println(max(a));
	}
}


*/
