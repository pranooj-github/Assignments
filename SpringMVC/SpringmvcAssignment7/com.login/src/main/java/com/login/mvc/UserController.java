package com.login.mvc;



import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String showLoginPage(Model model)
	{
		model.addAttribute("user", new UserModel());
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String UserValidate(@Valid @ModelAttribute("user") UserModel user,BindingResult result,Model model)
	{
		if(result.hasErrors())
		{
			if (result.getFieldError("zipcode") == null && result.getGlobalError()!=null) {

				model.addAttribute("errorZip",result.getGlobalError().getDefaultMessage());

			}
			model.addAttribute("user", user);
			System.out.println(result);
			return "login";
		}
		System.out.println(user);
		
		return "success";
	}
}
