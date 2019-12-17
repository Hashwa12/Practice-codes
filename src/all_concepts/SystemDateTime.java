package all_concepts;

import java.sql.Date;
import java.sql.Time;
import java.util.Calendar;

public class SystemDateTime {

	public static void main(String[] args) 
	{
		Date d = new Date(System.currentTimeMillis());
		System.out.println(d);
		
		Time t = new Time(System.currentTimeMillis());
		System.out.println(t);
		
	}


}
