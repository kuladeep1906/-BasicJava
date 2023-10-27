/*
 NOTE: Final keyword is like constant, once given can not be changed.
 2. Final members should be written in CAPITAL LETTERS
 3. Final members can't be modified
    Final methods can't be overrided (restricted polymorphism)
    Final classes can't be extended (inherited).
 4. We can initialize final variables in 3 ways:
    1) directly initialize them
    2) inside constructor 
    3) inside an instance block
 
    
*/
package IStatic_and_Final;      //read note points starting from line 1

public class CFinalKeyword {
	final int kula=10;                     //method 1 initialization
	final int mahi;						   //method 2 initialization
	{
		mahi=20;
	}
	
	final int mahideep;					   //method 3 initialization
	CFinalKeyword(){
		mahideep= 30;
		System.out.println(mahideep);
		
	}
	
	public static void main(String[] args) {
		CFinalKeyword k=new CFinalKeyword();
		
	//	System.out.println();
	}
	

}
