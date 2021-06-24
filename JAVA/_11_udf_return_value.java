class Banking
{
	double p,r,n;
	double si()
	{
		return p*r*n/100;
	}
}
class _11_udf_return_value
{
	public static void main(String[] args) {
		Banking b1 = new Banking();
		b1.p = 5000;
		b1.r = 12;
		b1.n = 5;
		System.out.println("SI = "+b1.si());
	}
}

/*
SI = 3000.0
*/