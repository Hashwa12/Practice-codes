package strings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Swap {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection conn = DriverManager.getConnection("","","");
//		Statement st = conn.createStatement();
//		ResultSet r = st.executeQuery("Select * from emp");
//		while (r.hasNext()) {
//			System.out.println(r.getInt(1)+"  "+r.getString(2));
//		}
//		r.close();

		System.out.println("Enter the string to swap:");
		Scanner in = new Scanner(System.in);
		String str1 = in.nextLine();
		String str2= in.nextLine();
		
		str1 = str1+str2;
//		System.out.println(str1);
		
		str2=str1.substring(0, str1.length()-str2.length());
		str1=str1.substring(str2.length());
		
		System.out.println(str1+"      "+str2);
		
	}

}
