package com.docker.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.serivce.PersistData;


@RestController
public class FirstController {
	
	
	@Autowired
	PersistData persistData;
	@RequestMapping(path="/api/{name}")
	public Map<String , String> print(@PathVariable("name") String name)
	{
		return persistData.saveEmployee(name);
		 
	}

}
