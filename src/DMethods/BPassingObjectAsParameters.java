
// NOTE: We can not change the actual parameter value for primitive types it is only possible when
// we send objects as parameters.


package DMethods;

public class BPassingObjectAsParameters {
	
	static void update(int x[],int index,int element)
	{
		x[index]= element;
	
	}
	
	static void count(int x) {
		x++;
	     
		System.out.println("formal parameter:" + x);
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		update(a,1,20);
		for (int x:a) {
		System.out.print(x + " ");}
		System.out.print("                       //object type....so changed");
		
		
		System.out.println("");
		int k=3;
		count(k);
		System.out.println("actual parameter:" +k + "              //primitive type....so not changed" );
		
		
		
	}

}


//NOTE: We can not change the actual parameter value for primitive types it is only possible when
//we send objects as parameters.

