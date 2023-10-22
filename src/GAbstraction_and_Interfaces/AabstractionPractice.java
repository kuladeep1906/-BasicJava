package GAbstraction_and_Interfaces;

abstract class shape{
	 abstract double perimeter();
	 abstract double area();	
}

class circle extends shape{
	int r;
	@Override
	 double area(){
	return 3.14*r*r;}
	@Override
	double perimeter() {	
		return 2*3.14*r*r;
	}
}

class rectangle extends shape{
	int l=10;
	int b=20;
	@Override
	double perimeter() {
		return 2*(l+b);}
	@Override
	double area() {
		return l*b;}	
}
	
	public class AabstractionPractice {
		public static void main(String[] args) {
			circle a=new circle();       
			a.r=7;
			shape c= a;           			 // NOTE:parent reference is used for calling purpose only, not for updating.
			
			rectangle s= new rectangle();
			s.l=3;
			s.b=4;
			shape r= s;
			System.out.println("circle area: "+c.area());
			System.out.println("circle perimeter: " + c.perimeter());
			System.out.println("rectangle area: " + r.area());
			System.out.println("rectangle perimeter: " + r.perimeter());	
		}
}

	
	
	
	
	
	
	
	
	
	
	
	