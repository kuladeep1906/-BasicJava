package DMethods;

public class GRecursion {
	
	static void sum(int n) {
	  if(n>0) {
	  System.out.println(n);
	  sum(n-1);
	}
	}

	public static void main(String[] args) {
		int a=7;
		sum(a);
       
	}
}
