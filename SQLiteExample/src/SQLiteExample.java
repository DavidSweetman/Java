import java.sql.*;


public class SQLiteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection c = null;
		Statement stmt = null;
		try{
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:students.sqlite");
			
			
			stmt = c.createStatement();
			String sql = "CREATE TABLE COMPANY " + "(ID INT PRIMARY KEY NOT NULL," + " NAME TEXT NOT NULL, " + " AGE INT NOT NULL, " +" ADDRESS CHAR(50), " + "SALARY REAL)";
			//stmt.executeUpdate(sql);
			
			String sql1 = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
					+ "VALUES (2, 'Jon', 21 , 'Vegas', 20000.00);";
			stmt.executeUpdate(sql1);
			
			} catch (Exception e){
				System.err.println(e.getClass().getName() + ": " + e.getMessage());
				
			}
		
	}

}
