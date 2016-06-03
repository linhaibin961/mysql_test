package com.lhb.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lhb.bean.Topic;
import com.lhb.generic.AbstractGenericService;
import com.lhb.mapper.TopicMapper;
import com.lhb.service.ITopicService;

@Service
public class TopicService extends AbstractGenericService<Topic, Integer> implements ITopicService{

	@SuppressWarnings("unused")
	private TopicMapper topicMapper;

	@Resource
	public void setTopicMapper(TopicMapper topicMapper) {
		this.topicMapper = topicMapper;
		super.setMapper(topicMapper);
	}
}
