class _05_jagged_array
{
	public static void main(String[] args) {
		int a[][] = {
						{1,2,3,4},
						{2,3},
						{1,8,9},
						{1,6,1,2,1,8}
					};
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
	}
}

/*
1 2 3 4
2 3
1 8 9
1 6 1 2 1 8
*/