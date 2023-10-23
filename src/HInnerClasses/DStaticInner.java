
//Static nested class: A static class was created within the class.

package HInnerClasses;

class outer2{
	static int x=10;
	int y=20;

static class inner{
	void meth() {
		System.out.println(x);
	//	System.out.println(y);   //NOTE : Static inner classes can only access static members of outer class

	}
	


}
}
public class DStaticInner {
	public static void main(String[] args) {
		outer2.inner k=new outer2.inner();
		k.meth();
		
	}
	
	

}
