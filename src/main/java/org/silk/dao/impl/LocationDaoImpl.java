package org.silk.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.silk.dao.IDao;
import org.silk.dao.LocationDao;
import org.silk.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LocationDaoImpl implements LocationDao {

	@Autowired
	private SessionFactory session;
	
	@Override
	public Location get(long id) {
		return (Location)session.getCurrentSession().get(Location.class, id);
	}

	@Override
	public List<Location> list() {
		return session.getCurrentSession().createQuery("from Location").list();
	}



}
