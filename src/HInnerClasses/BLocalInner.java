//Local inner class: A class was created within the method.

package HInnerClasses;

class outerr{
	int x=10;
	
	void display() {
		
		class local_inner{
			int y=10;
			void show() {
			    System.out.println(x + y);  
			}
			
		}
		local_inner li= new local_inner();
		li.show();	
		System.out.println("x:" + x);
		System.out.println("y:" + li.y);
		new local_inner().show();                    // without using reference -> anonymous object
		
	}
	
}

public class BLocalInner {
	public static void main(String[] args) {
		outerr d= new outerr();
		d.display();
		
	}
	
}


