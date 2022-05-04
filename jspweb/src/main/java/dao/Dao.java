package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {
	 
	protected Connection con;
	protected ResultSet rs;
	protected PreparedStatement ps; 
	
	public Dao() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsptest?serverTimezone=UTC","root","1234");
			System.out.println("연동 성공");
			
		}catch (Exception e) { System.out.println("Dao class connect error"+e);	}
		
	}
	
	
	
	
	
}
