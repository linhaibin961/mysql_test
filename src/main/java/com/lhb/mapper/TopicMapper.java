package com.lhb.mapper;

import org.springframework.stereotype.Repository;

import com.lhb.bean.Topic;
import com.lhb.generic.IGenericMapper;

@Repository
public interface TopicMapper extends IGenericMapper<Topic, Integer> {

}
