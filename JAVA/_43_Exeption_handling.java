class _43_Exeption_handling
{
	public static void main(String[] args) {
		int arr[] = {25,43,45};
		try
		{
			System.out.println("Trying to Acess 26th Elemet");
			System.out.println(arr[26]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out of Bound");
		}
	}
}

/*
Trying to Acess 26th Elemet
Array Index Out of Bound
*/