package EOOPS;


class cylinder {
	
	private double r;                 				// access modifier
	private double h;								// access modifier
	
	public void setr(double x)		    //getter & setter methods were used to set values for private variables
	{
		
		if (x>0) {
			r= x;}
			else
			{h=0;}
	}
	public void seth(double y)                  //setter method   ---> setxxxx()
	{
		if (y>0) {
		h= y;}
		else
		{h=0;}
	}
	public double geth()						//getter method   ---> getxxxx()
	{
		return h;
	}
	public double getr()
	{
		return r;
	}	
	
	public double lidArea()
	{
		return Math.PI*r*r;
	}
	public double totalSurfaceArea()
	{
		return 2*Math.PI* r *(h+r);
	}
	public double volume()
	{
		return Math.PI* (r*r)*h;
	}


//constructors

public cylinder()
{
	System.out.println("default constructor");
}
cylinder(double a, double b)
{
	r=a;
	h=b;
	System.out.println("parameterized constructor - values: r=" + r + ", h=" + h);
	
}

}

public class BDataHiding_and_Constructors {
	
	public static void main(String[] args) {
		cylinder c= new cylinder();
		cylinder d= new cylinder(10,20);
		
		c.setr(10);
		c.seth(-10);
		System.out.println("radius: " + c.getr());
		System.out.println("height: " + c.geth());
		System.out.println("lidArea: " + c.lidArea());
		System.out.println("surfaceArea: " + c.totalSurfaceArea());
		System.out.println("volume: " + c.volume());
		
	}	
}



