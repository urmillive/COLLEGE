class _07_Simple_Intrest
{
	public static void main(String[] args) {
		int p,n,r;
		float si,total;
		p = 10000;
		n = 2;
		r = 12;
		si = (p*r*n)/100;
		total = p+si;
		System.out.println("Intrest = "+si);
		System.out.println("Total   = "+total);
	}
}

/*
Intrest = 2400.0
Total   = 12400.0
*/