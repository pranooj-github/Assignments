package webapp.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	@RequestMapping(value="/helloWorld")
	public String Helloworld()
	{
		return "helloWorld";
	}
}
