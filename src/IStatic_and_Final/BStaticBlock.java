//NOTE: A class which is not main class should be instantiated in order to call static blocks.

package IStatic_and_Final;

class kula{
	static {
		System.out.println("Block1 outside main class");
	}	
	
}

public class BStaticBlock {
	static {
		System.out.println("Block1 inside main class");
	}
	 public static void main(String[] args) {
		 kula k=new kula();                     // should be instantiated in order to call static blocks which are not in main class
		System.out.println("Inside main");
	}
		 
	 static {
			System.out.println("Block2 inside main class");
		}

}
