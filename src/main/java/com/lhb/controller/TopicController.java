package com.lhb.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lhb.bean.Topic;
import com.lhb.service.ITopicService;

@Controller
@RequestMapping("topic/")
public class TopicController {

	@Resource
	ITopicService topicService;
	
	@RequestMapping("list")
	public String list(HttpServletRequest hsr){
		Topic user = topicService.selectOne(1);
		hsr.setAttribute("message", user.getMessage());
		return "topic/list";
	}
}
