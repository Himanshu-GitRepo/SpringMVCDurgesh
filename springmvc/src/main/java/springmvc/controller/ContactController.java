package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "LearnCodeWith Himanshu");
		m.addAttribute("Desc", "Home for Programmer");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model m) {
		
		return "contact";
	}
	
	/*
	@RequestMapping(path= "/processform", method = RequestMethod.POST)
	public String handleForm(@RequestParam("email") String userEmail ,
			@RequestParam("userName") String userName,
			@RequestParam("password") String userPassword, Model model) {
		
		System.out.println("user Email " + userEmail);
		System.out.println("user Name " + userName);
		System.out.println("user Password " + userPassword);
		
		User user=new User();
		
		user.setEmail(userEmail);
		user.setUserName(userName);
		user.setPassword(userPassword);
		
		System.out.println(user);
		
		//Process
		
//		model.addAttribute("name", userName);
//		model.addAttribute("email", userEmail);
//		model.addAttribute("password", userPassword);
		
		model.addAttribute("user", user);
		
		return "success";
	}

}
*/
	
	
// Similarly By using @ModelAttribute annotation
@RequestMapping(path= "/processform", method = RequestMethod.POST)
public String handleForm(@ModelAttribute("user") User user, Model model) {
	System.out.println(user);
	this.userService.createUser(user);
	
	return "success";
}

}
