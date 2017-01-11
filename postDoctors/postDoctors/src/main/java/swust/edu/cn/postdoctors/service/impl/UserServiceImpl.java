package swust.edu.cn.postdoctors.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import swust.edu.cn.postdoctors.dao.UserMapper;
import swust.edu.cn.postdoctors.model.User;
import swust.edu.cn.postdoctors.service.UserService;


@Service("userService")
public class UserServiceImpl implements UserService {
	private UserMapper userMapper;
	
	public UserMapper getUserMapper() {
		return userMapper;
	}

	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@SuppressWarnings("finally")
	public User findUserById(int id) throws Exception {
		User user=new User();
		try {
			user=userMapper.selectByPrimaryKey(id);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			return  user;
		}
	}

}
