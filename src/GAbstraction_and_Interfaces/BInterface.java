
/*
NOTE: we can extend the interface by making child class as abstract
 
             	 |
 		 |
		 |
	||||||||||
	|	 | <-------- mobile
	|	 |
	| MOBILE |
	|	 | <-------- mplayer
	|	 |
	|	 |
	|||||||||| <--------camera
	       
*/

package GAbstraction_and_Interfaces;

	class mobile{
	void call() {
		System.out.println("phone calling");}
	void browse() {
		System.out.println("browsing");}		
	}
	
	interface mplayer{
		void stop();
		void start();		
	}

	interface camera{
		void click();
		void record();		
	}
	public class BInterface extends mobile implements mplayer,camera{

		@Override
		public void click() {System.out.println("clicking in phone");}
		@Override
		public void record() {System.out.println("recording in smart phone");}
		@Override
		public void start() {System.out.println("starting in smart phone");}
		@Override
		public void stop() {System.out.println("stopping in smart phone");}
		@Override
		public void call() {System.out.println("calling in smart phone");}	
		@Override
		public void browse() {System.out.println("browsing in smart phone");}	
		
	
		public static void main(String[] args) {
			
			BInterface smartphone = new BInterface();
			smartphone.browse();
			smartphone.click();
			smartphone.start();
			
			
			
		
		}
				
	}	
		























