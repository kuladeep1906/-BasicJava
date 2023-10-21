
package FInheritance;

class Tv{
	void switchon() {
		System.out.println("tv switched on");
		
	}
    void switchoff() {
    	System.out.println("tv switched off");	}
    		  	
}

class smartTv extends Tv{
	    @Override                     // NOTE: We can't override static and final methods
		void switchon() {
			System.out.println("smart tv switched on");
			
		}
	    @Override
	    void switchoff() {
	    	System.out.println("smart tv switched off");	}	    			    	
		   	
		
	    void browse() {
	    	System.out.println("browsing in smart tv");		
		} 
	    
	}
	
	
public class DMethodOverriding {	
	public static void main(String[] args) {
		Tv a=new Tv();
		a.switchon();
		a.switchoff();
		
		smartTv b=new smartTv();
		b.switchon();
		b.switchoff();
		b.browse();
		
		Tv c=new smartTv();    //dynamic method dispatch-> used to achieve runtime polymorphism using method overriding
		c.switchoff();
		c.switchon();
	//	c.browse();     // with the reference, we can only call methods that are defined in parent class but not the methods defined in child class
		
		
		
		
		
		
	}

}
