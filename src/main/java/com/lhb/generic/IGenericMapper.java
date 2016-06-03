package com.lhb.generic;

import java.util.List;

public interface IGenericMapper<T, ID> {

	Integer save(T t);

	Integer batchSave(List<T> list);

	Integer delete(ID id);

	Integer batchDelete(List<ID> list);

	Integer update(T t);

	T selectOne(ID id);

	List<T> selectAll(T t);

}
