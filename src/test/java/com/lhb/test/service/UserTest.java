package com.lhb.test.service;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.lhb.bean.User;
import com.lhb.service.IUserService;

/**
 * Created by ljdo on 2016/4/13.
 */
@ContextConfiguration(locations = {"classpath:spring-core.xml"})
public class UserTest extends AbstractJUnit4SpringContextTests {

    @Resource
    private IUserService userService;
    
    @Test
    public void insert(){
    	User user = userService.selectOne(1);
    	System.out.println(user.getUsername());
    }
    
}
