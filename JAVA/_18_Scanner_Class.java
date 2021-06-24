import java.util.Scanner;
class _18_Scanner_Class
{
	public static void main(String[] args) {
		int num;
		String str;
		float fnum;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter String : ");
		str = in.nextLine();
		System.out.println("str = "+str);

		System.out.print("Enter Integer : ");
		num = in.nextInt();
		System.out.println("Integer = "+num);

		System.out.print("Enter Float : ");
		fnum = in.nextFloat();
		System.out.println("Float = "+fnum);
	}
}

/*
Enter String : ksc
str = ksc
Enter Integer : 22
Integer = 22
Enter Float : 21.75
Float = 21.75
*/