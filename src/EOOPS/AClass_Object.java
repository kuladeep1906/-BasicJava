//Cylinder 

/*
package EOOPS;


class cylinder {
	
	double r;
	double h;
	
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
}

public class AClass_Object {
	
	public static void main(String[] args) {
		cylinder c= new cylinder();
		c.r=5;
		c.h=10;
		System.out.println(c.lidArea());
		System.out.println(c.totalSurfaceArea());
		System.out.println(c.volume());		
	}			
}

*/

//----------------------------------- ********************* -------------------------------------------
//Student

package EOOPS;
class student{
	int rollno;
	String name;
	String course;
	int m1,m2,m3;
	int m;
	
	String details()

	{
		return "name is " + name + ", course is " + course;
	}
	int total()
	{
		 m=m1+m2+m3;
		return m;			
	}
	
	double average()
	{
		 return m/3;		
	}
	
	char grade()
	{
		if (average()<35) {
		return 'F';	}
		else if (average()>=35 && average()<=75) {
			return 'P';
		}
		else
		{
			return 'A';
		}
		
	}
}

public class AClass_Object {
	
	public static void main(String[] args) {
		student s=new student()	;
		s.m1=80;
		s.m2=90;
		s.m3=75;
		s.name= "kuladeep";
		s.course= "CSE";
		System.out.println("details--> " + s.details());
		System.out.println("total:" + s.total());
		System.out.println("average:" + s.average());
		System.out.println("grade:" + s.grade());
		
		
		
		
	}
}


	
	
	

	

