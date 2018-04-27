package com.dylbur.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dylbur.model.Test;
import com.dylbur.repos.TestRepo;

@Service
public class TestService {
	//Autowired TestRepo
	@Autowired
	private TestRepo tr;

	public Test create(Test t) {
		return tr.saveAndFlush(t);
	}

	public List<Test> findAll() {
		return tr.findAll();
	}

	public Test findOne(int id) {
		return tr.findOne(id);
	}

}
