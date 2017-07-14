package com.docker.dao.Impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.docker.dao.PersistEmployee;
import com.docker.model.Employee;

@Repository(value="persistEmployee")
public class PersistEmployeeData implements PersistEmployee {
	
	protected final SessionFactory sessionFactory;

	public PersistEmployeeData(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public String saveEmployeeData(Employee emp) {
		
		return (String)sessionFactory.getCurrentSession().save(emp);		
		
	
	}

}
