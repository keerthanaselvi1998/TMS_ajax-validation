package org.tms.dao;


import java.sql.Connection;
import java.sql.ResultSet;

import org.tms.beans.User;
import org.tms.util.DBConstants;
import org.tms.util.DBUtil;

import com.mysql.jdbc.PreparedStatement;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean validateUser(User user) {
		Connection con=null;
		PreparedStatement pst=null;
		boolean b=false;
		try {
			con=DBUtil.getConnection(DBConstants.DRIVER, DBConstants.URL, DBConstants.UNAME,DBConstants.PWD);
			pst=(PreparedStatement) con.prepareStatement("select * from register where userId=? and password=?");
			pst.setInt(1,user.getUserId());
			pst.setString(2, user.getPassword());
			ResultSet rs= pst.executeQuery();
		
			if(rs.next())
			{
				b=true;
			}
			else
				b=false;
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return b;
	}
	public boolean registrationValidation( int uid) {
		Connection con=null;
		PreparedStatement pst=null;
		boolean b=false;
		try {
			con=DBUtil.getConnection(DBConstants.DRIVER, DBConstants.URL, DBConstants.UNAME,DBConstants.PWD);
			pst=(PreparedStatement) con.prepareStatement("select * from register where userId=? ");
			pst.setInt(1,uid);
			
			ResultSet rs= pst.executeQuery();
		
			if(rs.next())
			{
				b=true;
			}
			else
				b=false;
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return b;
	}
}

