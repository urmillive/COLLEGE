class _34_Wrapper_Class
{
	public static void main(String[] args) {
		System.out.println("Max of Integer = "+Integer.MAX_VALUE);
		System.out.println("Min of Byte = "+Byte.MIN_VALUE);
		System.out.println("Type of Float = "+Float.TYPE);
			
		Double d1 = new Double(12.34);
		Double d2 = new Double(5.34);
		Double d3 = new Double(1/0.0);
		Double d4 = new Double(0/0.0);

		System.out.println("Value of d1 = "+d1+" d2 = "+d2);
		System.out.println("d1 Compare to d2 : "+d1.compareTo(d2));
		System.out.println("d3 is Infinite : "+d3.isInfinite()+" and is not a Number : "+d3.isNaN());
		System.out.println("d4 is Infinite : "+d4.isInfinite()+" and is not a Number : "+d4.isNaN());
	}
}

/*
Max of Integer = 2147483647
Min of Byte = -128
Type of Float = float
Value of d1 = 12.34 d2 = 5.34
d1 Compare to d2 : 1
d3 is Infinite : true and is not a Number : false
d4 is Infinite : false and is not a Number : true
*/