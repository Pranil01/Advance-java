package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//step1: register driver
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			//step2: connect to the database 
		    String url = "jdbc:mysql://192.168.10.150:3306/dac23_campus";
			Connection con = DriverManager.getConnection(url,"dac23","welcome");
			if(con!=null)
			{
				System.out.println("connection done");
			}
			else {
				System.out.println("connection failed");
			}
			//step3: create statement 
		Statement st = con.createStatement();
		//step4:execute query.
		ResultSet rs = st.executeQuery("select * from emp");
		
		while(rs.next()) {
			System.out.println("empno = " + rs.getInt(1));
			System.out.println("ename = " + rs.getString(2));
			
			System.out.println("sal = " + rs.getInt(7));
		}
		
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		
	
	

}
}
