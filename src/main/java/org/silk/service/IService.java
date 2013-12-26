package org.silk.service;

import java.util.List;

import org.silk.model.IModelBase;

public interface IService <T extends IModelBase>{
	public T get(long id);
	public List<T> list();
}
