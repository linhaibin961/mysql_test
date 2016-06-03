package com.lhb.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lhb.bean.User;
import com.lhb.generic.AbstractGenericService;
import com.lhb.mapper.UserMapper;
import com.lhb.service.IUserService;

@Service
public class UserService extends AbstractGenericService<User, Integer> implements IUserService{

	@SuppressWarnings("unused")
	private UserMapper userMapper;

	@Resource
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
		super.setMapper(userMapper);
	}
}
