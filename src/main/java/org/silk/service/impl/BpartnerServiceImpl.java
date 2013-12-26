package org.silk.service.impl;

import java.util.List;

import org.silk.dao.BpartnerDao;
import org.silk.dao.LocationDao;
import org.silk.model.Bpartner;
import org.silk.service.BpartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BpartnerServiceImpl implements BpartnerService {

	@Autowired
	private BpartnerDao dao;
	
	@Transactional
	public Bpartner get(long id) {
		return (Bpartner)dao.get(id);
	}

	@Transactional
	public List<Bpartner> list() {
		return dao.list();
	}

}
