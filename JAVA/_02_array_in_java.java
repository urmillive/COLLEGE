class _02_array_in_java
{
	public static void main(String[] args) {
		int tarks[] = new int[3];

		tarks[0] = 66;
		tarks[1] = 65;
		tarks[2] = 70;

		int total = tarks[0]+tarks[1]+tarks[2];

		double per = total/3;

		System.out.println("Total = "+total);
		System.out.println("Per   = "+per);
	}
}

/*
Total = 201
Per   = 67.0
*/