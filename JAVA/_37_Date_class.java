import java.util.*;
class _37_Date_class
{
	public static void main(String[] args) {
		Date today = new Date();
		Date epoch = new Date(0);
		Date date = new Date(24*60*60*1000);

		System.out.println("Date of epoch is = "+epoch);
		System.out.println("Date after one day of epoch is = "+date);
		long ms = date.getTime();
		System.out.println("Number of mili seconds = "+ms);
		System.out.println("Today is Before epoch : "+today.before(epoch));
		System.out.println("Today is After epoch : "+today.after(epoch));
		System.out.println("Today = epoch : "+today.equals(epoch));
		System.out.println("Today compare to epoch : "+today.compareTo(epoch));
	}
}

/*
Date of epoch is = Thu Jan 01 05:30:00 GMT+05:30 1970
Date after one day of epoch is = Fri Jan 02 05:30:00 GMT+05:30 1970
Number of mili seconds = 86400000
Today is Before epoch : false
Today is After epoch : true
Today = epoch : false
Today compare to epoch : 1
*/