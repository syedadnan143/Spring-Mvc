package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.Data;
import springmvc.service.DataService;

@Controller
public class ContactController {
	@Autowired
	private DataService dataService;
	@ModelAttribute
	public void commonDataForModel(Model m) {
		
		m.addAttribute("Header", "welcome this is addy's form");
		m.addAttribute("Desc", "home for programmer");
		System.out.println("adding common data");
	}
	@RequestMapping("/contact")
	public String showform(Model m) {
		System.out.println("CREATING FORM");
		return "contact";
	}

// this is the old method which we used in servlets
	/*
	 * public String handleform(HttpServletRequest request) { String name =
	 * request.getParameter("name"); System.out.println("user name is"+ name);
	 */

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute("data") Data data, Model model) {
   System.out.println(data);
       if(data.getName().isEmpty()) {
    	   return "redirect:/contact";
       }
         int createduser =  this.dataService.createData(data);
         model.addAttribute("msg", "user created with id"+createduser);
		// model attribute
		return "success";
		//Data data = new Data();
		/*
		 * data.setName(name); data.setEmail(email); data.setPassword(password);
		 */
		// processing
		/*
		 * model.addAttribute("name", name); model.addAttribute("email", email);
		 * model.addAttribute("password", password);
		 */

//		model.addAttribute("data", data);

		/*
		 * System.out.println(" user name"+name );
		 * System.out.println("user email"+email);
		 * System.out.println("user password"+password);
		 */
		
	}
}

/*
 * @RequestMapping( path="/processform", method=RequestMethod.POST) public
 * String handleform(
 * 
 * @RequestParam("name")String name,
 * 
 * @RequestParam("email")String email,
 * 
 * @RequestParam("password")String password, Model model ) {
 * 
 * // model attribute
 * 
 * Data data = new Data(); data.setName(name); data.setEmail(email);
 * data.setPassword(password); // processing
 * 
 * model.addAttribute("name", name); model.addAttribute("email", email);
 * model.addAttribute("password", password);
 * 
 * 
 * model.addAttribute("data", data);
 * 
 * 
 * 
 * System.out.println(" user name"+name );
 * System.out.println("user email"+email);
 * System.out.println("user password"+password);
 * 
 * return "success"; } }
 */