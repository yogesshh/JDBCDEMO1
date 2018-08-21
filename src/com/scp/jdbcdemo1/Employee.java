package com.scp.jdbcdemo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/YOGESH","root","root");
		Statement st= con.createStatement();
		ResultSet rs= st.executeQuery("select * from Employee");
		
		while(rs.next()){
		System.out.println(rs.getInt("id")+"  ");
		System.out.println(rs.getString("EmpName")+"  ");
		System.out.println(rs.getString("EmpAdd")+"  ");
		System.out.println(rs.getInt("EmpAge")+"  ");
		System.out.println();
		}
		st.close();
		con.close();
		
		
		
		
	}

}
