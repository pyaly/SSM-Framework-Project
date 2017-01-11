package swust.edu.cn.postdoctors.service;

import swust.edu.cn.postdoctors.model.User;

public interface UserService {
	public User findUserById(int id) throws Exception;
}
