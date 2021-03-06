package simpleinterest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SimpleInterestController {
	@RequestMapping(value="/simple", method=RequestMethod.GET)
	public String showReadPage()
	{
		return "simpleinterest";
	}
	
	@RequestMapping(value="/simple", method=RequestMethod.POST)
	public String calculatesimple(@RequestParam float pamount,
			@RequestParam float year,@RequestParam float rate,ModelMap model)
	{
		float result=pamount*(1+rate*year);
		
		System.out.println(result);
		model.put("result", result);

		return "showresult";
	}
	
}
