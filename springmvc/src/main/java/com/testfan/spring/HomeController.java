package com.testfan.spring;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.testfan.dao.TUserMapper;
import com.testfan.spring.ioc.User;

/**
 * Handles requests for the application home page.
 */
@RestController
@RequestMapping(value = "/home")
public class HomeController {

	@Autowired(required=false)
	private User user;
	
	@Autowired
	private TUserMapper userMapper;

	@Autowired(required=false)
	HttpServletRequest request;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		model.addAttribute("user", user);
		return "home";
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		model.addAttribute("user", user);
		return "home";
	}

	// 页面跳转和传参数 ModelAndView 方式
	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public ModelAndView test1() {
		ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject("name", "test12222");
		return modelAndView;
	}

	// request 方式
	@RequestMapping("/test2")
	public String test2(HttpServletRequest reques) {
		reques.setAttribute("name_test2", "test2");
		return "home";
	}

	// request 方式
	@RequestMapping("/test3")
	public String test3() {
		request.setAttribute("name_test3", "test3");
		return "home";
	}

	// 参数传递
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam("name") String nametest, String pass) {
		UserBean user = new UserBean();
		user.setName(nametest);
		user.setPass(pass);
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("user", user);
		return new ModelAndView("home", data);
	}

	// 自动注入对象
	@RequestMapping("/loginbean")
	public ModelAndView login(UserBean bean) {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("user", bean);
		return new ModelAndView("home", data);
	}

	// 地址参数
	@RequestMapping("/url/{id}")
	public String url1(UserBean bean, @PathVariable("id") Integer id) {
		System.out.println(id);
		request.setAttribute("user", bean);
		request.setAttribute("id", id);
		return "home";
	}

	// json支持
	@RequestMapping("/testjson")
	@ResponseBody
	public String testjson() {
		return "home";
	}
	
	@RequestMapping(value = "/map")
	@ResponseBody
	public Map<String, String> map() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "1");
		return map;
	}
	
	@RequestMapping(value = "/user1")
	@ResponseBody
	public UserBean getUser1(UserBean user) {
		return user;
	}
	
	@RequestMapping(value = "/user2")
	@ResponseBody
	public UserBean getUser2(@RequestBody UserBean user) {
		return user;
	}
	
	@RequestMapping(value = "/jsoncount")
	@ResponseBody
	public List<UserBean> getUser(int count) {
		List<UserBean> userList = new ArrayList<UserBean>();
		   for(int i=0;i<count;i++) {
			   userList.add(new UserBean("test"+i,"pass"+i));
		   }
		return userList;
	}
	
	//不支持
	@RequestMapping(value = "/jsoncount2")
	@ResponseBody
	public List<UserBean> getUser2(@RequestBody int count) {
		List<UserBean> userList = new ArrayList<UserBean>();
		   for(int i=0;i<count;i++) {
			   userList.add(new UserBean("test"+i,"pass"+i));
		   }
		return userList;
	}
	
	
	
	@RequestMapping(value = "/jsoncount3")
	@ResponseBody
	public List<UserBean> getUser2(@RequestBody Map o) {
		int count = Integer.parseInt( o.get("count").toString());
		List<UserBean> userList = new ArrayList<UserBean>();
		   for(int i=0;i<count;i++) {
			   userList.add(new UserBean("test"+i,"pass"+i));
		   }
		return userList;
	}

}
