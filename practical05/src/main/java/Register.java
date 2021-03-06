import java.sql.*;

public class Register {
	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/savan";
		String uname = "root";
		String pass = "rootdemo";
		
		System.out.println("Savan Patel\n180770107153\n6th Sem");

		Class.forName("com.mysql.cj.jdbc.Driver"); //Do add throws Exception because forName check for exception.
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		
		// Adding data to DB
		String query = "insert into student values ('180770107002','test','demo','6','9898989898') ";
		int count = st.executeUpdate(query);
		System.out.println(count + " row's affected");

		
		
		// Displaying table after adding data
		String query1 = "select * from student";
		ResultSet rs = st.executeQuery(query1);
		String userData = "";
		while(rs.next()){
			userData = rs.getString(1) + " : " + rs.getString(2) + " : " + rs.getString(3) + " : " + rs.getInt(4) + " : " + rs.getString(5);
			System.out.println(userData);
		}
		System.out.println();
		
		
		// Updating the values
		String query2 = "UPDATE student SET firstname = 'demo' WHERE enrollment = '180770107002'";
	    st.executeUpdate(query2);

	    
	    //Displaying again to check updated values
		ResultSet rs1 = st.executeQuery(query1);
		while(rs1.next()){
			userData = rs1.getString(1) + " : " + rs1.getString(2) + " : " + rs1.getString(3) + " : " + rs1.getInt(4) + " : " + rs1.getString(5);
			System.out.println(userData);
		}
		System.out.println();

		
		// Delete Query
		String query3 = "DELETE FROM student WHERE enrollment = '180770107002'";
		st.executeUpdate(query3);
		
		
		
		ResultSet rs11 = st.executeQuery(query1);
		while(rs11.next()){
			userData = rs11.getString(1) + " : " + rs11.getString(2) + " : " + rs11.getString(3) + " : " + rs11.getInt(4) + " : " + rs11.getString(5);
			System.out.println(userData);
		}
		System.out.println();

		
		st.close();
		con.close();
		
	}
}