package FInheritance;

public class CThis {
	int length;
	int breadth;
	
	void rect(int length,int breadth) {
		this.length=length;						//without 'this' , it will not take length and breadth as variable because of amb
		this.breadth=breadth;		
		
	}
	void display() {
		System.out.println("length: "+length);
		System.out.println("breadth: " +breadth);
	}
	public static void main(String[] args) {
		CThis sc=new CThis();                     //to instantiate objects and the reason follow --> https://youtu.be/0exdSIsGmCU?si=XNj2kEWOV-wTkhKm
		sc.rect(1,2);
		sc.display();
		
		
		
		
		
			
		
	}

}
