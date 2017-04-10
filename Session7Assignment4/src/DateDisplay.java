import  java.util.*;
/*
 * Write a program which accepts the date (date month year), separated by
coma / space or both and print the date the format of YYYY-MM-DD Ex :
21,May,2012 / 21 May 2012 / 21, May, 2012.

 */

//Exception to handle errors
class dateException extends Exception
{
	dateException(String s)
	{
		super(s);
	}
}

//class datedisplay
public class DateDisplay
{
	public static void main(String args[])
	{
		//try block 
		try
		{
			DateGet d =new DateGet();
			d.getDate();
			d.display();
		}
		
		//catch block
		catch(Exception e)
		{
			System.out.println("Exception occured main"+e);
		}
		
	}
}

//class dateget
class DateGet
{
	String dd,mm,yy;
	String da=new String();
	String date= new String();
	
	void getDate() throws dateException
	{
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter date (1 or 2 digit) month(first 3 letters of month) year(4 digit year)"); 
		System.out.println("Enter date (date month year) or (date/month/year) or(date,month,year) -->");
		
		//input of date in string format
		date= input.nextLine();
		//System.out.println(date);
		
		//trim used to get rid of blank spaces
		da=date.trim();
			
		System.out.println("Date entered by user--->"+da);
		//System.out.println(da);
		int l= da.length();
		//System.out.println(l);
		
		//check the length of date entered if it is more than 11 throw an exception
		//valid date format: 12 mar 2019
		//invalid format 12 march 2018 or 12 mar 99
		
		if(l>11)
				throw new dateException("invalid date entry");
		else
		{
			//System.out.println(l);
			
			dd=	da.substring(0,2);
			mm=	da.substring(3,6);
			yy=	da.substring(7,11);
			
			//System.out.println("date="+dd);
			//System.out.println("month="+mm);
			//System.out.println("year="+yy);
		}
		
	}
		
	//displaying date in required format
	void display()
	{
		System.out.print("Date in desired format --->");
		System.out.print(yy+"/"+mm+"/"+dd);
		
		
	}
	   
}	

