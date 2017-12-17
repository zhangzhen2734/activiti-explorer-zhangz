package com.cjt.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cjt.domain.User;
import com.cjt.service.IUserService;

/**
 * @author alun
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	public UserController() {
		System.out.println("UserController");
	}

	@Resource
	private IUserService userService;
	@ResponseBody 
	@RequestMapping(value="/showUser",  method = RequestMethod.GET, produces = "application/json")
	public User toIndex() {
		System.out.println("UserController showUser");
		User user = new User();
        return user;  
	}
	
}
