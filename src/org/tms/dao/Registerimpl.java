package org.tms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.tms.beans.Register;
import org.tms.util.DBConstants;
import org.tms.util.DBUtil;


public class Registerimpl implements RegisterDao {
	public boolean insert(Register r) {
		Connection con=null;
		PreparedStatement pst=null;
		boolean b=false;
		try {
			con=DBUtil.getConnection(DBConstants.DRIVER, DBConstants.URL, DBConstants.UNAME, DBConstants.PWD);
			pst=con.prepareStatement("insert into register(userId,password,fname,lname,hiredate,vertical,designation,location,phone,role) values(?,?,?,?,?,?,?,?,?,?)");
			pst.setInt(1, r.getUid());
			pst.setString(2, r.getFname());
			pst.setString(3, r.getPass());
			pst.setString(4, r.getLname());
			pst.setString(5, r.getDate());
			pst.setString(6, r.getVertical());
			pst.setString(7, r.getDesignation());
			pst.setString(8, r.getLocation());
			pst.setString(9, r.getPhone());
			pst.setString(10, r.getRole());
			int s=pst.executeUpdate();
			
			if(s>0)
				b=true;
			else
				b=false;
			con.close();
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return b;
	}

}
