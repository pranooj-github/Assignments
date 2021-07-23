package com.userRegandLog.userreg;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UserRegisterController {
	List<UserModel> userList= new ArrayList<>();
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String showregisterPage()
	{
		return "register";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String calculatesimple(@ModelAttribute UserModel user,ModelMap model)
	{
		userList.add(user);
		model.put("user", user);
		return "login";
	}
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String showLoginPage()
	{
		return "login";
		//
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String UserValidate(@ModelAttribute UserModel user,ModelMap model)
	{
		model.put("user", user);
		for (UserModel userModel : userList) {
			if(user.getUsername().equals(userModel.getUsername())&& user.getPassword().equals(userModel.getPassword()))
			{
				return "success";
			}
			
		}
		return "error";
		
	}
}
