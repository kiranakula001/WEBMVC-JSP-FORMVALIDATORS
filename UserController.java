package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;
import spring.user.User;

@Controller
public class UserController {
		@GetMapping("/")
		public String getForm(Model model) {
			User u = new User();
			model.addAttribute("user", u);
			return "index";
		}
		
		@PostMapping("/register")
		public String handleRegisterbtn(@Valid User userForm,BindingResult result,	 Model model)
		{
			if(result.hasErrors())
			{
				return "index";
			}
			System.out.println(userForm);
			model.addAttribute("msg","Your Registration Successfull!!!!");
			return "success";
			
		}
}
