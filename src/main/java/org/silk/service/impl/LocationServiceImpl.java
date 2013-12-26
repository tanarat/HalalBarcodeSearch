package org.silk.service.impl;

import java.util.List;

import org.silk.dao.LocationDao;
import org.silk.model.Location;
import org.silk.service.LocaionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LocationServiceImpl implements LocaionService {

	@Autowired
	private LocationDao dao;
	
	@Transactional
	public Location get(long id) {
		return (Location)dao.get(id);
	}

	@Transactional
	public List<Location> list() {
		return dao.list();
	}

}
