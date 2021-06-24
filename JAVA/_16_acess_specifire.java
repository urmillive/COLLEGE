class Protection
{
	int i;
	public int j;
	private int k;
	void set_val(int x)
	{
		k = x;
	}
	int get_val()
	{
		return k;
	}
}
class _16_acess_specifire
{
	public static void main(String[] args) {
		Protection p = new Protection();
		p.i = 10;
		p.j = 20;
		// p.k = 30;
		p.set_val(30);
		System.out.println("i = "+p.i);
		System.out.println("j = "+p.j);
		System.out.println("k = "+p.get_val());
	}
}

/*
i = 10
j = 20
k = 30
*/