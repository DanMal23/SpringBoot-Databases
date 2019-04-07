package com.mysql.db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.db.dao.PreposisjonDao;
import com.mysql.db.model.Preposisjon;

@RestController
@RequestMapping(value = "/preposisjoner")
public class PreposisjonController {
	
	@Autowired
	PreposisjonDao preposisjonDao;

	@PostMapping(value = "/addOrd")
	public List<Preposisjon> persist(@RequestBody final Preposisjon preposisjoner) {
		preposisjonDao.save(preposisjoner);
		return preposisjonDao.findAll();
	}
	
	@GetMapping(value = "/getOrd")
	public List<Preposisjon> getAll() {
		return preposisjonDao.findAll();
	}


	
	
	
	
}
