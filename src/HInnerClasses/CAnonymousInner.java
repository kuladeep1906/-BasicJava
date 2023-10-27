
//Anonymous inner class: A class created for implementing an interface or extending class. Java compiler decides its name.

package HInnerClasses;

 abstract class kula{
    abstract void abs();}
       
   class Outer1{ 
    void anonymous() {
    	kula anon= new kula(){
    		void abs() {System.out.println("Anonymous class");}
    	};
    	anon.abs();
    //	new kula(){void abs() {System.out.println("Anonymous class");}}.abs();   // calling without reference
    	
    	}   	
}
 
public class CAnonymousInner {
	
	public static void main(String[] args) {
		Outer1 k= new Outer1();
		k.anonymous();
	}	
}
