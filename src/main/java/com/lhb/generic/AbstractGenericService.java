package com.lhb.generic;

import java.util.List;

import javax.annotation.Resource;

import com.lhb.generic.IGenericMapper;
import com.lhb.generic.IGenericService;

public abstract class AbstractGenericService<T, ID> implements IGenericService<T, ID> {

	private IGenericMapper<T, ID> iGenericMapper;

	@Override
	public void setMapper(IGenericMapper<T, ID> iGenericMapper) {
		this.iGenericMapper = iGenericMapper;
	}

	@Override
	public boolean save(T t) {
		// TODO Auto-generated method stub
		return retBool(iGenericMapper.save(t));
	}

	@Override
	public boolean batchSave(List<T> list) {
		// TODO Auto-generated method stub
		return retBool(iGenericMapper.batchSave(list));
	}

	@Override
	public boolean delete(ID id) {
		// TODO Auto-generated method stub
		return retBool(iGenericMapper.delete(id));
	}

	@Override
	public boolean batchDelete(List<ID> list) {
		// TODO Auto-generated method stub
		return retBool(iGenericMapper.batchDelete(list));
	}

	@Override
	public boolean update(T t) {
		// TODO Auto-generated method stub
		return retBool(iGenericMapper.update(t));
	}

	@Override
	public T selectOne(ID id) {
		// TODO Auto-generated method stub
		return iGenericMapper.selectOne(id);
	}

	@Override
	public List<T> selectAll(T t) {
		return iGenericMapper.selectAll(t);
		// TODO Auto-generated method stub
	}

	/**
	 * 判断数据库操作是否成功
	 * 
	 * @param result
	 *            数据库操作返回影响条数
	 * @return boolean
	 */
	protected boolean retBool(int result) {
		return (result >= 0) ? true : false;
	}

}
