class _04_2d_array
{
	public static void main(String[] args) {
		int marks[][] = {
							{60,61,62},
							{56,57,58},
							{70,90,90},
							{92,70,89}
						};
		for (int i=0; i<4; i++) {
			System.out.print("Student "+(i+1)+" : ");
			for (int j=0; j<3; j++) {
				System.out.print(marks[i][j]+" ");
			}
			System.out.println("");
		}
	}
}

/*
Student 1 : 60 61 62
Student 2 : 56 57 58
Student 3 : 70 90 90
Student 4 : 92 70 89
*/