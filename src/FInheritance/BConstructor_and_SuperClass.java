// constructor and super


package FInheritance;
/*
class A{
	
        A(){
        	System.out.println("1.parent class non-parameterized constructor");
        }
        A(int c){
        	System.out.println("2.parent class parameterized constructor");
        }      
	}

class B extends A{
	
	 B(){
     	System.out.println("3.child class non-parameterized constructor");
     }
     B(int a){
  //  	 super(a);                       // add this to print 2 and 4, else it will 1 and 3 only
     	System.out.println("4.child class parameterized constructor");
     }      
}



public class BConstructor_and_SuperClass {
	public static void main(String[] args) {
		B b=new B();               // prints 1 and 3
		B c=new B(10); 			   // prints 1 and 4 if we do not put super in child class.
	}	
}


//NOTE: Only constructors can be called implicitly like this(via creating child object), not other methods

*/

// --------------------------------------- **** ----------------------------------------------------------
// rectangle and cuboid
 


class rectangle{
	int length;
	 int breadth;
	rectangle(){
		length=breadth=1;
	}
	rectangle(int l, int b){
		 length=l;
		breadth=b;
		
	}	
}

class cuboid extends rectangle{
	int height;
	cuboid(){
		height=1;
	}
	cuboid (int h){
		 height=h;}
	cuboid (int d, int e,int h){
		super(d,e);                                   // super class should be called to execute parameterized constructor
		 height=h;}
	
	int volume()
	{	
		return length*breadth*height;
	}	
}


public class BConstructor_and_SuperClass {
	public static void main(String[] args) {
		
		cuboid c=new cuboid();
		cuboid c1=new cuboid(10);            
		cuboid c2=new cuboid(10,20,30);
		
		System.out.println(c.volume());	
		System.out.println(c1.volume());
		System.out.println(c2.volume());	
		
	}
	}


