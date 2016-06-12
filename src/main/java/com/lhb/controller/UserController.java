package com.lhb.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lhb.bean.User;
import com.lhb.service.IUserService;

@Controller
@RequestMapping("user/")
public class UserController {

	@Resource
	IUserService userService;
	
	@RequestMapping("list")
	public String list(HttpServletRequest hsr){
		User user = userService.selectOne(1);
		hsr.setAttribute("user", user.getUsername());
		hsr.setAttribute("list", "amdin");
		return "user/list";
	}
	@RequestMapping("testTrasaction")
	public String testTrasaction(HttpServletRequest hsr){
		try {
			userService.testTrasaction();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	System.out.println("###############");
    	hsr.setAttribute("user","testTrasaction is success");
		return "user/list";
	}
}
