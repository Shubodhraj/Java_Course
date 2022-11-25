// package A;

// Java program to illustrate error while 
// using class from different package with 
// default modifier 
package A; 
import p1.*; 

// This class is having default access modifier 
class AccessNew
{ 
	public static void main(String args[]) 
	{ 
		// Accessing class Geek from package p1 
		Access obj = new Access(); 

		obj.display(); 
	} 
} 

