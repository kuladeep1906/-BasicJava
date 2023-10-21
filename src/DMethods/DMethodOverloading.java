//Overloaded method to reverse a int or an array

package DMethods;

public class DMethodOverloading {

	
      static int reverse(int s)
      {
    	   int r=0;
    	  while(s>0){
    		  r=r*10+s%10;
    		  s=s/10;    		 
    		     		  
    	  } 	  
		return r;
    	  
      }
      
      static String reverse(String s)
      {
    	  String str2=""; char cha;
    	  for(int i=0;i<s.length();i++)
    	  {   	
    		  cha= s.charAt(i);
    		  str2= cha+ str2; 
    	  }
		return str2;
      }
       
      public static void main(String[] args) {
    	  int a=12345;
    	  String str="kuladeep";
    	  System.out.println(reverse(str));
    	  
    	  System.out.println("number reverse:" + reverse(a));
		
	}
}







