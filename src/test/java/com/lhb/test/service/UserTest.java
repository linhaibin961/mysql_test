package com.lhb.test.service;


import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.lhb.bean.User;
import com.lhb.service.ITopicService;
import com.lhb.service.IUserService;

/**
 * Created by ljdo on 2016/4/13.
 */
@ContextConfiguration(locations = {"classpath:spring-core.xml"})
public class UserTest extends AbstractJUnit4SpringContextTests {

    @Resource
    private IUserService userService;
    @Resource
    private ITopicService topicService;
    
    @Test
    public void insert(){
    	User user = userService.selectOne(1);
    	System.out.println(user.getUsername());
    }
    
    @Test
    public void save(){
    	User user = new User();
    	user.setUsername("u7");
    	user.setPassword("p7");
    	System.out.println(userService.save(user));
    	System.out.println(topicService.selectOne(1).getMessage());
    }
    
    @Test
    public void testTrasaction(){
    	try {
			userService.testTrasaction();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	System.out.println("###############");
    }
}
