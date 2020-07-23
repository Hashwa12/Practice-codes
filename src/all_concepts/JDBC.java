package all_concepts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Mysql@1234");
		Statement st = conn.createStatement();
		ResultSet r = st.executeQuery("Select * from registration");
		while (r.next()) {
			System.out.println(r.getString(2)+"  "+r.getString(3));
		}
		r.close();
	}
}

