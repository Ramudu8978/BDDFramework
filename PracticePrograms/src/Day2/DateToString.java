package Day2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToString {
	public static void main(String[] args) throws ParseException
	{
		//Date to String
		Date date=new Date();
		SimpleDateFormat s=new SimpleDateFormat("MM-dd-YYYY");
		
		String d=s.format(date);
		System.out.println(d);
		
		//String to Date
		
		String datestr="29-03-2025";
		
		SimpleDateFormat s1=new SimpleDateFormat("dd-MM-yyyy");
		Date d1=s1.parse(datestr);
		System.out.println(d1);
		
		//String to Int
		String str="123";
		int num=Integer.parseInt(str);
		System.out.println(num);
		
		//Int to String
		int number=123;
		
		String result=Integer.toString(number);
		System.out.println(result);
		
		
		
	}

}
