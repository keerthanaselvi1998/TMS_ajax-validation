package org.tms.dao;

import org.tms.beans.User;

public interface UserDao {
	public boolean validateUser(User user);
	public boolean registrationValidation(int uid);
}
