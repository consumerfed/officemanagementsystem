package net.cfed.oms.dao;
import java.sql.*;

import java.sql.DriverManager;

//connector class should be in xml file
public class Connector {
	public static Connection connections()
	{
		Connection con = null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/cfedapps","root","root");
			//return con;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}

}