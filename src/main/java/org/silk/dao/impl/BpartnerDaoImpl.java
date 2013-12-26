package org.silk.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.silk.dao.BpartnerDao;
import org.silk.model.Bpartner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BpartnerDaoImpl implements BpartnerDao {

	@Autowired
	private SessionFactory session;
	
	@Override
	public Bpartner get(long id) {
		return (Bpartner)session.getCurrentSession().get(Bpartner.class, id);
	}

	@Override
	public List<Bpartner> list() {
		return session.getCurrentSession().createQuery("from Bpartner").list();
	}

}
