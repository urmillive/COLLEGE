import java.util.*;
class _20_Simple_intrest
{
	public static void main(String[] args) {
		double p,r,n,si;

		Scanner in = new Scanner(System.in);

		System.out.print("Eter Value of P : ");
		p = in.nextDouble();

		System.out.print("Eter Value of R : ");
		r = in.nextDouble();
		
		System.out.print("Eter Value of N : ");
		n = in.nextDouble();

		si = p*r*n/100;
		System.out.println("Simple Intrest = "+si);
	}
}

/*
Eter Value of P : 1000
Eter Value of R : 10
Eter Value of N : 2
Simple Intrest = 200.0
*/