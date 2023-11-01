package springmvc.controller;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home(Model model)
	{
		System.out.println("this is my home");
		model.addAttribute("name", "adnan Syed");
		model.addAttribute("Id",123);
//		List<String>friends=new ArrayList<String>();
//		friends.add("adnan");
//		friends.add("sharukh");
//		friends.add("my name here");
//		model.addAttribute("f", friends);
		
		return "index";
	}
	
	@RequestMapping("/about")
		public String about() {
			System.out.println("this is my about");
			return "about";
		}
	
	// marks

	
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is my help controller");
		
		// creating model and view here
		ModelAndView modelAndView = new ModelAndView();
		// creating object
		modelAndView.addObject("name", "patel");
		modelAndView.addObject("id", 39455);
		return modelAndView;
		}
	
	}


