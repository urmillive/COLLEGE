import java.util.*;
class _42_Vecotor_class
{
	public static void main(String[] args) {
		Vector v1 = new Vector(6,3);
		v1.addElement("java");
		v1.addElement("Computer");
		v1.addElement(123);
		v1.addElement(98.76);
		System.out.println("Vector = "+v1);
		System.out.println("First Element = "+v1.firstElement());
		System.out.println("Last Element = "+v1.lastElement());
		v1.insertElementAt("Happy",2);
		v1.insertElementAt("smile",3);
		System.out.println("After Inserting = "+v1);
		v1.removeElementAt(0);
		v1.removeElement("Computer");
		System.out.println("After Removeing = "+v1);
		System.out.println("The Vector Caintains 123 : "+v1.contains(123));
		System.out.println("The Vector Caintains 456 : "+v1.contains(456));
		Enumeration en = v1.elements();
		System.out.println("The Elements of Vector is ");
		int i=1;
		while(en.hasMoreElements())
		{
			System.out.println("Element "+i+" = "+en.nextElement());
			i++;
		}

	}
}

/*
Vector = [java, Computer, 123, 98.76]
First Element = java
Last Element = 98.76
After Inserting = [java, Computer, Happy, smile, 123, 98.76]
After Removeing = [Happy, smile, 123, 98.76]
The Vector Caintains 123 : true
The Vector Caintains 456 : false
The Elements of Vector is
Element 1 = Happy
Element 2 = smile
Element 3 = 123
Element 4 = 98.76
*/