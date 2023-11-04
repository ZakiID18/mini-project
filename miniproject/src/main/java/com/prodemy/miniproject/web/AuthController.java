package com.prodemy.miniproject.web;

<<<<<<< HEAD
import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.prodemy.miniproject.dto.ProductDto;
import com.prodemy.miniproject.dto.UserDto;
import com.prodemy.miniproject.model.User;
import com.prodemy.miniproject.service.ProductService;
import com.prodemy.miniproject.service.UserService;

import jakarta.validation.Valid;
=======
import com.prodemy.miniproject.dto.ProductDto;
import com.prodemy.miniproject.dto.UserDto;
import com.prodemy.miniproject.model.User;
import com.prodemy.miniproject.service.ProductService;
import com.prodemy.miniproject.service.UserService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
>>>>>>> branch 'master' of https://github.com/ZakiID18/mini-project.git

@Controller
public class AuthController {
	
	private UserService userService;
	private ProductService productService;

	public AuthController(UserService userService, ProductService productService) {
		this.userService = userService;
		this.productService = productService;
	}
	
	// Handler method to handle home page request
    @GetMapping("/home")
    public String home(){
        return "home";
    }

    // Handler method to handle login request
    @GetMapping("/login")
    public String login(){
        return "login";
    }
	
	// Handler method to handle user registration form request
    @GetMapping("/register")
    public String showRegistrationForm(Model model){
        // create model object to store form data
        UserDto user = new UserDto();
        model.addAttribute("user", user);
        return "register";
    }
	
    // Handler method to handle user registration form submit request
    @PostMapping("/register/save")
    public String registration(@Valid @ModelAttribute("user") UserDto userDto,
                               BindingResult result,
                               Model model){
        User existingUser = userService.findUserByEmail(userDto.getEmail());

        if(existingUser != null && existingUser.getEmail() != null && !existingUser.getEmail().isEmpty()){
            result.rejectValue("email", null,
                    "There is already an account registered with the same email");
        }

        if(result.hasErrors()){
            model.addAttribute("user", userDto);
            return "/register";
        }

        userService.saveUser(userDto);
        return "redirect:/register?success";
    }
    
    // Handler method to handle list of users
    @GetMapping("/users")
    public String users(Model model){
        List<UserDto> users = userService.findAllUsers();
        model.addAttribute("users", users);
        return "users";
    }
    
    @GetMapping("/products")
    public String listProductHome(Model model){
        List<ProductDto> products = productService.findAllProducts();
        model.addAttribute("products", products);
        return "products";
    }
    
    @GetMapping("/checkout")
    public String checkout() {
    	return "checkout";
    }
    
    @GetMapping("/history")
    public String history() {
    	return "history";
    }
    
    @GetMapping("/profile")
    public String profile() {
    	return "profile";
    }


    private UserService userService;
    private ProductService productService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("index")
    public String home(){
        return "index";
    }

    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }

    // handler method to handle user registration request
    @GetMapping("register")
    public String showRegistrationForm(Model model){
        UserDto user = new UserDto();
        model.addAttribute("user", user);
        return "register";
    }

    // handler method to handle register user form submit request
    @PostMapping("/register/save")
    public String registration(@Valid @ModelAttribute("user") UserDto user,
                               BindingResult result,
                               Model model){
        User existing = userService.findUserByEmail(user.getEmail());
        if (existing != null) {
            result.rejectValue("email", null, "There is already an account registered with that email");
        }
        if (result.hasErrors()) {
            model.addAttribute("user", user);
            return "register";
        }
        userService.saveUser(user);
        return "redirect:/register?success";
    }

    @GetMapping("/users")
    public String listRegisteredUsers(Model model){
        List<UserDto> users = userService.findAllUsers();
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/home")
    public String listProductHome(Model model){
        List<ProductDto> products = productService.findAllProduct();
        model.addAttribute("products", products);
        return "products";
    }
}
