package com.scp.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

import com.mysql.cj.xdevapi.Statement;

public class JdbcDemo {

	public static void main(String[] args) //throws ClassNotFoundException, SQLException {
	{
		try{System.out.println("in try");
		
       Class.forName("com.mysql.jdbc.Driver");
       Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");
       java.sql.Statement st=  con.createStatement();
       ResultSet rs= st.executeQuery("select * from MyStudentTable");
      
      System.out.println( "Result");
       System.out.println();
       
   	while(rs.next())
	{
		
		System.out.print(rs.getInt("id") +"  ");
		System.out.print(rs.getString("StudName") +"  ");
		System.out.print(rs.getString("StudAddr") +"  ");
		System.out.print(rs.getInt("StudAge") +"  ");
		System.out.println();
		
	      
	
	}
    st.close();
    con.close();
  
		
		}
	
		catch (Exception e) {
			e.printStackTrace();
		}
	//System.out.println(Arrays.toString(listofStud));
    /*   String name=rs.getString("select * from MyStudentTable where id=?");
       System.out.println(name);*/
     
		
		/*  con.close();
       st.close();
       */
	}

}
