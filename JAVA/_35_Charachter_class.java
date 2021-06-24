class _35_Charachter_class
{
	public static void main(String[] args) {
		System.out.println("Minimum Radix of char is "+Character.MIN_RADIX);
		System.out.println("Maximum Radix of char is "+Character.MAX_RADIX);
		Character ch1 = 'M';
		Character ch2 = 'a';
		System.out.println("ch1 is UpperCase : "+Character.isUpperCase(ch1));
		System.out.println("ch2 is UpperCase : "+Character.isUpperCase(ch2));
		System.out.println("ch1 to UpperCase : "+Character.toUpperCase(ch1));
		System.out.println("ch2 to UpperCase : "+Character.toUpperCase(ch2));
		System.out.println("\\t is Whitespace : "+Character.isWhitespace('\t'));
		Character c1 = '7';
		System.out.println("c1 is Digit : "+Character.isDigit(c1));
	}
}

/*
Minimum Radix of char is 2
Maximum Radix of char is 36
ch1 is UpperCase : true
ch2 is UpperCase : false
ch1 to UpperCase : M
ch2 to UpperCase : A
\t is Whitespace : true
c1 is Digit : true
*/