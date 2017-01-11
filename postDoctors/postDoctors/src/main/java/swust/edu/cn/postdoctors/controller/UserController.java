package swust.edu.cn.postdoctors.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

import swust.edu.cn.postdoctors.model.User;
import swust.edu.cn.postdoctors.service.UserService;

@Controller
@RequestMapping("/userController")
public class UserController {
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
    @SuppressWarnings({ "finally", "unchecked" })
	@RequestMapping("/selectUserById")
    public ModelAndView selectUserById(int id, HttpServletRequest request,HttpServletResponse response) {
    	ModelAndView mav = new ModelAndView();
		MappingJacksonJsonView view = new MappingJacksonJsonView();
		@SuppressWarnings("rawtypes")
		Map map = new HashMap();
		try {
			User user=new User();
			user=userService.findUserById(id);
			map.put("result", Boolean.TRUE);
			map.put("message", "成功！");
			map.put("user", user);
		} catch (Exception e) {
			map.put("result", Boolean.FALSE);
			map.put("message", "执行出现出错！");
			e.printStackTrace();
		}finally{
			view.setAttributesMap(map);
			mav.setView(view);
			return mav;
		}
	}
}