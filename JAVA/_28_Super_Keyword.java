class Std
{
	int s1,s2,s3,total;
	Std(int s1,int s2,int s3)
	{
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	void show_res()
	{
		total = s1+s1+s2;
		System.out.println("Total = "+total);
	}
}
class Roll extends Std
{
	int roll;
	Roll(int s1,int s2,int s3,int roll)
	{
		super(s1,s2,s3);
		this.roll = roll;
	}
	void show_roll()
	{
		System.out.println("Roll No = "+roll);
	}
}
class _28_Super_Keyword
{
	public static void main(String[] args) {
		Roll r = new Roll(40,50,60,4501);
		r.show_roll();
		r.show_res();
	}
}

/*
Roll No = 4501
Total = 130
*/