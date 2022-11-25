// Java program to illustrate default modifier 
package p1; 

// Class Geeks is having Default access modifier 
public class Access
{ 
	protected void display() 
	{ 
		System.out.println("Hello World!"); 
	} 
} 

class ACC extends Access{
	public static void main(String[] args) {
		ACC a = new ACC();
		a.display();
	}

}

