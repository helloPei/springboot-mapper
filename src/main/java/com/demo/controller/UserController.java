package com.demo.controller;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.pojo.User;
import com.demo.service.UserService;
import com.github.pagehelper.PageInfo;
/**
 * User控制层
 * @author Administrator
 *
 */
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("findAll")
	public String findAll(Model model) {		
		PageInfo<User> userPage = userService.findAllUser();
		model.addAttribute("userPage", userPage);
		return "index";
	}
	
}