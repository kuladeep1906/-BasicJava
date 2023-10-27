
/*NOTE: A non static method can access static members(variable etc..) but the static methods can not access non static members
 2. If we change value of static member at one object it will change at all instances.
 
 
 */
package IStatic_and_Final;

public class AStaticMember {
	
	static int a=10;
	int b=20;
	
	void show(){
		System.out.println("a: " +a + " b: " + b);
	}
	//static void display(){                       // will give error as we declared 'b' which is non static.
	 void display(){
		System.out.println("a: " +a + " b: " + b);
		
		
	}
	
	
	
	public static void main(String[] args) {
		AStaticMember obj1= new AStaticMember();
		obj1.a=200;
		obj1.b=100;
		
		obj1.show();
		obj1.display();
		
		
		AStaticMember obj2= new AStaticMember();
		obj2.show();
		obj2.display();
		
		
	}
		
}


