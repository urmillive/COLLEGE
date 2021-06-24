import java.util.*;
class _41_Vector_class
{
	public static void main(String[] args) {
		Vector v1 = new Vector();
		System.out.println("Vector v1 Size = "+v1.size()+" Capicity = "+v1.capacity());

		Vector v2 = new Vector(5);
		for (int i=0; i<=5; i++) {
			v2.addElement(i);
		}
		System.out.println("Vector v2 = "+v2);

		System.out.println("Vector v2 Size = "+v2.size()+" Capicity = "+v2.capacity());

		Vector v3 = new Vector(5,2);
		for (int i=1; i<=5; i++) {
			v3.addElement(i);
		}
		System.out.println("Vector v3 = "+v3);
		v3.addElement("Hello");
		System.out.println("Vector v3 = "+v3);
	}
}

/*
Vector v1 Size = 0 Capicity = 10
Vector v2 = [0, 1, 2, 3, 4, 5]
Vector v2 Size = 6 Capicity = 10
Vector v3 = [1, 2, 3, 4, 5]
Vector v3 = [1, 2, 3, 4, 5, Hello]
*/