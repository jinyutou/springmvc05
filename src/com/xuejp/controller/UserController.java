package com.xuejp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xuejp.po.UserInfo;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/add1")
	public String add(HttpServletRequest request){
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		System.out.println(userName+"=====新增用户信息======="+password);
		return "user_add1";
	}
	@RequestMapping("/add2")
	public String add(String userName,String password){
		System.out.println(userName+"=====新增用户信息======="+password);
		return "user_add2";
	}
	@RequestMapping("/add3")
	public String add3(UserInfo user){
		System.out.println(user);
		return "user_add3";
	}
	@RequestMapping("/add4")
	public String add4(Integer userId,Date userTime){
		System.out.println("=====userId=====>"+userId);
		System.out.println("=====userTime=====>"+userTime);
		return "user_add4";
	}
	
	/**时间属性编辑器
	 * @param bin
	 */
	@InitBinder
	public void intiBinder(ServletRequestDataBinder bin){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		CustomDateEditor cde = new CustomDateEditor(sdf, true);
		bin.registerCustomEditor(Date.class, cde);
	}
}
