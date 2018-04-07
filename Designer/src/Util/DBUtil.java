package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class DBUtil {

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/designer";
	private static final String USER = "root";
	private static final String PWD = "1234";

	Connection con;
	PreparedStatement prest;
	ResultSet rs;
	
	private static DBUtil instance = null;

	public DBUtil() {
		
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Connection getConnection() throws SQLException {
		return con = DriverManager.getConnection(URL, USER, PWD);
	}

	public void close() {
		if (rs != null) {
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (prest != null) {
			try {
				prest.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (con != null) {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public ResultSet query(String sql,Object ... obj) {
		try {
			con = getConnection();
			prest = con.prepareStatement(sql);
			
			if(obj!=null&&obj.length>0){
				for(int i=0;i<obj.length;i++){
					prest.setObject(i+1, obj[i]);
				}
			}
			
			rs = prest.executeQuery();
			return rs;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean update(String sql,Object ... obj){
		int count = 0;
		try {
			con = getConnection();
			prest = con.prepareStatement(sql);
			
			if(obj!=null&&obj.length>0){
				for(int i=0;i<obj.length;i++){
					prest.setObject(i+1, obj[i]);
				}
			}
			
			count =  prest.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			close();
		}
		return count == 1;
	}
	
	public static DBUtil getInstance(){
		if(instance==null){
			instance = new DBUtil();
		}
		return instance;
		
	}
	
	

}
