package com.lhb.generic;

import java.util.List;

public interface IGenericService<T, ID> {

	void setMapper(IGenericMapper<T, ID> iGenericMapper);

	boolean save(T t);

	boolean batchSave(List<T> list);

	boolean delete(ID id);

	boolean batchDelete(List<ID> list);

	boolean update(T t);

	T selectOne(ID id);

	List<T> selectAll(T t);
}
