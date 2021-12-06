package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home url");
		
		model.addAttribute("name","Durgesh Tiwari");
		model.addAttribute("id",1234);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Ram");
		friends.add("Shyam");
		friends.add("sita");
		
		model.addAttribute("f", friends);
		return "index";  
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about page");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help controller");
		//Creating modelAndView object
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("name", "Himanshu");
		modelAndView.addObject("EmpId", 1111);
		
		//Adding local time
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(1245);
		list.add(21);
		list.add(748);
		
		modelAndView.addObject("marks", list);
		
		//Setting the viewName
		modelAndView.setViewName("help");
		return modelAndView;
	}

}
