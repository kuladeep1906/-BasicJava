package DMethods;

public class EVariableNumberOfArguments {
	
	
	public static void kula(int start,String ...s) {
		
		for (int i=0;i<s.length;i++)
		{
			
			System.out.println(start+"."+s[i]);
			start++;
		}
					
	}
	
	
	public static void deep(int ...a) {
		
		for(int x:a)
		{
		System.out.println(x);}
	
	}

	public static void main(String ...args) {                    //new declaration of main from Java 1.7
		int n=5;
         String[] a= {"kuladeep", "mahi", "pappu"};
          kula(n, a);
          
         deep();
         deep(1);
         deep(1,2,3);   
         deep(new int[]{11,12,13,14});
         
	}
}
