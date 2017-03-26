package Utils;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class MySQLTest {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Connection con = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/Company";
				String username = "root"; String password = "kiran123";
				
				con = DriverManager.getConnection(url, username, password);
				if (con != null) {
					System.out .println("Successfully connected to MySQL database test"); } } 
			catch (Exception ex) { System.out .println("An error occurred while connecting MySQL databse"); ex.printStackTrace(); }
			}
		}



