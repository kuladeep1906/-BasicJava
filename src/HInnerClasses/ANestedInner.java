/* 
Types of Nested classes:  
   Member inner class (or) Nested inner class (or) Regular inner class
   Anonymous inner class
   Local inner class
   Static nested class
   
nested inner class: A class created within class and outside method.

Local inner class: A class was created within the method.

Anonymous inner class: A class created for implementing an interface or extending class. Java compiler decides its name.

Static nested class: A static class was created within the class.
   
 */



package HInnerClasses;

class outer{
	int x=10;                             //'x's can be used as a global variable
	
class inner{
	int y=20;
	void show() {	
		System.out.println(x +" "+y);
	}
}

void display()
{
	inner i=new inner();
	i.show();
	System.out.println("y: "  + i.y);                  // we can't call 'y' directly 
}
}

public class ANestedInner {
	public static void main(String[] args) {
		outer o=new outer();
		o.display();
		
	  outer.inner oi=new outer().new inner();    // if we want to call inner class directly
	  System.out.print("calling inner class directly: ");
	     oi.show();
		
	}
	
	
/* 
	 NOTE: For nested inner class in our program, 3 class files will be generated:
	 1)outer.class     2) outer$inner.class     3)ANestedInner.class
*/

	
	
	
	
	
	
	
	
	

}
