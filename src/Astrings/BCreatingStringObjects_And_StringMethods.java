package Astrings;

public class BCreatingStringObjects_And_StringMethods {

	public static void main(String[] args) {
		String str1= "kuladeep";
		
		String str2= new String("kula");
		
		char c[]= {'m','a','h','e', 'n', 'd','r','a'};
		String str3= new String(c);
		
		byte b[]= {65,66,67,68};
		String str4= new String(b);
		
		String str5= "Kuladeep";
		String str6= new String("kuladeep");
		
		String str7= new String(c,0,4);
		
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str1==str5);   //remember pool and heap concepts and differences
		System.out.println(str1==str6);
		System.out.println(str7);
		
//   ******************************  STRING METHODS  ****************************
		String str8= str5.toUpperCase();
		String str9= str6.replace('p','r' );
		Boolean str10= str9.startsWith("k");
		char str11= str9.charAt(3);
		
		System.out.println(str8+ " - str8");
		System.out.println(str9 + " - str9");
		System.out.println(str10 + " - str10");
		System.out.println(str9.endsWith("a"));
		System.out.println(str9.indexOf("a"));
		System.out.println(str11 + " - str11");
		System.out.println(str1.equals(str6));    // == and equals are different
		System.out.println(str1 == str6);
		System.out.println(str1.compareTo(str5));  // gives difference
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		

	}

}
