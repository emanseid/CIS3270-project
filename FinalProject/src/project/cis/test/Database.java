import java.sql.*;

public class Database {
	// Initialization of database components
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	String url = "jdbc:mysql://localhost:3306/demo";
	String user = "root";
	String password = "root";
	String query = "select * from users where userid = ? and pwd = ?";
	
	Database(){
		try{
			// Connecting to mySql database
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
			pst = con.prepareStatement(query);
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	public Boolean checkLogin(String username, String pwd){
		try{
			// Checks for username in login
			pst.setString(1, username);
			// Checks for password in login
			pst.setString(2, pwd);
			// Executes the prepared statement
			rs = pst.executeQuery();
			if(rs.next()){
				// Returns true if login matches
				return true;
			}
			else{
				// Returns false if login does not match
				return false;
			}
		}
		catch(Exception e){
			// Exception handling while checking for login
			System.out.println("error while validating" + e);
			return false;
		}
		
	}
	

}
