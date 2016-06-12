package com.lhb.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lhb.bean.User;
import com.lhb.generic.AbstractGenericService;
import com.lhb.mapper.UserMapper;
import com.lhb.service.ITopicService;
import com.lhb.service.IUserService;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class UserService extends AbstractGenericService<User, Integer> implements IUserService{

	@SuppressWarnings("unused")
	private UserMapper userMapper;
	@Resource
    private ITopicService topicService;

	@Resource
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
		super.setMapper(userMapper);
	}

	@Override
	public void testTrasaction() {

		User user = new User();
		user.setUsername("u5");
    	user.setPassword("p5");
    	System.out.println(save(user));
    	System.out.println(topicService.selectOne(1).getMessage());
	}
}
