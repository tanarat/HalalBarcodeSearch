package org.silk.dao;

import java.util.List;

import org.silk.model.IModelBase;

public interface IDao <T extends IModelBase>{
	public T get(long id);
	public List<T> list();
}
