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
			"CREATE TABLE CLASSES" + 
			"(CLASSNUM INT PRIMARY KEY NOT NULL," +
            " USERID INT FOUREIGN KEY REFERENCES USERS NOT NULL, " +
			" GRADE FLOAT NOT NULL, "
            " CLASSNAME TEXT NOT NULL)";
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
