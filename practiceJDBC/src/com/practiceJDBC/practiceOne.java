package com.practiceJDBC;
import java.sql.*;

public class practiceOne {
	public static void main(String args[]) throws Exception {
		String url="jdbc:mysql://localhost:3306/sys";
		String username="root";
		String pass="akash";
		String query="select * from student";
		int userid=6;
		String usern="Bikash";
//		String query1="insert into student values(" + userid +",'" + usern + "')";
		String query1="insert into student values(?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");//Its not necessary to write . 
		Connection con = DriverManager.getConnection(url,username,pass);
//		Statement st=con.createStatement();
		PreparedStatement st = con.prepareStatement(query1);
		st.setInt(1, userid);
		st.setString(2,usern);
//		int count =st.executeUpdate(query1);
		int count=st.executeUpdate();
		System.out.println(count+" row/s affected");
		ResultSet rs =st.executeQuery(query);
		while (rs.next()) {
            int id = rs.getInt("id"); // adjust column names based on your table
            String name = rs.getString("pname");
            System.out.println("ID: " + id + ", Name: " + name);
        }
		rs.close();
		st.close();
		con.close();
			
		
	}
}
