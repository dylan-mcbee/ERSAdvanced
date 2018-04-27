package com.dylbur.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dylbur.model.Test;
import com.dylbur.services.TestService;

@RestController
@RequestMapping("tests")
@CrossOrigin(origins = "http://localhost:4200")
public class TestController {

	@Autowired
	private TestService ts;

	@GetMapping
	public List<Test> getAllTests() {
		return ts.findAll();
	}

	@GetMapping("{id}")
	public Test getXById(@PathVariable int id) {
		return ts.findOne(id);
	}

	@PostMapping
	public Test create(@RequestBody Test t) {
		return ts.create(t);
	}

}
