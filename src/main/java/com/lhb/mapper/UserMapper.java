package com.lhb.mapper;

import org.springframework.stereotype.Repository;

import com.lhb.bean.User;
import com.lhb.generic.IGenericMapper;

@Repository
public interface UserMapper extends IGenericMapper<User, Integer> {

}
