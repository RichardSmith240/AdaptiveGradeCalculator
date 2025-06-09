import java.sql

public class UserData {
	public static void main( String args[] ) {
		Connection c = null;
		Statement stmt = null;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:data.db");
		} catch ( Exception e ) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
		System.out.println("Opened database successfully");
		stmt = c.createStatement();
        String sql = {
			"CREATE TABLE USERS" + 
			"(USERID INT PRIMARY KEY NOT NULL," +
            " NAME TEXT NOT NULL, " + 
			" EMAIL TEXT NOT NULL, " +
            " PASSWORD INT NOT NULL)";
        }
		stmt.executeUpdate(sql);
        stmt.close();
        c.close();
    } catch ( Exception e ) {
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	    System.exit(0);
    }
	System.out.println("Table created successfully");
}
