package com.docker.serivceImpl;

import java.util.HashMap;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.docker.dao.PersistEmployee;
import com.docker.model.Employee;
import com.docker.serivce.PersistData;

@Service(value="persistData")
public class PersistDataImpl implements PersistData {

	@Autowired
	PersistEmployee  persistEmployee;
	@Override
	@Transactional
	public Map<String, String> saveEmployee(String name) {
		
		Employee emp=new Employee();
		emp.setName(name);
		String id = persistEmployee.saveEmployeeData(emp);	
		Map<String, String> map=new HashMap<String, String>();
		map.put("id", id);
		
		return map;
	}
	
	

}
