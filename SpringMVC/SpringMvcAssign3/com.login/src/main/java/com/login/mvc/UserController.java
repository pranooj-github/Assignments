package com.login.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String showLoginPage()
	{
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String UserValidate(@ModelAttribute UserModel user,ModelMap model)
	{
		model.put("user", user);
		if(user.getUsername().equals("amma")&& user.getPassword().equals("keerthi"))
		{
			return "success";
		}
		return "error";
	}
}
