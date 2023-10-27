package JPackages_and_AccessModifiers;


/*
 Public:   Accessible everywhere
 Private:  Accessible inside same class only     
 Default:  Accessible inside same package only    (both sub-class and non sub=class)
 Protected:Accessible everywhere except different package non sub-class
 
 
Let us see which all members of Java can be assigned with the access modifiers:
 
Members of JAVA	 Private	Default	Protected	Public
Class	 			No	     Yes	    No	     Yes
Variable	  		Yes		 Yes		Yes		 Yes
Method				Yes		 Yes		Yes		 Yes
Constructor			Yes		 Yes		Yes		 Yes
interface			No		 Yes		No		 Yes
Initializer Block	NOT ALLOWED

Let us understand the scope of these access modifiers with the help of a table:

Access Modifier	within class	within package	outside package by subclass only	outside package
Private				Yes				No					No								No
Default				Yes				Yes					No								No
Protected			Yes				Yes					Yes								No
Public				Yes				Yes					Yes								Yes

 
 */

public class Theory {
	public static void main(String[] args) {            //see theory starting from line 4
		
	}

}
