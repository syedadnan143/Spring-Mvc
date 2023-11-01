package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class recontroller {
	@RequestMapping("/one")
	public RedirectView one() {
		System.out.println("this is my first");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("https://www.google.com");
	    return redirectView;			
	
	}
	@RequestMapping("/two")
public String two() {
	
	System.out.println("this is my second url");
	return "contact";
}

}
